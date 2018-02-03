---INSERTS

--- CLUB
INSERT INTO club VALUES
  (nextval('club_club_id_seq'),'Martinsville Movers','MOVE');

INSERT INTO club VALUES
  (nextval('club_club_id_seq'),'Jacksonville Journeymen','JACK');

INSERT INTO club VALUES
  (nextval('club_club_id_seq'),'San Antonio Stalkers','SAST');

INSERT INTO club VALUES
  (nextval('club_club_id_seq'),'Raleigh Rangers','RARA');

INSERT INTO club VALUES
  (nextval('club_club_id_seq'),'Portland Navigators','PORT');

--- LOCATION

INSERT INTO location VALUES
  (nextval('location_loc_id_seq'),'East Side Orienteering course','1247 Washington Ave.','Darlington','SC','29532');

INSERT INTO location VALUES
  (nextval('location_loc_id_seq'),'Two Owls Forest Center','34653 W. 42nd St.','Albany','NY','12208');

INSERT INTO location VALUES
  (nextval('location_loc_id_seq'),'Penn State Outland Adventures','83299 Mason St.','West Chester','PA','19382');

INSERT INTO location VALUES
  (nextval('location_loc_id_seq'),'Buckeye Overland Trails','7702 Bent Oak Blvd.','Canton','OH','44704');

INSERT INTO location VALUES
  (nextval('location_loc_id_seq'),'Hayseed Farms','419992 I-35 South','Des Moines','IA','50309');

--- AGE GROUP

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M-10');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M-12');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M-14');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M-16');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M-18');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M-20');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M21+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M35+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M40+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M45+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M50+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M55+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M60+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M65+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'M70+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F-10');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F-12');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F-14');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F-16');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F-18');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F-20');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F21+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F35+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F40+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F45+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F50+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F55+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F60+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F65+');

INSERT INTO age_group VALUES
  (nextval('age_group_age_group_id_seq'), 'F70+');

--- MEET

INSERT INTO meet VALUES
  (nextval('meet_meet_id_seq'), 'Westfield competition', '1000');

INSERT INTO meet VALUES
  (nextval('meet_meet_id_seq'), 'New England Regional', '1004');

INSERT INTO meet VALUES
  (nextval('meet_meet_id_seq'), 'Southwest Sectional', '1003');

INSERT INTO meet VALUES
  (nextval('meet_meet_id_seq'), 'Lakeland Qualifier', '1003');

INSERT INTO meet VALUES
  (nextval('meet_meet_id_seq'), 'Twin Pines Triangular', '1002');

INSERT INTO meet VALUES
  (nextval('meet_meet_id_seq'), 'Oakfield Run', '1001');

INSERT INTO meet VALUES
  (nextval('meet_meet_id_seq'), 'National Semi-Finals', '1001');

--- COMPETITION

INSERT INTO competition VALUES
  (nextval('competition_comp_id_seq'), TO_DATE('01/05/2005', 'mm/dd/yyyy'), '00001', '00001');

INSERT INTO competition VALUES
  (nextval('competition_comp_id_seq'), TO_DATE('03/12/2005', 'mm/dd/yyyy'), '00002', '00002');

INSERT INTO competition VALUES
  (nextval('competition_comp_id_seq'), TO_DATE('04/17/2005', 'mm/dd/yyyy'), '00003', '00003');

INSERT INTO competition VALUES
  (nextval('competition_comp_id_seq'), TO_DATE('06/23/2005', 'mm/dd/yyyy'), '00004', '00004');

INSERT INTO competition VALUES
  (nextval('competition_comp_id_seq'), TO_DATE('08/25/2005', 'mm/dd/yyyy'), '00004', '00005');

INSERT INTO competition VALUES
  (nextval('competition_comp_id_seq'), TO_DATE('09/08/2005', 'mm/dd/yyyy'), '00005', '00006');

INSERT INTO competition VALUES
  (nextval('competition_comp_id_seq'), TO_DATE('10/15/2005', 'mm/dd/yyyy'), '00005', '00007');

--- COURSE

INSERT INTO course VALUES
  (nextval('course_course_id_seq'), '13453.12', '175.34', '24', '00001');

INSERT INTO course VALUES
  (nextval('course_course_id_seq'), '27324.54', '97.22', '32', '00002');

INSERT INTO course VALUES
  (nextval('course_course_id_seq'), '15352.45', '223.34', '21', '00003');

INSERT INTO course VALUES
  (nextval('course_course_id_seq'), '21235.75', '122.45', '28', '00004');

