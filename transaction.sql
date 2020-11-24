/*
Navicat MySQL Data Transfer

Source Server         : MMO_Develop
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : ukrsib_test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-11-24 10:44:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for transaction
-- ----------------------------
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `place` varchar(50) DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `currency` varchar(50) DEFAULT NULL,
  `card` varchar(50) DEFAULT NULL,
  `client_inn` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=701 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction
-- ----------------------------
INSERT INTO `transaction` VALUES ('1', 'A PLACE 1', '10.01', 'UAH', '123456****1234', '1234567890');
INSERT INTO `transaction` VALUES ('2', 'A PLACE 2', '9876.01', 'UAH', '123456****1234', '1234567890');
INSERT INTO `transaction` VALUES ('3', 'A PLACE 3', '12.01', 'USD', '123456****1234', '1234567890');
INSERT INTO `transaction` VALUES ('4', 'A PLACE 4', '12.01', 'EUR', '123456****1234', '1234567890');
INSERT INTO `transaction` VALUES ('5', 'A PLACE 1', '10.01', 'UAH', '123456****1234', '1234567891');
INSERT INTO `transaction` VALUES ('6', 'A PLACE 2', '9876.01', 'UAH', '123456****1234', '1234567891');
INSERT INTO `transaction` VALUES ('7', 'A PLACE 3', '12.01', 'USD', '123456****1234', '1234567891');
INSERT INTO `transaction` VALUES ('8', 'A PLACE 4', '12.01', 'EUR', '123456****1234', '1234567891');
INSERT INTO `transaction` VALUES ('9', 'A PLACE 1', '10.01', 'UAH', '123456****1234', '1234567892');
INSERT INTO `transaction` VALUES ('10', 'A PLACE 2', '9876.01', 'UAH', '123456****1234', '1234567892');
INSERT INTO `transaction` VALUES ('11', 'A PLACE 3', '12.01', 'USD', '123456****1234', '1234567892');
INSERT INTO `transaction` VALUES ('12', 'A PLACE 4', '12.01', 'EUR', '123456****1234', '1234567892');
SET FOREIGN_KEY_CHECKS=1;
