/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : mydb
Target Host     : localhost:3306
Target Database : mydb
Date: 2015-01-19 20:24:25
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for item3
-- ----------------------------
DROP TABLE IF EXISTS `item3`;
CREATE TABLE `item3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `menuf` varchar(200) DEFAULT NULL,
  `pagecount` int(11) DEFAULT NULL,
  `code` varchar(200) DEFAULT NULL,
  `iden` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item3
-- ----------------------------