INSERT INTO course VALUES
  (nextval('course_course_id_seq'), '18465.98', '45.86', '33', '00005');

INSERT INTO course VALUES
  (nextval('course_course_id_seq'), '13564.59', '301.34', '30', '00006');

INSERT INTO course VALUES
  (nextval('course_course_id_seq'), '20345.42', '223.69', '26', '00007');

--- COMPETES ON

INSERT INTO competes_on VALUES
  ('00001', '01');

INSERT INTO competes_on VALUES
  ('00001', '02');

INSERT INTO competes_on VALUES
  ('00001', '03');

INSERT INTO competes_on VALUES
  ('00001', '04');

INSERT INTO competes_on VALUES
  ('00001', '05');

INSERT INTO competes_on VALUES
  ('00001', '06');

INSERT INTO competes_on VALUES
  ('00001', '07');

INSERT INTO competes_on VALUES
  ('00001', '08');

INSERT INTO competes_on VALUES
  ('00001', '09');

INSERT INTO competes_on VALUES
  ('00001', '10');

INSERT INTO competes_on VALUES
  ('00001', '11');

INSERT INTO competes_on VALUES
  ('00001', '12');

INSERT INTO competes_on VALUES
  ('00001', '13');

INSERT INTO competes_on VALUES
  ('00001', '14');

INSERT INTO competes_on VALUES
  ('00001', '15');

INSERT INTO competes_on VALUES
  ('00001', '16');

INSERT INTO competes_on VALUES
  ('00001', '17');

INSERT INTO competes_on VALUES
  ('00001', '18');

INSERT INTO competes_on VALUES
  ('00001', '19');

INSERT INTO competes_on VALUES
  ('00001', '20');

INSERT INTO competes_on VALUES
  ('00001', '21');

INSERT INTO competes_on VALUES
  ('00001', '22');

INSERT INTO competes_on VALUES
  ('00001', '23');

INSERT INTO competes_on VALUES
  ('00001', '24');

INSERT INTO competes_on VALUES
  ('00001', '25');

INSERT INTO competes_on VALUES
  ('00001', '26');

INSERT INTO competes_on VALUES
  ('00001', '27');

INSERT INTO competes_on VALUES
  ('00001', '28');

INSERT INTO competes_on VALUES
  ('00001', '29');

INSERT INTO competes_on VALUES
  ('00001', '30');

INSERT INTO competes_on VALUES
  ('00002', '01');

INSERT INTO competes_on VALUES
  ('00002', '02');

INSERT INTO competes_on VALUES
  ('00002', '03');

INSERT INTO competes_on VALUES
  ('00002', '04');

INSERT INTO competes_on VALUES
  ('00002', '05');

INSERT INTO competes_on VALUES
  ('00002', '06');

INSERT INTO competes_on VALUES
  ('00002', '07');

INSERT INTO competes_on VALUES
  ('00002', '08');

INSERT INTO competes_on VALUES
  ('00002', '09');

INSERT INTO competes_on VALUES
  ('00002', '10');

INSERT INTO competes_on VALUES
  ('00002', '11');

INSERT INTO competes_on VALUES
  ('00002', '12');

INSERT INTO competes_on VALUES
  ('00002', '13');

INSERT INTO competes_on VALUES
  ('00002', '14');

INSERT INTO competes_on VALUES
  ('00002', '15');

INSERT INTO competes_on VALUES
  ('00002', '16');

INSERT INTO competes_on VALUES
  ('00002', '17');

INSERT INTO competes_on VALUES
  ('00002', '18');

INSERT INTO competes_on VALUES
  ('00002', '19');

INSERT INTO competes_on VALUES
  ('00002', '20');

INSERT INTO competes_on VALUES
  ('00002', '21');

INSERT INTO competes_on VALUES
  ('00002', '22');

INSERT INTO competes_on VALUES
  ('00002', '23');

INSERT INTO competes_on VALUES
  ('00002', '24');

INSERT INTO competes_on VALUES
  ('00002', '25');

INSERT INTO competes_on VALUES
  ('00002', '26');

INSERT INTO competes_on VALUES
  ('00002', '27');

INSERT INTO competes_on VALUES
  ('00002', '28');

INSERT INTO competes_on VALUES
  ('00002', '29');

INSERT INTO competes_on VALUES
  ('00002', '30');

INSERT INTO competes_on VALUES
  ('00003', '01');

INSERT INTO competes_on VALUES
  ('00003', '02');

