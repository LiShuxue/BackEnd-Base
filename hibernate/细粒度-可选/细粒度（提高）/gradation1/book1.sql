/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : mydb
Target Host     : localhost:3306
Target Database : mydb
Date: 2015-01-15 23:58:27
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for book1
-- ----------------------------
DROP TABLE IF EXISTS `book1`;
CREATE TABLE `book1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `publishers` varchar(200) DEFAULT NULL,
  `pagecount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book1
-- ----------------------------
