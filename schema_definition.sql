create table hsc(
    hsc_reg_no varchar(8) not null primary key,
    board varchar(16) not null,
    percentage double not null
);

create table entrance(
    entrance_reg_no varchar(8) not null primary key,
    percentile double not null,
    score double not null
);

create table application_form(
    unique_id varchar(16) not null primary key ,
    id_type enum('UIDAI','PASSPORT','PAN','DRIVING_LICENSE','VOTER_ID') default 'UIDAI',
    first_name varchar(16) not null,
    middle_name varchar(16),
    last_name varchar(16) not null,
    email varchar(64) not null,
    phone varchar(14) not null,
    category enum ('GEN','OBC','SC/ST','NT') default 'GEN',
    entrance_reg_no varchar(8) not null unique ,
    hsc_reg_no varchar(8) not null unique ,
    branch_name varchar(8) not null
);

create table applicant(
    applicant_id varchar(16) not null primary key,
    enrollment_id varchar(16) unique,
    password varchar(16) not null,
    unique_id varchar(16) not null unique ,
    status enum ('PENDING','APPLIED','SHORTLISTED','LOCKED','REJECTED','FLOATED','UNDER_VERIFICATION','ENROLLED','NOT_FOUND','FAILED') not null default 'PENDING'


);

create table enrollment_form(
    applicant_id varchar(16) not null primary key ,
    form text not null,
    hsc_mark_sheet text not null,
    entrance_mark_sheet text not null

);

create table admin(
    username varchar(16) primary key,
    name varchar(32),
    password varchar(16) not null
);

create table connection(
    ticket_no varchar(16) primary key not null,
    username varchar(16),
    client_name varchar(32) not null,
    applicant_id varchar(16),
    resolved bool default false
);

create table conversation(
    id int primary key not null auto_increment,
    message text not null,
    ticket_no varchar(16) not null,
    sent_at timestamp not null,
    sent_by_admin bool not null default false
);

create table event(
    description text not null,
    commencement date not null
);

alter table application_form add constraint application_form_FK_hsc_reg_no
foreign key(hsc_reg_no) references hsc(hsc_reg_no)
on delete cascade;

alter table application_form add constraint application_form_FK_entrance_reg_no
foreign key(entrance_reg_no) references entrance(entrance_reg_no)
on delete cascade;

alter table applicant add constraint applicant_FK_unique_id
foreign key(unique_id) references application_form(unique_id)
on delete cascade;


alter table enrollment_form add constraint enrollment_form_FK_applicant_id
foreign key(applicant_id) references applicant(applicant_id)
on delete cascade;

alter table connection add constraint connection_FK_username
foreign key(username) references admin(username)
on delete set null;

alter table connection add constraint connection_FK_applicant_id
foreign key(applicant_id) references applicant(applicant_id)
on delete cascade;

alter table conversation add constraint conversation_FK_ticket_no
foreign key(ticket_no) references connection(ticket_no)
on delete cascade;

alter table conversation auto_increment = 0;
alter table conversation modify column sent_at timestamp not null default current_timestamp;