INSERT INTO competes_on VALUES
  ('00003', '03');

INSERT INTO competes_on VALUES
  ('00003', '04');

INSERT INTO competes_on VALUES
  ('00003', '05');

INSERT INTO competes_on VALUES
  ('00003', '06');

INSERT INTO competes_on VALUES
  ('00003', '07');

INSERT INTO competes_on VALUES
  ('00003', '08');

INSERT INTO competes_on VALUES
  ('00003', '09');

INSERT INTO competes_on VALUES
  ('00003', '10');

INSERT INTO competes_on VALUES
  ('00003', '11');

INSERT INTO competes_on VALUES
  ('00003', '12');

INSERT INTO competes_on VALUES
  ('00003', '13');

INSERT INTO competes_on VALUES
  ('00003', '14');

INSERT INTO competes_on VALUES
  ('00003', '15');

INSERT INTO competes_on VALUES
  ('00003', '16');

INSERT INTO competes_on VALUES
  ('00003', '17');

INSERT INTO competes_on VALUES
  ('00003', '18');

INSERT INTO competes_on VALUES
  ('00003', '19');

INSERT INTO competes_on VALUES
  ('00003', '20');

INSERT INTO competes_on VALUES
  ('00003', '21');

INSERT INTO competes_on VALUES
  ('00003', '22');

INSERT INTO competes_on VALUES
  ('00003', '23');

INSERT INTO competes_on VALUES
  ('00003', '24');

INSERT INTO competes_on VALUES
  ('00003', '25');

INSERT INTO competes_on VALUES
  ('00003', '26');

INSERT INTO competes_on VALUES
  ('00003', '27');

INSERT INTO competes_on VALUES
  ('00003', '28');

INSERT INTO competes_on VALUES
  ('00003', '29');

INSERT INTO competes_on VALUES
  ('00003', '30');

INSERT INTO competes_on VALUES
  ('00004', '01');

INSERT INTO competes_on VALUES
  ('00004', '02');

INSERT INTO competes_on VALUES
  ('00004', '03');

INSERT INTO competes_on VALUES
  ('00004', '04');

INSERT INTO competes_on VALUES
  ('00004', '05');

INSERT INTO competes_on VALUES
  ('00004', '06');

INSERT INTO competes_on VALUES
  ('00004', '07');

INSERT INTO competes_on VALUES
  ('00004', '08');

INSERT INTO competes_on VALUES
  ('00004', '09');

INSERT INTO competes_on VALUES
  ('00004', '10');

INSERT INTO competes_on VALUES
  ('00004', '11');

INSERT INTO competes_on VALUES
  ('00004', '12');

INSERT INTO competes_on VALUES
  ('00004', '13');

INSERT INTO competes_on VALUES
  ('00004', '14');

INSERT INTO competes_on VALUES
  ('00004', '15');

INSERT INTO competes_on VALUES
  ('00004', '16');

INSERT INTO competes_on VALUES
  ('00004', '17');

INSERT INTO competes_on VALUES
  ('00004', '18');

INSERT INTO competes_on VALUES
  ('00004', '19');

INSERT INTO competes_on VALUES
  ('00004', '20');

INSERT INTO competes_on VALUES
  ('00004', '21');

INSERT INTO competes_on VALUES
  ('00004', '22');

INSERT INTO competes_on VALUES
  ('00004', '23');

INSERT INTO competes_on VALUES
  ('00004', '24');

INSERT INTO competes_on VALUES
  ('00004', '25');

INSERT INTO competes_on VALUES
  ('00004', '26');

INSERT INTO competes_on VALUES
  ('00004', '27');

INSERT INTO competes_on VALUES
  ('00004', '28');

INSERT INTO competes_on VALUES
  ('00004', '29');

INSERT INTO competes_on VALUES
  ('00004', '30');

INSERT INTO competes_on VALUES
  ('00005', '01');

INSERT INTO competes_on VALUES
  ('00005', '02');

INSERT INTO competes_on VALUES
  ('00005', '03');

INSERT INTO competes_on VALUES
  ('00005', '04');

INSERT INTO competes_on VALUES
  ('00005', '05');

INSERT INTO competes_on VALUES
  ('00005', '06');

INSERT INTO competes_on VALUES
  ('00005', '07');

INSERT INTO competes_on VALUES
  ('00005', '08');

INSERT INTO competes_on VALUES
  ('00005', '09');

INSERT INTO competes_on VALUES
  ('00005', '10');

