/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : jdbc
Target Host     : localhost:3306
Target Database : jdbc
Date: 2015-01-19 10:04:25
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for item2
-- ----------------------------
DROP TABLE IF EXISTS `item2`;
CREATE TABLE `item2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `chuban` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item2
-- ----------------------------
