-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: training
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
-- Table structure for table `training_tb`
--

DROP TABLE IF EXISTS `training_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `training_tb` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` varchar(32) DEFAULT NULL,
  `progress` int(11) DEFAULT NULL,
  `commissionAmount` float DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `avgRating` float DEFAULT NULL,
  `startDate` varchar(32) DEFAULT NULL,
  `endDate` varchar(32) DEFAULT NULL,
  `startTime` varchar(32) DEFAULT NULL,
  `endTime` varchar(32) DEFAULT NULL,
  `amountReceived` float DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(32) DEFAULT NULL,
  `mentorId` bigint(20) DEFAULT NULL,
  `mentorName` varchar(32) DEFAULT NULL,
  `skillId` bigint(20) DEFAULT NULL,
  `skillName` varchar(20) DEFAULT NULL,
  `fees` float DEFAULT NULL,
  `razorpayPaymentId` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training_tb`
--

LOCK TABLES `training_tb` WRITE;
/*!40000 ALTER TABLE `training_tb` DISABLE KEYS */;
INSERT INTO `training_tb` VALUES (1,'not completed',50,100,4,4.5,'2018-07-16','2018-08-16','09:00:00','18:00:00',2000,15,'aiswarya',1,'shilpa',10,'spring boot',5000,'021'),(3,'not completed',75,100,4,4.5,'2018-07-16','2018-08-16','09:00:00','18:00:00',2000,16,'chandrika',1,'viju',8,'angular',5000,'054'),(4,'not completed',75,100,4,4.5,'2018-07-16','2018-08-16','09:00:00','18:00:00',2000,17,'aakanksha',25,'sarah',41,'Spring',5000,'454');
/*!40000 ALTER TABLE `training_tb` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-08 15:33:45
