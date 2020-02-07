drop table news;
drop table reporter;
drop table tags;
drop table rating;
drop table news_tags;
drop table news;

create table reporter (
id integer primary key generated always as identity,
pseudo varchar(30),
credit integer
);

create table news (
id integer primary key generated always as identity,
titre varchar(20),
contenu varchar(50),
date_news DATE,
id_reporter integer
);

create table tags (
id integer primary key generated always as identity,
tag varchar(30)
);

create table rating (
id integer primary key generated always as identity,
id_news integer,
id_reporter integer
);

create table news_tags (
id integer primary key generated always as identity,
id_news integer,
id_tag integer
);

alter table news
add constraint FK_news_reporter_id
FOREIGN key (id_reporter) 
references reporter(id);

insert into reporter (pseudo,credit)values
('alexis',5),
('jordan',5),
('lucas',5);

insert into news (id_reporter,titre,contenu,date_news) values 
(1,'titre','toto','2020-02-07'),
(2,'titre','tata','2020-02-07');

insert into tags(tag)values
('tag1'),
('tag2'),
('tag3');

insert into news_tags (id_news,id_tag)values
(1,2),
(1,3),
(2,1);