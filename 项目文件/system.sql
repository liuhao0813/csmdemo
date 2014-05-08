----------------------------------------------------
-- Export file for user ESSENCE                   --
-- Created by zhaochenggang on 2014/5/8, 13:48:58 --
----------------------------------------------------

create table essence.TPL_MENU_T
(
  menu_id     INTEGER not null,
  menu_name   VARCHAR2(40) not null,
  menu_url    VARCHAR2(200),
  parent_id   INTEGER,
  created_by  VARCHAR2(20),
  create_date DATE,
  updated_by  VARCHAR2(20),
  update_date DATE,
  add constraint MENU_ID primary key (MENU_ID)
);

create table essence.TPL_ROLE_T
(
  role_id     INTEGER not null,
  role_name   VARCHAR2(20),
  created_by  VARCHAR2(20),
  craate_date DATE,
  updated_by  VARCHAR2(20),
  update_date DATE,
  notes       VARCHAR2(200),
  add constraint ROLE_ID primary key (ROLE_ID)
);

create table essence.TPL_USER_T
(
  user_id     INTEGER not null,
  username    VARCHAR2(20),
  password    VARCHAR2(20),
  notes       VARCHAR2(100),
  status      INTEGER,
  last_login  TIMESTAMP(6),
  created_by  VARCHAR2(20),
  craete_date DATE,
  upated_by   VARCHAR2(20),
  update_date DATE,
  add constraint USER_ID primary key (USER_ID)
);

create sequence essence.TPL_MENU_S
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

create sequence essence.TPL_ROLE_S
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

create sequence essence.TPL_USER_S
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;
