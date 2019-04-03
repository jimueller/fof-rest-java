package com.jimueller.fof.core;

import com.jimueller.fof.api.Address;
import com.smartystreets.api.ClientBuilder;
import com.smartystreets.api.StaticCredentials;
import com.smartystreets.api.exceptions.SmartyException;
import com.smartystreets.api.us_street.Candidate;
import com.smartystreets.api.us_street.Client;
import com.smartystreets.api.us_street.Lookup;
import com.smartystreets.api.us_street.MatchType;

import java.io.IOException;
import java.util.List;

public class SmStreetsAddressValidator implements AddressValidator {
    @Override
    public Address validate(Address address) {
        Address result;

        String authId = System.getenv("SM_STR_API_AUTH_ID");
        String token = System.getenv("SM_STR_API_TOKEN");
        StaticCredentials credentials = new StaticCredentials(authId,token);
        Client client = new ClientBuilder(credentials).buildUsStreetApiClient();

        Lookup lookup = new Lookup();
        lookup.setStreet(address.getStreet());
        lookup.setCity(address.getCity());
        lookup.setState(address.getState());
        lookup.setZipCode(address.getZip4());
        lookup.setMatch(MatchType.INVALID);

        try {
            client.send(lookup);
        } catch (SmartyException ex){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }

        List<Candidate> results = lookup.getResult();

        if(results.isEmpty()){
            result = new Address(address);
            result.setValid(false);
        } else {
            // Just assume the first candidate is correct :)
            Candidate c = results.get(0);
            result = new Address(
                  c.getDeliveryLine1(),
                    c.getComponents().getCityName(),
                    c.getComponents().getState(),
                    c.getComponents().getZipCode(),
                    c.getComponents().getPlus4Code(),
                    true
          );
        }

        return result;
    }
}

