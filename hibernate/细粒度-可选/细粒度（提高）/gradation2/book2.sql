/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : jdbc
Target Host     : localhost:3306
Target Database : jdbc
Date: 2015-01-19 10:04:42
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for book2
-- ----------------------------
DROP TABLE IF EXISTS `book2`;
CREATE TABLE `book2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pagecount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book2
-- ----------------------------
