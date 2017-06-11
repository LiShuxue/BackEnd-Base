/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : jdbc
Target Host     : localhost:3306
Target Database : jdbc
Date: 2015-01-19 10:04:34
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for dvd2
-- ----------------------------
DROP TABLE IF EXISTS `dvd2`;
CREATE TABLE `dvd2` (
  `id` int(11) NOT NULL,
  `code` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dvd2
-- ----------------------------
