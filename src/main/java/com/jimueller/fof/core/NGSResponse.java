package com.jimueller.fof.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NGSResponse {
    @JsonProperty("ID")
    private String id;
    private String nadconVersion;
    private String srcDatum;
    private String destDatum;
    private String srcLat;
    private String srcLatDms;
    private String destLat;
    private String destLatDms;
    private String sigLat;
    private String srcLon;
    private String srcLonDms;
    private String destLon;
    private String destLonDms;
    private String sigLon;
    private String srcEht;
    private String destEht;
    private String sigEht;
    private String spcZone;
    private String spcNorthing_m;
    private String spcEasting_m;
    private String spcNorthing_usft;
    private String spcEasting_usft;
    private String spcNorthing_ift;
    private String spcEasting_ift;
    private String spcConvergence;
    private String spcScaleFactor;
    private String spcCombinedFactor;
    private String utmZone;
    private String utmNorthing;
    private String utmEasting;
    private String utmConvergence;
    private String utmScaleFactor;
    private String utmCombinedFactor;
    private String x;
    private String y;
    private String z;
    private String usng;


    // Getter Methods

    public String getID() {
        return id;
    }

    public String getNadconVersion() {
        return nadconVersion;
    }

    public String getSrcDatum() {
        return srcDatum;
    }

    public String getDestDatum() {
        return destDatum;
    }

    public String getSrcLat() {
        return srcLat;
    }

    public String getSrcLatDms() {
        return srcLatDms;
    }

    public String getDestLat() {
        return destLat;
    }

    public String getDestLatDms() {
        return destLatDms;
    }

    public String getSigLat() {
        return sigLat;
    }

    public String getSrcLon() {
        return srcLon;
    }

    public String getSrcLonDms() {
        return srcLonDms;
    }

    public String getDestLon() {
        return destLon;
    }

    public String getDestLonDms() {
        return destLonDms;
    }

    public String getSigLon() {
        return sigLon;
    }

    public String getSrcEht() {
        return srcEht;
    }

    public String getDestEht() {
        return destEht;
    }

    public String getSigEht() {
        return sigEht;
    }

    public String getSpcZone() {
        return spcZone;
    }

    public String getSpcNorthing_m() {
        return spcNorthing_m;
    }

    public String getSpcEasting_m() {
        return spcEasting_m;
    }

    public String getSpcNorthing_usft() {
        return spcNorthing_usft;
    }

    public String getSpcEasting_usft() {
        return spcEasting_usft;
    }

    public String getSpcNorthing_ift() {
        return spcNorthing_ift;
    }

    public String getSpcEasting_ift() {
        return spcEasting_ift;
    }

    public String getSpcConvergence() {
        return spcConvergence;
    }

    public String getSpcScaleFactor() {
        return spcScaleFactor;
    }

    public String getSpcCombinedFactor() {
        return spcCombinedFactor;
    }

    public String getUtmZone() {
        return utmZone;
    }

    public String getUtmNorthing() {
        return utmNorthing;
    }

    public String getUtmEasting() {
        return utmEasting;
    }

    public String getUtmConvergence() {
        return utmConvergence;
    }

    public String getUtmScaleFactor() {
        return utmScaleFactor;
    }

    public String getUtmCombinedFactor() {
        return utmCombinedFactor;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getZ() {
        return z;
    }

    public String getUsng() {
        return usng;
    }

    // Setter Methods

    public void setID(String id) {
        this.id = id;
    }

    public void setNadconVersion(String nadconVersion) {
        this.nadconVersion = nadconVersion;
    }

    public void setSrcDatum(String srcDatum) {
        this.srcDatum = srcDatum;
    }

    public void setDestDatum(String destDatum) {
        this.destDatum = destDatum;
    }

    public void setSrcLat(String srcLat) {
        this.srcLat = srcLat;
    }

    public void setSrcLatDms(String srcLatDms) {
        this.srcLatDms = srcLatDms;
    }

    public void setDestLat(String destLat) {
        this.destLat = destLat;
    }

    public void setDestLatDms(String destLatDms) {
        this.destLatDms = destLatDms;
    }

    public void setSigLat(String sigLat) {
        this.sigLat = sigLat;
    }

    public void setSrcLon(String srcLon) {
        this.srcLon = srcLon;
    }

    public void setSrcLonDms(String srcLonDms) {
        this.srcLonDms = srcLonDms;
    }

    public void setDestLon(String destLon) {
        this.destLon = destLon;
    }

    public void setDestLonDms(String destLonDms) {
        this.destLonDms = destLonDms;
    }

    public void setSigLon(String sigLon) {
        this.sigLon = sigLon;
    }

    public void setSrcEht(String srcEht) {
        this.srcEht = srcEht;
    }

    public void setDestEht(String destEht) {
        this.destEht = destEht;
    }

    public void setSigEht(String sigEht) {
        this.sigEht = sigEht;
    }

    public void setSpcZone(String spcZone) {
        this.spcZone = spcZone;
    }

    public void setSpcNorthing_m(String spcNorthing_m) {
        this.spcNorthing_m = spcNorthing_m;
    }

    public void setSpcEasting_m(String spcEasting_m) {
        this.spcEasting_m = spcEasting_m;
    }

    public void setSpcNorthing_usft(String spcNorthing_usft) {
        this.spcNorthing_usft = spcNorthing_usft;
    }

    public void setSpcEasting_usft(String spcEasting_usft) {
        this.spcEasting_usft = spcEasting_usft;
    }

    public void setSpcNorthing_ift(String spcNorthing_ift) {
        this.spcNorthing_ift = spcNorthing_ift;
    }

    public void setSpcEasting_ift(String spcEasting_ift) {
        this.spcEasting_ift = spcEasting_ift;
    }

    public void setSpcConvergence(String spcConvergence) {
        this.spcConvergence = spcConvergence;
    }

    public void setSpcScaleFactor(String spcScaleFactor) {
        this.spcScaleFactor = spcScaleFactor;
    }

    public void setSpcCombinedFactor(String spcCombinedFactor) {
        this.spcCombinedFactor = spcCombinedFactor;
    }

    public void setUtmZone(String utmZone) {
        this.utmZone = utmZone;
    }

    public void setUtmNorthing(String utmNorthing) {
        this.utmNorthing = utmNorthing;
    }

    public void setUtmEasting(String utmEasting) {
        this.utmEasting = utmEasting;
    }

    public void setUtmConvergence(String utmConvergence) {
        this.utmConvergence = utmConvergence;
    }

    public void setUtmScaleFactor(String utmScaleFactor) {
        this.utmScaleFactor = utmScaleFactor;
    }

    public void setUtmCombinedFactor(String utmCombinedFactor) {
        this.utmCombinedFactor = utmCombinedFactor;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public void setUsng(String usng) {
        this.usng = usng;
    }
}