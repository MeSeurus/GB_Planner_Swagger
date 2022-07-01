drop table events if exists cascade;
create table events if not exist
(
    id          bigserial,
    name        varchar(60),
    content     varchar(300),
    userNames   varchar(60),
    day_id      bigint
);

drop table days if exists cascade;
create table days if not exist
(
    id      bigserial,
    date    date,
    weekday varchar(60),


);