INSERT INTO competes_on VALUES
  ('00005', '11');

INSERT INTO competes_on VALUES
  ('00005', '12');

INSERT INTO competes_on VALUES
  ('00005', '13');

INSERT INTO competes_on VALUES
  ('00005', '14');

INSERT INTO competes_on VALUES
  ('00005', '15');

INSERT INTO competes_on VALUES
  ('00005', '16');

INSERT INTO competes_on VALUES
  ('00005', '17');

INSERT INTO competes_on VALUES
  ('00005', '18');

INSERT INTO competes_on VALUES
  ('00005', '19');

INSERT INTO competes_on VALUES
  ('00005', '20');

INSERT INTO competes_on VALUES
  ('00005', '21');

INSERT INTO competes_on VALUES
  ('00005', '22');

INSERT INTO competes_on VALUES
  ('00005', '23');

INSERT INTO competes_on VALUES
  ('00005', '24');

INSERT INTO competes_on VALUES
  ('00005', '25');

INSERT INTO competes_on VALUES
  ('00005', '26');

INSERT INTO competes_on VALUES
  ('00005', '27');

INSERT INTO competes_on VALUES
  ('00005', '28');

INSERT INTO competes_on VALUES
  ('00005', '29');

INSERT INTO competes_on VALUES
  ('00005', '30');

INSERT INTO competes_on VALUES
  ('00006', '01');

INSERT INTO competes_on VALUES
  ('00006', '02');

INSERT INTO competes_on VALUES
  ('00006', '03');

INSERT INTO competes_on VALUES
  ('00006', '04');

INSERT INTO competes_on VALUES
  ('00006', '05');

INSERT INTO competes_on VALUES
  ('00006', '06');

INSERT INTO competes_on VALUES
  ('00006', '07');

INSERT INTO competes_on VALUES
  ('00006', '08');

INSERT INTO competes_on VALUES
  ('00006', '09');

INSERT INTO competes_on VALUES
  ('00006', '10');

INSERT INTO competes_on VALUES
  ('00006', '11');

INSERT INTO competes_on VALUES
  ('00006', '12');

INSERT INTO competes_on VALUES
  ('00006', '13');

INSERT INTO competes_on VALUES
  ('00006', '14');

INSERT INTO competes_on VALUES
  ('00006', '15');

INSERT INTO competes_on VALUES
  ('00006', '16');

INSERT INTO competes_on VALUES
  ('00006', '17');

INSERT INTO competes_on VALUES
  ('00006', '18');

INSERT INTO competes_on VALUES
  ('00006', '19');

INSERT INTO competes_on VALUES
  ('00006', '20');

INSERT INTO competes_on VALUES
  ('00006', '21');

INSERT INTO competes_on VALUES
  ('00006', '22');

INSERT INTO competes_on VALUES
  ('00006', '23');

INSERT INTO competes_on VALUES
  ('00006', '24');

INSERT INTO competes_on VALUES
  ('00006', '25');

INSERT INTO competes_on VALUES
  ('00006', '26');

INSERT INTO competes_on VALUES
  ('00006', '27');

INSERT INTO competes_on VALUES
  ('00006', '28');

INSERT INTO competes_on VALUES
  ('00006', '29');

INSERT INTO competes_on VALUES
  ('00006', '30');

INSERT INTO competes_on VALUES
  ('00007', '01');

INSERT INTO competes_on VALUES
  ('00007', '02');

INSERT INTO competes_on VALUES
  ('00007', '03');

INSERT INTO competes_on VALUES
  ('00007', '04');

INSERT INTO competes_on VALUES
  ('00007', '05');

INSERT INTO competes_on VALUES
  ('00007', '06');

INSERT INTO competes_on VALUES
  ('00007', '07');

INSERT INTO competes_on VALUES
  ('00007', '08');

INSERT INTO competes_on VALUES
  ('00007', '09');

INSERT INTO competes_on VALUES
  ('00007', '10');

INSERT INTO competes_on VALUES
  ('00007', '11');

INSERT INTO competes_on VALUES
  ('00007', '12');

INSERT INTO competes_on VALUES
  ('00007', '13');

INSERT INTO competes_on VALUES
  ('00007', '14');

INSERT INTO competes_on VALUES
  ('00007', '15');

INSERT INTO competes_on VALUES
  ('00007', '16');

INSERT INTO competes_on VALUES
  ('00007', '17');

INSERT INTO competes_on VALUES
  ('00007', '18');

INSERT INTO competes_on VALUES
  ('00007', '19');

