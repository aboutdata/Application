/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : biz

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2015-07-15 14:06:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `v_admin`
-- ----------------------------
DROP TABLE IF EXISTS `v_admin`;
CREATE TABLE `v_admin` (
  `id` varchar(20) NOT NULL,
  `createDate` datetime NOT NULL,
  `modifyDate` datetime NOT NULL,
  `department` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `isEnabled` bit(1) NOT NULL,
  `isLocked` bit(1) NOT NULL,
  `lockedDate` datetime DEFAULT NULL,
  `loginDate` datetime DEFAULT NULL,
  `loginFailureCount` int(11) NOT NULL,
  `loginIp` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of v_admin
-- ----------------------------
INSERT INTO `v_admin` VALUES ('1', '2013-07-14 00:03:36', '2013-08-08 23:27:21', '技术部', '845885222@qq.com', '', '', '2015-07-23 11:22:00', '2013-08-08 23:27:21', '0', null, '管理员', '21232f297a57a5a743894a0e4a801fc3', 'admin');
INSERT INTO `v_admin` VALUES ('2487227710', '2015-07-09 17:06:39', '2015-07-09 17:06:39', '计算机', '845885222@qq.com', '', '', '2015-07-09 17:06:39', '2015-07-09 17:06:39', '0', '2487227710', '06830', '40672', '51963352');
INSERT INTO `v_admin` VALUES ('3136095277', '2015-07-09 11:21:28', '2015-07-09 11:21:28', '计算机', '845885222@qq.com', '', '', '2015-07-09 11:21:28', '2015-07-09 11:21:28', '0', '3136095277', '95859', '06058', '43938548');
INSERT INTO `v_admin` VALUES ('3960790018', '2015-07-09 14:29:24', '2015-07-09 14:29:24', '计算机', '845885222@qq.com', '', '', '2015-07-09 14:29:24', '2015-07-09 14:29:24', '0', '3960790018', '97567', '15292', '70271398');
INSERT INTO `v_admin` VALUES ('5552816345', '2015-07-09 10:33:31', '2015-07-09 10:33:31', '计算机', '845885222@qq.com', '', '', '2015-07-09 10:33:31', '2015-07-09 10:33:31', '0', '5552816345', '24047', '56329', '32995861');
INSERT INTO `v_admin` VALUES ('8635118941', '2015-07-09 10:37:38', '2015-07-09 10:37:38', '计算机', '845885222@qq.com', '', '', '2015-07-09 10:37:38', '2015-07-09 10:37:38', '0', '8635118941', '87199', '16821', '21637204');

-- ----------------------------
-- Table structure for `v_role`
-- ----------------------------
DROP TABLE IF EXISTS `v_role`;
CREATE TABLE `v_role` (
  `id` varchar(32) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifyDate` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `isSystem` int(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of v_role
-- ----------------------------
INSERT INTO `v_role` VALUES ('11111111111111111', '2015-07-15 11:48:05', '2015-07-15 11:48:05', null, '1', '王坤', 'ROLE_TEST');
INSERT INTO `v_role` VALUES ('11111111111111121', '2015-07-15 11:49:17', '2015-07-15 11:49:17', '我要在测试一次', '1', '王坤', 'ROLE_TEST');
INSERT INTO `v_role` VALUES ('11284', '0015-06-26 14:33:17', '2015-06-25 14:33:17', 'anhao  app test ', '1', 'anhao ', 'ROLE_SA');
INSERT INTO `v_role` VALUES ('144293529674', '2015-07-09 09:28:52', '2015-07-09 09:28:52', 'Description74793', '1', 'iam insert role 84197', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('14429353113', '2015-07-09 09:28:52', '2015-07-09 09:28:52', 'Description74793', '1', 'iam insert role 84197', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('14429353114', '2015-07-09 09:28:52', '2015-07-09 09:28:52', 'Description74793', '1', 'iam insert role 84197', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('1442935457', '2015-07-09 09:28:52', '2015-07-09 09:28:54', 'Description74793', '1', 'iam insert role 84197', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('173', '0015-06-26 14:33:17', '2015-06-26 14:33:17', 'anhao  app test ', '1', 'anhao ', 'ROLE_SA');
INSERT INTO `v_role` VALUES ('273', '0015-06-26 14:33:17', '2015-06-26 14:33:17', 'anhao  app test ', '1', 'anhao ', 'ROLE_SA');
INSERT INTO `v_role` VALUES ('274896948774', '2015-07-08 18:07:37', '2015-07-08 18:07:37', 'Description96209', '1', 'iam insert role 57034', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('27489695023', '2015-07-08 18:07:37', '2015-07-08 18:07:37', 'Description96209', '1', 'iam insert role 57034', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('27489695024', '2015-07-08 18:07:37', '2015-07-08 18:07:37', 'Description96209', '1', 'iam insert role 57034', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('2748969648', '2015-07-08 18:07:37', '2015-07-08 18:07:37', 'Description96209', '1', 'iam insert role 57034', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('5274', '0015-06-26 14:33:17', '2015-06-26 14:33:17', 'anhao  app test ', '1', 'anhao ', 'ROLE_SA');
INSERT INTO `v_role` VALUES ('530596259874', '2015-07-08 16:44:24', '2015-07-08 16:44:24', 'Description12943', '1', 'iam insert role 60397', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('53059626133', '2015-07-08 16:44:24', '2015-07-08 16:44:24', 'Description12943', '1', 'iam insert role 60397', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('53059626134', '2015-07-08 16:44:24', '2015-07-08 16:44:24', 'Description12943', '1', 'iam insert role 60397', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('5305962759', '2015-07-08 16:44:24', '2015-07-08 16:44:24', 'Description12943', '1', 'iam insert role 60397', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('567072903974', '2015-07-08 17:29:55', '2015-07-08 17:29:55', 'Description74495', '1', 'iam insert role 42244', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('56707290543', '2015-07-08 17:29:55', '2015-07-08 17:29:55', 'Description74495', '1', 'iam insert role 42244', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('56707290544', '2015-07-08 17:29:55', '2015-07-08 17:29:55', 'Description74495', '1', 'iam insert role 42244', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('5670729200', '2015-07-08 17:29:55', '2015-07-08 17:29:55', 'Description74495', '1', 'iam insert role 42244', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('792780057774', '2015-07-09 09:17:35', '2015-07-09 09:17:35', 'Description93705', '1', 'iam insert role 99419', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('79278005923', '2015-07-09 09:17:35', '2015-07-09 09:17:35', 'Description93705', '1', 'iam insert role 99419', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('79278005924', '2015-07-09 09:17:35', '2015-07-09 09:17:37', 'Description93705', '1', 'iam insert role 99419', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('7927800738', '2015-07-09 09:17:35', '2015-07-09 09:17:35', 'Description93705', '1', 'iam insert role 99419', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('813665862974', '2015-07-09 09:10:27', '2015-07-09 09:10:27', 'Description04957', '1', 'iam insert role 36223', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('81366586443', '2015-07-09 09:10:27', '2015-07-09 09:10:27', 'Description04957', '1', 'iam insert role 36223', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('81366586444', '2015-07-09 09:10:27', '2015-07-09 09:10:27', 'Description04957', '1', 'iam insert role 36223', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('8136658790', '2015-07-09 09:10:27', '2015-07-09 09:10:27', 'Description04957', '1', 'iam insert role 36223', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('911324526574', '2015-07-09 09:33:04', '2015-07-09 09:34:04', 'Description80800', '1', 'iam insert role 70038', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('91132452803', '2015-07-09 09:33:04', '2015-07-09 09:33:04', 'Description80800', '1', 'iam insert role 70038', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('91132452804', '2015-07-09 09:33:04', '2015-07-09 09:33:04', 'Description80800', '1', 'iam insert role 70038', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('9113245426', '2015-07-09 09:33:04', '2015-07-09 11:33:04', 'Description80800', '1', 'iam insert role 70038', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('9641363774', '2015-07-09 09:40:09', '2015-07-09 09:40:09', 'Description80185', '1', 'iam insert role 07385', 'ROLE_ADMIN');
