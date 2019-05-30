/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : museum

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2019-04-16 14:00:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_collection`
-- ----------------------------
DROP TABLE IF EXISTS `t_collection`;
CREATE TABLE `t_collection` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `avatar` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `recommend` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_collection
-- ----------------------------
INSERT INTO `t_collection` VALUES ('13', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('15', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('16', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('20', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('21', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('22', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('23', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('24', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('25', '1', '2', '3', '2', '2', '2019-03-05 16:00');
INSERT INTO `t_collection` VALUES ('26', '1', '1', 'http://134.175.107.153:8090/museum-0.0.1-SNAPSHOT/upload/info/c9441e4d-df20-4a5d-97ba-acd71f1314c7.jpg', '1', '1', '2019-03-06 10:49');
INSERT INTO `t_collection` VALUES ('27', '1', '1', 'http://134.175.107.153:8090/museum-0.0.1-SNAPSHOT/upload/info/c132880d-64b5-42e3-81cf-83a112c43e74.jpg', '1', '推荐', '2019-03-06 15:19');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '大明', '123456', '男', '23', '南京', '游客', 'http://192.168.50.98:8080/upload/userimage/faba4683-1825-4219-85ee-9d5be3fb2689.JPEG');
INSERT INTO `t_user` VALUES ('2', '小明', '123456', null, null, null, '管理员', null);
INSERT INTO `t_user` VALUES ('3', '测试注', '123456', null, null, null, '管理员', null);
INSERT INTO `t_user` VALUES ('4', '1', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('5', '觉得', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('6', '觉', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('7', '觉得', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('8', '觉', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('9', '接', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('10', '接你', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('11', '1', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('12', '12', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('13', '123', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('14', '1234', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('15', '12345', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('16', '123456', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('17', '00', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('18', '08', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('19', '033', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('20', '33', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('21', '55', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('22', '66', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('23', '测试', '123456', null, null, null, '管理员', null);
INSERT INTO `t_user` VALUES ('24', '小陈', '123456', '男', '23', '合肥', '游客', 'http://139.199.64.249:8080/museum-0.0.1-SNAPSHOT/upload/userimage/39115511-edbd-451c-9a80-a0d03178bdd9.jpg');
INSERT INTO `t_user` VALUES ('25', '123', '123', null, null, null, '管理员', null);
INSERT INTO `t_user` VALUES ('26', '小强', '123456', '男', '', '', '游客', 'http://139.199.64.249:8080/museum-0.0.1-SNAPSHOT/upload/userimage/4bd108ef-40a1-4a13-bf80-d2be08f1eea2.jpg');
INSERT INTO `t_user` VALUES ('27', '张博涵', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('28', '小明', '123456', null, null, null, '游客', null);
INSERT INTO `t_user` VALUES ('29', '小红', '123456', null, null, null, '游客', null);
