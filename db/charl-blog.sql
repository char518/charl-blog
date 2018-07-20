/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : charl-blog

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-07-20 17:24:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bl_category
-- ----------------------------
DROP TABLE IF EXISTS `bl_category`;
CREATE TABLE `bl_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) DEFAULT NULL COMMENT '分类名',
  `parent_id` int(11) DEFAULT NULL COMMENT '父分类ID',
  `del_flag` tinyint(2) DEFAULT NULL COMMENT '删除标志：0.未删除 1.已删除',
  `add_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分类表';

-- ----------------------------
-- Records of bl_category
-- ----------------------------

-- ----------------------------
-- Table structure for bl_comments
-- ----------------------------
DROP TABLE IF EXISTS `bl_comments`;
CREATE TABLE `bl_comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `post_id` int(11) DEFAULT NULL COMMENT '帖子ID',
  `author_id` int(11) DEFAULT NULL COMMENT '评论人ID',
  `content` text COMMENT '评论内容',
  `parent_id` int(11) DEFAULT NULL COMMENT '父评论ID',
  `del_flag` tinyint(2) DEFAULT NULL COMMENT '删除标志：0.未删除 1.已删除',
  `add_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表';

-- ----------------------------
-- Records of bl_comments
-- ----------------------------

-- ----------------------------
-- Table structure for bl_post
-- ----------------------------
DROP TABLE IF EXISTS `bl_post`;
CREATE TABLE `bl_post` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` text,
  `user_id` int(11) DEFAULT NULL COMMENT '作者ID',
  `category_id` int(11) DEFAULT NULL COMMENT '分类ID',
  `visits` int(11) DEFAULT NULL COMMENT '访问数',
  `del_flag` tinyint(2) DEFAULT NULL COMMENT '删除标志：0.未删除 1.已删除',
  `add_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bl_post
-- ----------------------------

-- ----------------------------
-- Table structure for bl_user
-- ----------------------------
DROP TABLE IF EXISTS `bl_user`;
CREATE TABLE `bl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) DEFAULT '' COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `image` varchar(100) DEFAULT NULL COMMENT '头像',
  `alias` varchar(255) DEFAULT NULL COMMENT '用户别名/昵称',
  `description` varchar(500) DEFAULT NULL COMMENT '个人简介',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `status` tinyint(2) DEFAULT NULL COMMENT '状态',
  `del_flag` tinyint(2) DEFAULT NULL COMMENT '删除标志：0.未删除 1.已删除',
  `add_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of bl_user
-- ----------------------------
INSERT INTO `bl_user` VALUES ('1', 'charl', '123456', '15220212336', '', '酷酷的海', '', 'char360@hotmail.com', '0', '0', null, null);
