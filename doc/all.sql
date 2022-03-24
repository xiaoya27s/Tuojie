drop table if exists `ebook`;
create table `ebook` (
`id` bigint not null comment 'id',
`name` varchar(50) comment '名称',
`category1_id` bigint comment '分类1',
`category2_id` bigint comment '分类2',
`description` varchar(200) comment '描述',
`cover` varchar(200) comment '封⾯',
`doc_count` int not null default 0 comment '⽂档数',
`view_count` int not null default 0 comment '阅读数',
`vote_count` int not null default 0 comment '点赞数',
primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='电⼦书';
insert into `ebook` (id, name, description) values (1, 'Spring Boot ⼊⻔教程', '零基础⼊⻔ Java 开发，企业
级应⽤开发最佳⾸选框架');
insert into `ebook` (id, name, description) values (2, 'Vue ⼊⻔教程', '零基础⼊⻔ Vue 开发，企业级应⽤开
发最佳⾸选框架');
insert into `ebook` (id, name, description) values (3, 'Python ⼊⻔教程', '零基础⼊⻔ Python 开发，企业级
应⽤开发最佳⾸选框架');
insert into `ebook` (id, name, description) values (4, 'Mysql ⼊⻔教程', '零基础⼊⻔ Mysql 开发，企业级应
⽤开发最佳⾸选框架');
insert into `ebook` (id, name, description) values (5, 'Oracle ⼊⻔教程', '零基础⼊⻔ Oracle 开发，企业级
应⽤开发最佳⾸选框架')