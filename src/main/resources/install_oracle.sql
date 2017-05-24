--create table
create table customer (
	c_id int not null,
	name varchar2(255),
	contact varchar2(255),
	telephone varchar2(255),
	email varchar2(255),
	remark varchar2(2000),
	constraint PK_C_ID primary key (c_id)
  );

create sequence seq_c_id increment by 1 start with 1 maxvalue 99999999 minvalue 1 cycle;

create or replace trigger tric_id before insert
on customer
referencing
new as new
old as old
for each row
begin
    select to_char(seq_c_id.nextval) into :new.c_id from dual;
end;
/

-- insert values
INSERT INTO customer
  (name, contact, telephone, email)
VALUES
  ('Jack', 'Rose', '18632011564', '123@mail.com');

INSERT INTO customer
  (name, contact, telephone, email)
VALUES
  ('Tom', 'Jerry', '18632011588', '456@mail.com');

COMMIT;