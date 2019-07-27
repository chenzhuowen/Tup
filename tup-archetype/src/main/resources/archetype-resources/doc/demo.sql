/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 26/07/2019 15:02:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  PRIMARY KEY (`user_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('asdasda', 'dgdfg');
INSERT INTO `sys_user` VALUES ('asdasdadddd', 'dgdfg');
INSERT INTO `sys_user` VALUES ('ccc', 'asdas');
INSERT INTO `sys_user` VALUES ('ChenZw', '123456');
INSERT INTO `sys_user` VALUES ('ChenZw1', '123456');
INSERT INTO `sys_user` VALUES ('ChenZw121', '123456');
INSERT INTO `sys_user` VALUES ('ChenZw222', '123456');
INSERT INTO `sys_user` VALUES ('dfsef', 'vbrg');
INSERT INTO `sys_user` VALUES ('gfsdf', 'qweqwe');
INSERT INTO `sys_user` VALUES ('WenZc', '654321');

SET FOREIGN_KEY_CHECKS = 1;
