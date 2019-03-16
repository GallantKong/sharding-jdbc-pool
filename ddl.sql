create database gallant default charset=utf8;
create database gallant1 default charset=utf8;

drop table if exists gallant_order0;
CREATE TABLE `gallant_order0` (
  `id` bigint(20) NOT NULL auto_increment,
  `user_id` bigint(20) NOT NULL,
  `city_id` int(20) NOT NULL,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if exists gallant_order_item0;
CREATE TABLE `gallant_order_item0` (
  `id` bigint(20) NOT NULL auto_increment,
  `order_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if exists gallant_order1;
CREATE TABLE `gallant_order1` (
  `id` bigint(20) NOT NULL auto_increment,
  `user_id` bigint(20) NOT NULL,
  `city_id` int(20) NOT NULL,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if exists gallant_order_item1;
CREATE TABLE `gallant_order_item1` (
  `id` bigint(20) NOT NULL auto_increment,
  `order_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;