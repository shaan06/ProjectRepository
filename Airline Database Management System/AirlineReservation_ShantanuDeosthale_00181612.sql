CREATE DATABASE  IF NOT EXISTS `airline` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `airline`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: airline
-- ------------------------------------------------------
-- Server version	5.1.33-community

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
-- Table structure for table `aircrafts`
--

DROP TABLE IF EXISTS `aircrafts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aircrafts` (
  `AcID` int(11) NOT NULL,
  `AcNumber` varchar(32) NOT NULL,
  `Capacity` int(11) NOT NULL,
  `MfdBy` varchar(128) NOT NULL,
  `MfdOn` datetime NOT NULL,
  PRIMARY KEY (`AcID`),
  UNIQUE KEY `AcNumber_UNIQUE` (`AcNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aircrafts`
--

LOCK TABLES `aircrafts` WRITE;
/*!40000 ALTER TABLE `aircrafts` DISABLE KEYS */;
INSERT INTO `aircrafts` VALUES (1,'AB345',500,'Airbus','2006-02-15 00:00:00'),(2,'AB123',350,'Airbus','2006-03-15 00:00:00'),(3,'AB654',150,'Boeing','2010-05-19 00:00:00'),(4,'AB987',450,'Airbus','2013-10-25 00:00:00'),(5,'AB876',650,'Airbus','2015-11-25 00:00:00'),(6,'AB234',500,'Boeing','2008-11-15 00:00:00');
/*!40000 ALTER TABLE `aircrafts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `airfare`
--

DROP TABLE IF EXISTS `airfare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `airfare` (
  `AfID` int(11) NOT NULL DEFAULT '0',
  `FareCurrency` int(11) DEFAULT NULL,
  `FSCCurrency` int(11) DEFAULT NULL,
  `RouteCode` varchar(45) DEFAULT NULL,
  `RfID` int(11) DEFAULT NULL,
  PRIMARY KEY (`AfID`),
  UNIQUE KEY `RfID_UNIQUE` (`RfID`),
  KEY `fk_RfiD_idx` (`RfID`),
  CONSTRAINT `fk_RfiD` FOREIGN KEY (`RfID`) REFERENCES `route` (`RtID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airfare`
--

LOCK TABLES `airfare` WRITE;
/*!40000 ALTER TABLE `airfare` DISABLE KEYS */;
INSERT INTO `airfare` VALUES (1,100,20,'BOS-MUM',1),(2,110,20,'MUM-BOS',2),(3,120,30,'NYC-CHI',3),(4,90,10,'ATL-LAS',4);
/*!40000 ALTER TABLE `airfare` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `airline`.`airfare_BEFORE_INSERT` BEFORE INSERT ON `airfare` FOR EACH ROW
BEGIN
set new.routecode = (select routecode from route where rtid = new.rfid);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `charges`
--

DROP TABLE IF EXISTS `charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `charges` (
  `ChID` int(11) NOT NULL,
  `Title` varchar(32) DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ChID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charges`
--

LOCK TABLES `charges` WRITE;
/*!40000 ALTER TABLE `charges` DISABLE KEYS */;
INSERT INTO `charges` VALUES (1,'Urgent Cancellation',33,'33.3% will be charged for cancellation for booking within 11 hrs from flight time'),(2,'Excess Baggage',21,'20.5 will be charged for Excess Baggage ');
/*!40000 ALTER TABLE `charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_details`
--

DROP TABLE IF EXISTS `contact_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact_details` (
  `CnID` int(11) NOT NULL,
  `Email` varchar(16) NOT NULL,
  `Cell` varchar(16) NOT NULL,
  `City` varchar(64) DEFAULT NULL,
  `passengers_PsID` int(11) DEFAULT NULL,
  PRIMARY KEY (`CnID`),
  UNIQUE KEY `passengers_PsID_UNIQUE` (`passengers_PsID`),
  KEY `fk_contact_details_passengers1_idx` (`passengers_PsID`),
  CONSTRAINT `fk_contact_details_passengers1` FOREIGN KEY (`passengers_PsID`) REFERENCES `passengers` (`PsID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_details`
--

LOCK TABLES `contact_details` WRITE;
/*!40000 ALTER TABLE `contact_details` DISABLE KEYS */;
INSERT INTO `contact_details` VALUES (1,'birwa@gmail.com','617452658','Boston',1),(2,'shantanu@gmail','9044802750','Boston',2),(3,'Nitin@gmail.com','647859625','Boston',3),(4,'Paul@gmail.com','8254568526','Boston',4);
/*!40000 ALTER TABLE `contact_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discounts`
--

DROP TABLE IF EXISTS `discounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discounts` (
  `DiID` int(11) NOT NULL,
  `Title` varchar(32) DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DiID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discounts`
--

LOCK TABLES `discounts` WRITE;
/*!40000 ALTER TABLE `discounts` DISABLE KEYS */;
INSERT INTO `discounts` VALUES (1,'Prime Membership',5,'Prime MemberShip Gets You 5% Off'),(2,'Early Tickets Booking',10,'Early Ticktes Gets You 10% Off'),(3,'No Discount',0,'No Discount Has Been Awarded');
/*!40000 ALTER TABLE `discounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `EmpID` int(11) NOT NULL,
  `Name` varchar(32) NOT NULL,
  `Address` varchar(32) NOT NULL,
  `Designation` varchar(32) NOT NULL,
  `Email` varchar(16) NOT NULL,
  `Tel` varchar(16) NOT NULL,
  `Ext` int(11) DEFAULT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Andrew','CityView','AssoManager','sdeos@gm','3122320',1),(2,'Micheal','Fenway','GenManager','Micheal@gml.com','616541',1),(3,'Sam','Park Drive','AssitManager','Sam@gil.com','85216592',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_schedule`
--

DROP TABLE IF EXISTS `flight_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight_schedule` (
  `FlID` int(11) NOT NULL DEFAULT '0',
  `FlightDate` datetime DEFAULT NULL,
  `Departure` time DEFAULT NULL,
  `Arrival` time DEFAULT NULL,
  `NetFare` int(11) DEFAULT NULL,
  `FlightNumber` varchar(45) DEFAULT NULL,
  `AfID` int(11) DEFAULT NULL,
  `AcID` int(11) DEFAULT NULL,
  PRIMARY KEY (`FlID`),
  KEY `fk_AfID_idx` (`AfID`),
  KEY `fk_AcID_idx` (`AcID`),
  CONSTRAINT `fk_AcID` FOREIGN KEY (`AcID`) REFERENCES `aircrafts` (`AcID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_AfID` FOREIGN KEY (`AfID`) REFERENCES `airfare` (`AfID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_schedule`
--

LOCK TABLES `flight_schedule` WRITE;
/*!40000 ALTER TABLE `flight_schedule` DISABLE KEYS */;
INSERT INTO `flight_schedule` VALUES (1,'2017-02-15 00:00:00','10:25:15','21:02:00',120,'AB345',1,1),(2,'2017-06-15 00:00:00','15:25:15','21:02:00',130,'AB987',2,4),(3,'2017-08-15 00:00:00','16:25:15','19:02:00',150,'AB123',3,2),(4,'2020-08-15 00:00:00','06:20:15','10:22:00',100,'AB987',4,4);
/*!40000 ALTER TABLE `flight_schedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `airline`.`flight_schedule_BEFORE_INSERT` BEFORE INSERT ON `flight_schedule` FOR EACH ROW
BEGIN
set new.netfare = (select farecurrency + FSCcurrency from airfare where afid = new.afid),
new.FlightNumber = (select AcNumber from aircrafts where acid = new.acid);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Temporary view structure for view `passengerflightdetails`
--

DROP TABLE IF EXISTS `passengerflightdetails`;
/*!50001 DROP VIEW IF EXISTS `passengerflightdetails`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `passengerflightdetails` AS SELECT 
 1 AS `name`,
 1 AS `address`,
 1 AS `age`,
 1 AS `Departuredate`,
 1 AS `Bookingdate`,
 1 AS `totalPrice`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `passengers`
--

DROP TABLE IF EXISTS `passengers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passengers` (
  `PsID` int(11) NOT NULL,
  `Name` varchar(32) NOT NULL,
  `Address` varchar(64) NOT NULL,
  `Age` int(11) NOT NULL,
  `Nationality` varchar(16) NOT NULL,
  PRIMARY KEY (`PsID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers`
--

LOCK TABLES `passengers` WRITE;
/*!40000 ALTER TABLE `passengers` DISABLE KEYS */;
INSERT INTO `passengers` VALUES (1,'Birwa','Peterborough',22,'Indian'),(2,'Shantanu','CityView',22,'Indian'),(3,'Nitin','Germain St',23,'Indian'),(4,'Paul','Mission Main',24,'American'),(5,'Amish','South St',23,'Indian');
/*!40000 ALTER TABLE `passengers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `route`
--

DROP TABLE IF EXISTS `route`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `route` (
  `RtID` int(11) NOT NULL DEFAULT '0',
  `Airport` varchar(32) NOT NULL,
  `Source` varchar(32) NOT NULL,
  `RouteCode` varchar(16) NOT NULL,
  `Arrival` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`RtID`),
  UNIQUE KEY `RouteCode` (`RouteCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `route`
--

LOCK TABLES `route` WRITE;
/*!40000 ALTER TABLE `route` DISABLE KEYS */;
INSERT INTO `route` VALUES (1,'Logan Internation','Mumbai','BOS-MUM','Boston'),(2,'CSI Mumbai','Boston','MUM-BOS','Mumbai'),(3,'JohnFKenndy','NewYork','NYC-CHI','Chicago'),(4,'Atlanta Intenational','Atlanta','ATL-LAS','Las Vegas');
/*!40000 ALTER TABLE `route` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactionpassengerdetails`
--

DROP TABLE IF EXISTS `transactionpassengerdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transactionpassengerdetails` (
  `PassengerName` varchar(45) DEFAULT NULL,
  `transactions_TsID` int(11) NOT NULL,
  `EmployeeName` varchar(45) DEFAULT NULL,
  UNIQUE KEY `transactions_TsID_UNIQUE` (`transactions_TsID`),
  KEY `fk_TransactionPassengerDetails_transactions1_idx` (`transactions_TsID`),
  CONSTRAINT `fk_TransactionPassengerDetails_transactions1` FOREIGN KEY (`transactions_TsID`) REFERENCES `transactions` (`TsID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactionpassengerdetails`
--

LOCK TABLES `transactionpassengerdetails` WRITE;
/*!40000 ALTER TABLE `transactionpassengerdetails` DISABLE KEYS */;
INSERT INTO `transactionpassengerdetails` VALUES ('Birwa',1,'A'),('Shantanu',2,'Andrew'),('Nitin',3,'Sam'),('Paul',4,'Micheal'),('Amish',5,'Micheal');
/*!40000 ALTER TABLE `transactionpassengerdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transactions` (
  `TsID` int(11) NOT NULL,
  `BookingDate` datetime DEFAULT NULL,
  `Type` bit(1) DEFAULT NULL,
  `DepartureDate` datetime DEFAULT '0000-00-00 00:00:00',
  `AirlineCharges` int(20) DEFAULT '0',
  `AirplaneDiscounts` int(20) DEFAULT NULL,
  `NetFare` int(11) DEFAULT NULL,
  `FlID` int(11) DEFAULT NULL,
  `ChID` int(11) DEFAULT NULL,
  `DiID` int(11) DEFAULT NULL,
  `PsID` int(11) DEFAULT NULL,
  `EmpID` int(11) DEFAULT NULL,
  PRIMARY KEY (`TsID`),
  UNIQUE KEY `PsID_UNIQUE` (`PsID`),
  KEY `fk_FlID_idx` (`FlID`),
  KEY `fk_ChID_idx` (`ChID`),
  KEY `fk_DiID_idx` (`DiID`),
  KEY `fk_PsID_idx` (`PsID`),
  KEY `fk_EmpID_idx` (`EmpID`),
  CONSTRAINT `fk_ChID` FOREIGN KEY (`ChID`) REFERENCES `charges` (`ChID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_DiID` FOREIGN KEY (`DiID`) REFERENCES `discounts` (`DiID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_EmpID` FOREIGN KEY (`EmpID`) REFERENCES `employee` (`EmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_FlID` FOREIGN KEY (`FlID`) REFERENCES `flight_schedule` (`FlID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_PsID` FOREIGN KEY (`PsID`) REFERENCES `passengers` (`PsID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (1,'2017-01-12 00:00:00','','2017-02-15 00:00:00',33,5,120,1,1,1,1,1),(2,'2017-07-12 00:00:00','\0','2017-06-15 00:00:00',33,10,130,2,1,2,2,1),(3,'2017-05-12 00:00:00','','2017-08-15 00:00:00',21,5,150,3,2,1,3,3),(4,'2017-01-12 00:00:00','','2017-02-15 00:00:00',21,5,120,1,2,1,4,2),(5,'2017-02-12 00:00:00','','2017-02-15 00:00:00',21,0,120,1,2,3,5,2);
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `airline`.`transactions_BEFORE_INSERT` BEFORE INSERT ON `transactions` FOR EACH ROW
BEGIN
set new.DepartureDate  = ( select Flightdate from  flight_schedule f where flID = new.Flid);
set new.airlinecharges = ( select amount from charges c where chid = new.chid);
set new.airplanediscounts = ( select amount from discounts d where diid = new.diid);
set new.netfare = ( select netfare from  flight_schedule f where flID = new.Flid);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `airline`.`transactions_AFTER_INSERT` AFTER INSERT ON `transactions` FOR EACH ROW
BEGIN
insert into transactionpassengerdetails
set transactions_TsID = new.Tsid,
 passengername = (select `name` from passengers where psid = new.psid),
 employeename = (select `name` from employee where empid = new.empid);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `airline`.`transactions_BEFORE_UPDATE` BEFORE UPDATE ON `transactions` FOR EACH ROW
BEGIN
set new.DepartureDate  = ( select Flightdate from  flight_schedule f where flID = new.Flid);
set new.airlinecharges = ( select amount from charges c where chid = new.chid);
set new.airplanediscounts = ( select amount from discounts d where diid = new.diid);
set new.netfare = ( select netfare from  flight_schedule f where flID = new.Flid);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'airline'
--

--
-- Dumping routines for database 'airline'
--
/*!50003 DROP PROCEDURE IF EXISTS `totalpricepertransaction` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `totalpricepertransaction`(in x int)
BEGIN
select netfare + ( netfare + (airlinecharges/100) ) - ( netfare + (airplanediscounts/100)) as totalprice from transactions where  tsid = x;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `TotalRevenue` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `TotalRevenue`()
BEGIN
select sum(netfare + ( netfare + (airlinecharges/100) ) - ( netfare + (airplanediscounts/100))) 
as TotalFare from transactions;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `passengerflightdetails`
--

/*!50001 DROP VIEW IF EXISTS `passengerflightdetails`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `passengerflightdetails` AS select `p`.`Name` AS `name`,`p`.`Address` AS `address`,`p`.`Age` AS `age`,`t`.`DepartureDate` AS `Departuredate`,`t`.`BookingDate` AS `Bookingdate`,((`t`.`NetFare` + (`t`.`NetFare` + (`t`.`AirlineCharges` / 100))) - (`t`.`NetFare` + (`t`.`AirplaneDiscounts` / 100))) AS `totalPrice` from (`passengers` `p` join `transactions` `t` on((`p`.`PsID` = `t`.`PsID`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-13 23:15:23
