-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.48-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema smartcity
--

CREATE DATABASE IF NOT EXISTS smartcity;
USE smartcity;

--
-- Definition of table `businfo`
--

DROP TABLE IF EXISTS `businfo`;
CREATE TABLE `businfo` (
  `bus_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bus_name` varchar(100) NOT NULL,
  `bus_no` varchar(45) NOT NULL,
  `bus_rto_no` varchar(45) NOT NULL,
  `bus_timing` varchar(100) NOT NULL,
  `bus_route` varchar(200) NOT NULL,
  `stopage` varchar(45) NOT NULL,
  `fair` varchar(45) NOT NULL,
  `facilities` varchar(200) NOT NULL,
  `helpline_no` varchar(45) NOT NULL,
  `remarks` varchar(100) NOT NULL,
  `type` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  PRIMARY KEY (`bus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `businfo`
--

/*!40000 ALTER TABLE `businfo` DISABLE KEYS */;
INSERT INTO `businfo` (`bus_id`,`bus_name`,`bus_no`,`bus_rto_no`,`bus_timing`,`bus_route`,`stopage`,`fair`,`facilities`,`helpline_no`,`remarks`,`type`,`city`) VALUES 
 (4,'multiple','324324','34324','34','Rajwada, Rajwada, ghgfh','3','5','DFDSF','34324','FDSF','',''),
 (5,'gdfg','324324','34324','dgffg','Mr 10 to Rajwada, Mr 10 to Rajwada','33','453','ggggggggggg','34324','gggggggggg','',''),
 (9,'DFF','324324','34324','fsfsdf','Mr 10 to Rajwada, Mr 10 to Rajwada','33','6','DSFDSF','34324','FDSF>','',''),
 (15,'fsdf','324324','34324','dsf','Railway to Ashram','4','5','dfg','34324','dsdsf','',''),
 (24,'vbcvb','cbcxb','xcbxcbx','bxcbxcb','Rajwada, Rajwada','3','4','fvdfdsf','5325','dfdsf','Urban','bcbzb'),
 (26,'ddfd','fdfdsf','dfdsfds','fdsfdsf','Route1, Route1','33','5','dfdf','5255','gdfgdfg','City','fdsff'),
 (27,'ffdsf','sfdsf','dffsdf','fdsfdsf','Mr 10 to Rajwada, Mr 10 to Rajwada','33','3456','gfdfgdfg','5325235','fdsfsdgg','City','fsfd'),
 (28,'ffdsf','sfdsf','dffsdf','fdsfdsf','Mr 10 to Rajwada','33','3456','gfdfgdfg','5325235','fdsfsdgg','City','fsfd'),
 (30,'RTWE','32432','FGDG','GDGD','Rajwada','3','7','gfdfgdfg','3453454','4545','City','TTRTRE'),
 (31,'ret','tretrt','retrttr','rtretr','Rajwada, Rajwada','4','54','tert','345435','rtet','City','tetr'),
 (32,'ret','tretrt','retrttr','rtretr','Rajwada','4','54','tert','345435','rtet','City','tetr'),
 (33,'ffdf','dfdf','fdsfdfd','ffdf','Mr 10 to Rajwada, Mr 10 to Rajwada','33','4','sfdsf','33333333','3333333','City','fgdfgdsgfdf'),
 (34,'ffdf','dfdf','fdsfdfd','ffdf','Mr 10 to Rajwada','33','4','sfdsf','33333333','3333333','City','fgdfgdsgfdf'),
 (36,'ddsf','44444444','4444444','gdgdg','Rajwada','33','4','dgg','455','gfgg','City','4444444'),
 (39,'fffff','fff','fffff','fffffff','Route1','4','4','frrrrrr','4','rrrr','City','ffff'),
 (42,'gdfg','fdgdfg','fgdfgfdg','dfgdf','Route1, Route1','9','9','hgjgfhj','9999999','uyuyu','City','gdfgfdfg'),
 (44,'sdgdsg','dgsdsg','dsgdsgdsgds','ggdsg','Route1, Route1','33','4','5','1234567890','fgtgd','City','gsdg'),
 (45,'Indore darshan','6778','7889','7,10,3,5','Indore route, Indore route','5','3','Ac','8181818181','rtert','City','Indore'),
 (46,'fdfsdf','fdsfdsff','dsfsdfdsf','sdfsdfdsf','Route1, Route1','33','3','343241','1234567890','sdfdsf','City','fsdfdsfdsfsdf'),
 (47,'wer','werwer','rwer','rwer','Rajwada, Rajwada','4','4','44','1234567890','fsdf','City','wer'),
 (48,'fsfsf','fdsfdsff','sdfsf','sdfsdf','Mr 10 to Rajwada, Mr 10 to Rajwada, Rajwada','2','3','tert','1234567890','fdsfdsf','City','fsdfdsfdsfsdf'),
 (49,'GGFG','gdfg','gdfg','gdfg','Route1, Mr 10 to Rajwada','4','4','sdfsd','1234567890','fsdfdsf','City','fgdfgdfg'),
 (50,'dfgfdgf','fff','fdsfdfd','fsfsdf','ghgfh','2','2','2','1234567890','gsgsg','City','fdsffff'),
 (51,'Hariom','32423','324324','3','Khandwa','4','5','non ac','1234567890','retert','City','Khandwa');
/*!40000 ALTER TABLE `businfo` ENABLE KEYS */;


--
-- Definition of table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `contact` varchar(45) NOT NULL,
  `emailid` varchar(45) NOT NULL,
  `query` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` (`id`,`name`,`contact`,`emailid`,`query`) VALUES 
 (1,'Bhupedra','040242','dfksf','dfsdfl'),
 (2,'Pankaj','324923','dkfasdfkao','fdsdflsdf'),
 (3,'abc','22525','345435','fsf sdfs f s fsf sfs sf sffsfsf'),
 (4,'Hello','355-35-99','ffasdfjsl','dsjfsafd lsdkf;lskf '),
 (5,'Love','03025`','love@hotmail.com','This is lovely site'),
 (6,'[object HTMLInputElement]','[object HTMLInputElement]','[object HTMLInputElement]','[object HTMLTextAreaElement]'),
 (7,'[object HTMLInputElement]','[object HTMLInputElement]','[object HTMLInputElement]','[object HTMLTextAreaElement]'),
 (8,'','','',''),
 (9,'gfdgfd','gfdsgdsg','aaaaaaa','aaaaaaaaa'),
 (10,'','','',''),
 (11,'gfffffff','fffffff','fffffffff','fdfdsf'),
 (12,'gdfh','fhfh','fhfh','hfhdfh'),
 (13,'gdsgf','gfdsgdsg','user@gmail.com','dsfgdsg'),
 (14,'faf','34244','user@gmail.com','afsdfgasg'),
 (15,'fgdfg','535435','bk2008gupta@gmail.com','gfgdfgdg'),
 (16,'fdsf','24324','user@gmail.com','32fwr235'),
 (17,'fgdfg','4534','user@gmail.com','gdfgdfg'),
 (18,'tret','1234567890','user@gmail.com','gdfgdfg'),
 (19,'rrrrrrrrr','1234567890','user@gmail.com','rrrrrrrrrr'),
 (20,'uuuuuuuuuu','1234567890','user@gmail.com','gfgdfg'),
 (21,'44444','4444444444','user@gmail.com','5455'),
 (22,'eet','1234567890','user@gmail.com','dgdg'),
 (23,'fdf','1234567890','user@gmail.com','gfgdfg'),
 (24,'hg','1234567890','user@gmail.com','tgdfgdfg'),
 (25,'gvdg','1234567890','user@gmail.com','ttt'),
 (26,'rre','1234567890','user@gmail.com','sdfgg'),
 (27,'erwe','1234567890','user@gmail.com','dsf'),
 (28,'12','1234567890','user@gmail.com','fsf');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;


--
-- Definition of table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `type` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `contact_no` varchar(45) NOT NULL,
  `email_id` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `facilities` varchar(100) NOT NULL,
  `timing` varchar(100) NOT NULL,
  `dr_names` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospital`
--

/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` (`id`,`name`,`address`,`type`,`city`,`contact_no`,`email_id`,`website`,`facilities`,`timing`,`dr_names`) VALUES 
 (1,'Chl apolo','Lig','City','Indore','dsg','gdfg','gdfg','dfgdfg','gfdfg','dfgdfg'),
 (2,'gdfg','gdfg','Urban','gdfg','gfdfg','gdfg','gdsg','dgf','gdsg','dgfdfg'),
 (3,'Arvindo','Sawer road','<Hospital Type>','indore','432235','fjjfsk;f','kf;skd;lsk','xray, sonography','ifriri','ifirwr'),
 (5,'Bhandari','pardeshipura','City','Bhopal','55345235','sterter@gmail.com','bhandari.com','All facilities available','24 hrs','Adsfas fsdflskdf; k;lfksd;f k;s'),
 (6,'ggggggggggggg','sdfsf','Urban','dfsfs','42343','user@gmail.com','fsdfsf','dfdsf','dsfsf','dsfdfdsf'),
 (7,'bbbbbbbbb','fdffd','City','vcbvcb','2345235','user@gmail.com','gdgdsgg','gdgdfg','dfgdfg','dfgdg'),
 (8,'bbbbbbbbb','fdffd','City','vcbvcb','2345235','user@gmail.com','gdgdsgg','gdgdfg','dfgdfg','dfgdg'),
 (9,'hhhhhhhh','hhhhhhhhhhh','City','hhhhhhhhhh','534535','user@gmail.com','4435','rtret','tt','ertert'),
 (10,'hhhhhhhh','hhhhhhhhhhh','City','hhhhhhhhhh','534535','user@gmail.com','4435','rtret','tt','ertert'),
 (11,'ttttt','ttttttt','City','gdfg','54444','user@gmail.com','56','yhfh','46','hfhgfgh'),
 (12,'rerer','rer','City','rr','1234567890','user@gmail.com','gdgdsggggdg','ggdfg','gdfgdf','gdfgdfg');
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;


--
-- Definition of table `route`
--

DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `route_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `city` varchar(45) NOT NULL,
  `route_name` varchar(45) NOT NULL,
  `route_information` varchar(200) NOT NULL,
  `route_location` varchar(200) NOT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `route`
--

/*!40000 ALTER TABLE `route` DISABLE KEYS */;
INSERT INTO `route` (`route_id`,`city`,`route_name`,`route_information`,`route_location`,`type`) VALUES 
 (9,'Bhopal','Railway to Ashram','dsfdsf','dfdsfrgfdsg',''),
 (10,'sfdsf','dsfdsf','dsfdsf','dsfdf','City'),
 (11,'new','dsfdsf','dsfdsf','dsfdsf','Urban'),
 (12,'Indore','sdfdsf','sdff','dsfdsf','Urban'),
 (14,'Khandwa','jdjf','dasjfsf','asdf','City'),
 (15,'Khandwa','jaswadi','dfkljsf','sjdfsf','City'),
 (16,'city','city route','goa to delhi','Goa','City'),
 (17,'gfdsgds','gdsg','gdsg','dfdsfrgfdsg','Urban'),
 (18,'Khargone','Khandwa, Indore','Khargone to khandwa & knw to indore','State Highway1','City'),
 (23,'fgdgs','gdgdg','dgdgdg','update','City'),
 (24,'dfgdfg','gdgdfg','dfgdfg','dfgdgf','City'),
 (25,'dfgdfg','gdgdfg','dfgdfg','dfgdgf','City'),
 (27,'Indore','Indore route','fdsfdsfdf','Vijaynagar,Sukhliya,Navlakha','City'),
 (28,'Khandwa','Khandwa','kjfdsjfasf','Bombay bazar,Sarafa,Dadaji','City');
/*!40000 ALTER TABLE `route` ENABLE KEYS */;


--
-- Definition of table `tourism`
--

DROP TABLE IF EXISTS `tourism`;
CREATE TABLE `tourism` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `place_name` varchar(45) NOT NULL,
  `description` varchar(200) NOT NULL,
  `location` varchar(100) NOT NULL,
  `attractious` varchar(100) NOT NULL,
  `wayto_reach` varchar(100) NOT NULL,
  `helpline_no` varchar(45) NOT NULL,
  `tour_operator` varchar(45) NOT NULL,
  `image_file` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tourism`
--

/*!40000 ALTER TABLE `tourism` DISABLE KEYS */;
INSERT INTO `tourism` (`id`,`type`,`city`,`place_name`,`description`,`location`,`attractious`,`wayto_reach`,`helpline_no`,`tour_operator`,`image_file`) VALUES 
 (23,'City','gfg','gfg','fsdfs','fsf','fsfsd','sdfsf','2343212345','sfsf','data/log.jpg'),
 (24,'City','dasd','dasdasd','fsf','fsf','fdasf','dsfsf','2343212345','fsdf','data/log.jpg'),
 (25,'Urban','Khandwa','Dadaji ','Hellp','fdsfsf','dsfdsf','dsfdsf','1234567890','hariom','data/jaguar.jpg');
/*!40000 ALTER TABLE `tourism` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
