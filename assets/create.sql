CREATE SEQUENCE member_mem_id_seq START 10000;
CREATE SEQUENCE age_group_age_group_id_seq;
CREATE SEQUENCE course_course_id_seq;
CREATE SEQUENCE competition_comp_id_seq;
CREATE SEQUENCE meet_meet_id_seq;
CREATE SEQUENCE club_club_id_seq START 1000;
CREATE SEQUENCE location_loc_id_seq;

CREATE TABLE IF NOT EXISTS club
(
  club_id INTEGER NOT NULL DEFAULT nextval('club_club_id_seq')
    CONSTRAINT club_pkey
    PRIMARY KEY,
  name    VARCHAR(50),
  abbv    CHAR(4)
);

CREATE TABLE IF NOT EXISTS location
(
  loc_id          INTEGER NOT NULL DEFAULT nextval('location_loc_id_seq')
    CONSTRAINT location_pkey
    PRIMARY KEY,
  name            VARCHAR(50),
  street          VARCHAR(100),
  city            VARCHAR(100),
  state           CHAR(2),
  postal_code     CHAR(5),
  postal_code_ext CHAR(4)
);

CREATE TABLE IF NOT EXISTS age_group
(
  age_group_id INTEGER NOT NULL DEFAULT nextval('age_group_age_group_id_seq')
    CONSTRAINT age_group_pkey
    PRIMARY KEY,
  name         CHAR(4)
);

CREATE TABLE IF NOT EXISTS meet
(
  meet_id INTEGER DEFAULT nextval('meet_meet_id_seq' :: REGCLASS) NOT NULL
    CONSTRAINT meet_pkey
    PRIMARY KEY,
  name    VARCHAR(50)                                             NOT NULL,
  club_id INTEGER
    CONSTRAINT meet_club_club_id_fk
    REFERENCES club
);

CREATE TABLE IF NOT EXISTS competition
(
  comp_id INTEGER NOT NULL DEFAULT nextval('competition_comp_id_seq')
    CONSTRAINT competition_pkey
    PRIMARY KEY,
  date    DATE,
  loc_id  INTEGER
    CONSTRAINT competition_location_loc_id_fk
    REFERENCES location,
  meet_id INTEGER
    CONSTRAINT competition_meet_meet_id_fk
    REFERENCES meet
);

CREATE TABLE IF NOT EXISTS course
(
  course_id    INTEGER NOT NULL DEFAULT nextval('course_course_id_seq')
    CONSTRAINT course_pkey
    PRIMARY KEY,
  length_km    NUMERIC(7, 2),
  climb_m      NUMERIC(6, 2),
  num_controls INTEGER,
  comp_id      INTEGER
    CONSTRAINT course_competition_comp_id_fk
    REFERENCES competition
);

CREATE TABLE IF NOT EXISTS member
(
  mem_id         INTEGER      NOT NULL DEFAULT nextval('member_mem_id_seq')
    CONSTRAINT member_pkey
    PRIMARY KEY,
  last_name      VARCHAR(100) NOT NULL,
  first_name     VARCHAR(100) NOT NULL,
  middle_initial VARCHAR(10),
  dob            DATE         NOT NULL,
  gender         CHAR         NOT NULL,
  street_addr    VARCHAR(100),
  city           VARCHAR(100),
  state          CHAR(2),
  zip_code       CHAR(5),
  exp_date       DATE         NOT NULL,
  age_group_id   INTEGER,
  club_id        INTEGER
    CONSTRAINT member_club_club_id_fk
    REFERENCES club
);

CREATE TABLE IF NOT EXISTS competes_on
(
  course_id    INTEGER NOT NULL
    CONSTRAINT competes_on_course_course_id_fk
    REFERENCES course,
  age_group_id INTEGER NOT NULL
    CONSTRAINT competes_on_age_group_age_group_id_fk
    REFERENCES age_group,
  CONSTRAINT competes_on_pkey
  PRIMARY KEY (course_id, age_group_id)
);

CREATE TABLE IF NOT EXISTS runs
(
  mem_id           INTEGER   NOT NULL
    CONSTRAINT runs_mem_id_fk
    REFERENCES member,
  course_id        INTEGER   NOT NULL
    CONSTRAINT runs_course_id_fk
    REFERENCES course,
  start_time       TIMESTAMP NOT NULL,
  finish_time      TIMESTAMP,
  explanatory_code VARCHAR(50),
  CONSTRAINT runs_mem_id_course_id_pk
  PRIMARY KEY (mem_id, course_id)
);
