/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : gxzcglxt

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2018-04-15 23:45:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_assets
-- ----------------------------
DROP TABLE IF EXISTS `t_assets`;
CREATE TABLE `t_assets` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `isBorrowed` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `principal` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `usePeople` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_assets
-- ----------------------------
INSERT INTO `t_assets` VALUES ('2f185db762aea2cc0162aeacc95e0002', '0', '孤独百年', 'admin', '正常', '图书教材 ', '无', '2018-04-10 16:29:42');
INSERT INTO `t_assets` VALUES ('2f185db762aea2cc0162aead38b30003', '0', '麦田守望者', 'admin', '正常', '图书教材 ', '无', '2018-04-10 16:30:10');
INSERT INTO `t_assets` VALUES ('2f185db762aea2cc0162aeadaaf80004', '0', '人性的弱点', 'admin', '正常', '图书教材 ', '无', '2018-04-10 16:30:39');

-- ----------------------------
-- Table structure for t_borrowlist
-- ----------------------------
DROP TABLE IF EXISTS `t_borrowlist`;
CREATE TABLE `t_borrowlist` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `assetId` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `assetsName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `borrowTime` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `retrunTime` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `userName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_borrowlist
-- ----------------------------
INSERT INTO `t_borrowlist` VALUES ('2f18615062c4e7ed0162c4edcb1e0001', '2f185db762aea2cc0162aeacc95e0002', '孤独百年', '2018-04-15 00:12:21', 'test', '2018-04-15 00:12:23', 'test');
INSERT INTO `t_borrowlist` VALUES ('2f18615062c4ee420162c4eeb3c30000', '2f185db762aea2cc0162aeacc95e0002', '孤独百年', '2018-04-15 00:13:20', 'test2', '2018-04-15 00:13:22', 'test2');
INSERT INTO `t_borrowlist` VALUES ('2f18615062c4e7ed0162c4e9c9250000', '2f185db762aea2cc0162aeacc95e0002', '孤独百年', '2018-04-15 00:07:58', '借出', '2018-04-15 00:08:06', 'admin');

-- ----------------------------
-- Table structure for t_cheak
-- ----------------------------
DROP TABLE IF EXISTS `t_cheak`;
CREATE TABLE `t_cheak` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `manager` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `pass` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `performance` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `projectsId` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_cheak
-- ----------------------------

-- ----------------------------
-- Table structure for t_projects
-- ----------------------------
DROP TABLE IF EXISTS `t_projects`;
CREATE TABLE `t_projects` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `manager` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_projects
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2f185db762aea2cc0162aea471e40000', '2018-04-10 16:20:35', 'mryao', '普通用户', 'mryao', 'mryao', '15528037731');
INSERT INTO `t_user` VALUES ('2f185c15628e361e01628e372ef20000', '2018-04-04 09:13:23', 'admin', '管理员', 'admin', '管理员', '13825183322');