INSERT INTO competes_on VALUES
  ('00007', '20');

INSERT INTO competes_on VALUES
  ('00007', '21');

INSERT INTO competes_on VALUES
  ('00007', '22');

INSERT INTO competes_on VALUES
  ('00007', '23');

INSERT INTO competes_on VALUES
  ('00007', '24');

INSERT INTO competes_on VALUES
  ('00007', '25');

INSERT INTO competes_on VALUES
  ('00007', '26');

INSERT INTO competes_on VALUES
  ('00007', '27');

INSERT INTO competes_on VALUES
  ('00007', '28');

INSERT INTO competes_on VALUES
  ('00007', '29');

INSERT INTO competes_on VALUES
  ('00007', '30');

--- MEMBER

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Smith', 'Steve', 'M', TO_DATE('03/06/1981', 'mm/dd/yyyy'), 'M', '13987 Concord St.', 'Charlotte', 'NC', '54314', TO_DATE('01/01/2008', 'mm/dd/yyyy'), '07', '1000');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Leftwich', 'Dakota', 'U', TO_DATE('06/12/1982', 'mm/dd/yyyy'), 'F', '1987 CK St.', 'Daytona', 'FL', '34214', TO_DATE('01/01/2009', 'mm/dd/yyyy'), '22', '1000');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Vick', 'Michael', 'I', TO_DATE('09/18/1983', 'mm/dd/yyyy'), 'M', '1398 Corvette St.', 'Milwaukee', 'WI', '90234', TO_DATE('01/01/2007', 'mm/dd/yyyy'), '07', '1000');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Vick', 'Michelle', 'P', TO_DATE('12/24/1984', 'mm/dd/yyyy'), 'F', '1387 Cobalt St.', 'Jacksonville', 'FL', '09234', TO_DATE('01/01/2006', 'mm/dd/yyyy'), '22', '1000');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Depp', 'Johnny', 'D', TO_DATE('01/03/1985', 'mm/dd/yyyy'), 'M', '3987 Corvair St.', 'Martinsville', 'NC', '73234', TO_DATE('01/01/2012', 'mm/dd/yyyy'), '07', '1000');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Walker', 'Katie', 'J', TO_DATE('04/06/1986', 'mm/dd/yyyy'), 'F', '1358 Cavalier St.', 'Concord', 'NC', '83452', TO_DATE('01/01/2011', 'mm/dd/yyyy'), '21', '1000');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Driver', 'Donald', 'K', TO_DATE('07/09/1987', 'mm/dd/yyyy'), 'M', '1237 Nova St.', 'New York', 'NY', '31245', TO_DATE('01/01/2010', 'mm/dd/yyyy'), '06', '1001');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Ferguson', 'Carlie', 'M', TO_DATE('10/12/1988', 'mm/dd/yyyy'), 'F', '2387 Malibu St.', 'Denver', 'CO', '12563', TO_DATE('01/01/2008', 'mm/dd/yyyy'), '20', '1001');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Lee', 'Donald', 'L', TO_DATE('02/15/1989', 'mm/dd/yyyy'), 'M', '1323 Bel Air St.', 'South Park', 'CO', '34020', TO_DATE('01/01/2009', 'mm/dd/yyyy'), '05', '1001');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Chatman', 'Angelina', 'Z', TO_DATE('05/18/1990', 'mm/dd/yyyy'), 'F', '1267 Biscayne St.', 'Winona', 'MN', '81483', TO_DATE('01/01/2008', 'mm/dd/yyyy'), '19', '1001');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Jackson', 'Steven', 'X', TO_DATE('08/21/1981', 'mm/dd/yyyy'), 'M', '13426 Impala St.', 'Darlington', 'NC', '73452', TO_DATE('01/01/2006', 'mm/dd/yyyy'), '07', '1002');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Moss', 'Jenna', 'A', TO_DATE('11/24/1991', 'mm/dd/yyyy'), 'F', '15587 Chevy II St.', 'Miami', 'FL', '34724', TO_DATE('01/01/2009', 'mm/dd/yyyy'), '19', '1002');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Moss', 'Randy', 'T', TO_DATE('03/27/1951', 'mm/dd/yyyy'), 'M', '13787 Camaro St.', 'Salt Lake City', 'UT', '89604', TO_DATE('01/01/2007', 'mm/dd/yyyy'), '12', '1002');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Giovanni', 'Shari', 'H', TO_DATE('06/30/1965', 'mm/dd/yyyy'), 'F', '5987 El Camino St.', 'Los Angeles', 'CA', '82379', TO_DATE('01/01/2013', 'mm/dd/yyyy'), '24', '1002');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Woodson', 'Charles', 'E', TO_DATE('09/02/1973', 'mm/dd/yyyy'), 'M', '1687 Chevelle St.', 'Oakland', 'CA', '23914', TO_DATE('01/01/2011', 'mm/dd/yyyy'), '07', '1003');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Knightley', 'Keira', 'N', TO_DATE('12/05/1982', 'mm/dd/yyyy'), 'F', '67 442nd St.', 'Compton', 'CA', '12557', TO_DATE('01/01/2012', 'mm/dd/yyyy'), '22', '1003');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Smith', 'Steven', 'A', TO_DATE('01/08/1978', 'mm/dd/yyyy'), 'M', '1787 Classic St.', 'Seattle', 'WA', '45723', TO_DATE('01/01/2010', 'mm/dd/yyyy'), '07', '1003');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Reid', 'Tara', 'Y', TO_DATE('04/11/1953', 'mm/dd/yyyy'), 'F', '137 SSR St.', 'Trenton', 'NJ', '27624', TO_DATE('01/01/2009', 'mm/dd/yyyy'), '26', '1003');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Jackson', 'Joshua', 'L', TO_DATE('07/14/1940', 'mm/dd/yyyy'), 'M', '13 Cutlass St.', 'Oshkosh', 'WI', '54904', TO_DATE('01/01/2008', 'mm/dd/yyyy'), '14', '1004');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Tamblyn', 'Amber', 'B', TO_DATE('10/17/1954', 'mm/dd/yyyy'), 'F', '153 Monte Carlo St.', 'Chicago', 'IL', '56734', TO_DATE('01/01/2007', 'mm/dd/yyyy'), '26', '1004');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Sanders', 'Deion', 'E', TO_DATE('02/20/1969', 'mm/dd/yyyy'), 'M', '478 Lumina St.', 'Indianapolis', 'IN', '95453', TO_DATE('01/01/2006', 'mm/dd/yyyy'), '08', '1004');

