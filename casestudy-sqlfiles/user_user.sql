-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: user
-- ------------------------------------------------------
-- Server version	5.7.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(500) DEFAULT NULL,
  `role` varchar(12) DEFAULT NULL,
  `firstName` varchar(25) DEFAULT NULL,
  `lastName` varchar(25) DEFAULT NULL,
  `active` tinyint(1) DEFAULT '1',
  `yearsOfExperience` int(11) DEFAULT NULL,
  `confirmedSignUp` tinyint(1) DEFAULT NULL,
  `regCode` varchar(100) DEFAULT NULL,
  `contactNumber` bigint(20) DEFAULT NULL,
  `resetPassword` tinyint(1) DEFAULT NULL,
  `resetPasswordDate` date DEFAULT NULL,
  `linkedInUrl` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'chandu@gmail.com','Chandu','Admin','Chandrika','Prakash',1,0,0,NULL,9876756764,0,'2019-10-04',NULL),(3,'deepu@gmail.com','Deepu','User','Deepika','Purohit',1,0,0,NULL,9880756764,0,NULL,NULL),(4,'aishu@gmail.com','Aishu','Mentor','Aishwarya','V',0,0,0,NULL,9880756987,0,NULL,NULL),(5,'aakan@gmail.com','Aakanksha','Mentor','Aakanksha','V',0,0,0,NULL,9990756987,0,NULL,NULL),(6,'viju@gmail.com','Viju','Mentor','Viju','Maharaj',1,1,0,NULL,9990756987,0,NULL,'https://linkedIn/viju'),(7,'chandrika@gmail.com','$2a$12$9MGRW11OEBAZd483CLEbbOoHXA0oTkTQahwksqteOVhWFrxpvy6oi','Admin',NULL,NULL,1,0,0,NULL,NULL,0,NULL,NULL),(10,'chand@gmail.com','$2a$10$ymX7lGSvMxs1fqVI9x4feeTMPRztOUxcEyQwKAz9W7pj9eKDRF22C',NULL,NULL,NULL,1,0,0,NULL,NULL,0,NULL,NULL),(11,'aisu@gmail.com','$2a$10$KU..NNXFbNzzUpDs8MFuXu4CU.X6tVVadAOAgZm3JQv81ETNS3Hkq','User',NULL,NULL,1,0,0,NULL,9876767876,0,NULL,NULL),(12,'renu@gmail.com','$2a$10$yXmkjM5I68aIhZtx9Or0/O28CW5IevTpLudMsL27uBmVAJX41gXFK',NULL,NULL,NULL,1,0,0,NULL,NULL,0,NULL,NULL),(13,'nivi@gmail.com','$2a$10$ebzXp9Fvj5MvIaoHFVb4uO2MIG2zxVaoXQmW0zV.Q99pYss/Acxla',NULL,NULL,NULL,1,0,0,NULL,NULL,0,NULL,NULL),(14,'ashu@gmail.com','$2a$10$gjhJWtHTamFAILSacuv6TOU/sY5Q7WMnpxgcPfSk3tJUNhSPokmxK',NULL,NULL,NULL,1,0,0,NULL,NULL,0,NULL,NULL),(15,'abhi@gmail.com','$2a$10$gZWEdqupD3cnMnf6A2fJ.erJitFiUiwJkRjQj4bZ8/ZIigO/I9gw6','User',NULL,NULL,1,0,0,NULL,9767658878,0,NULL,NULL),(16,'chandrika241997@gmail.com','$2a$10$U2F6/F7VCJg3qXz/fzn.0eeKmqxjKTnTD/G.ywu5IuQUau2Vjyefu','User','Chandrika','Prakash',1,0,0,NULL,NULL,1,'2019-10-05',NULL),(18,'prakash@gmail.com','$2a$10$NIpoCPc5NufJZhNJRaAvIuD6R2ooHA677DzUGmo8I4d/FTe.Ftqyy','Admin',NULL,NULL,1,0,0,NULL,9767658878,0,NULL,NULL),(19,'chandrika.1js15cs030@gmail.com','$2a$10$5gj98CZNI0QlQHWc3cxePOYsIWGr6DskvXWZnx.lt6tFR1CKBPdAC','Mentor','chandrika','p',1,1,0,NULL,7896987987,0,NULL,'http://kugkibjhkjhn'),(20,'viju@gmail.com','$2a$10$oaZ4HLGhgHpmiAvazsonUOOHvjn7JSZ8KG3NrwK81AItkivKq1oPG','Mentor','Viju','P',1,1,0,NULL,7687678978,0,NULL,'http://kugkibjhkjhn'),(21,'vrushali@gmail.com','$2a$10$b3GObNIc.ycOdbeYk6tzmeR8QUJr0sclhrcyaXrgUb9ZKtl.k/BLa','Mentor','Vrushali','Punde',1,1,0,NULL,8753687946,0,NULL,'http://gfhkbhfkdb'),(22,'harry@gmail.com','$2a$10$1FLLKW01bZJXqNNWB4LFCef5ZBkrD6YQEPg8p6jsz9QwgBVDvxlu.','Mentor','harry','potter',1,2,0,NULL,398648067,0,NULL,'http://kugkibjhkjhn'),(23,'viju@gmail.com','$2a$10$hfwGu148PunFtskL4dYuyuHE/sF/ntizxf6YCqYvctoD90Ncn9wbu','Mentor','Viju','P',1,1,0,NULL,7687678978,0,NULL,'http://kugkibjhkjhn'),(24,'viju@gmail.com','$2a$10$sXZ1ZhbItomYIj36Ek31se7wlE3lnN94h7y/rqYdpyIBubmIzevU.','Mentor','Viju','P',1,6,0,NULL,7687678978,0,NULL,'http://kugkibjhkjhn');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-08 15:36:29