INSERT INTO member VALUES
  (nextval('member_mem_id_seq'), 'Leniges', 'Vanessa', 'R', TO_DATE('05/23/1960', 'mm/dd/yyyy'), 'F', '1997 Crossfire St.', 'Talladega', 'AL', '74524', TO_DATE('01/01/2020', 'mm/dd/yyyy'), '25', '1004');

INSERT INTO runs VALUES
  ('10000', '00001', TO_DATE('01/05/2005 09:00:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 03:45:22 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10001', '00001', TO_DATE('01/05/2005 09:05:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 02:48:25 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10002', '00001', TO_DATE('01/05/2005 09:10:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 05:34:32 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10004', '00001', TO_DATE('01/05/2005 09:15:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 03:15:52 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10005', '00001', TO_DATE('01/05/2005 09:20:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 06:02:48 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10006', '00001', TO_DATE('01/05/2005 09:25:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 07:37:39 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10007', '00001', TO_DATE('01/05/2005 09:30:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 04:28:27 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10008', '00001', TO_DATE('01/05/2005 09:35:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 03:46:11 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10010', '00001', TO_DATE('01/05/2005 09:40:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 04:18:06 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10011', '00001', TO_DATE('01/05/2005 09:45:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 05:01:14 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10012', '00001', TO_DATE('01/05/2005 09:50:00 am', 'mm/dd/yyyy hh:mi:ss am'), NULL, 'DQ - Missed control #12');

INSERT INTO runs VALUES
  ('10013', '00001', TO_DATE('01/05/2005 09:55:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 04:45:27 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10014', '00001', TO_DATE('01/05/2005 10:00:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 03:45:20 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10017', '00001', TO_DATE('01/05/2005 10:05:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 02:59:28 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10018', '00001', TO_DATE('01/05/2005 10:10:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 03:20:46 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);

INSERT INTO runs VALUES
  ('10020', '00001', TO_DATE('01/05/2005 10:15:00 am', 'mm/dd/yyyy hh:mi:ss am'), NULL, 'DNF - Injury');

INSERT INTO runs VALUES
  ('10021', '00001', TO_DATE('01/05/2005 10:20:00 am', 'mm/dd/yyyy hh:mi:ss am'), TO_DATE('01/05/2005 07:00:01 pm', 'mm/dd/yyyy hh:mi:ss am'), NULL);