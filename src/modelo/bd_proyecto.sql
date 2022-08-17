-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_proyecto
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ambulancias`
--

DROP TABLE IF EXISTS `ambulancias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ambulancias` (
  `placa` varchar(7) NOT NULL,
  PRIMARY KEY (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ambulancias`
--

LOCK TABLES `ambulancias` WRITE;
/*!40000 ALTER TABLE `ambulancias` DISABLE KEYS */;
INSERT INTO `ambulancias` VALUES ('AD519XM'),('FG138NU'),('TY482MK');
/*!40000 ALTER TABLE `ambulancias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clinicas`
--

DROP TABLE IF EXISTS `clinicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clinicas` (
  `id_clinica` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `municipio` varchar(15) NOT NULL,
  PRIMARY KEY (`id_clinica`),
  KEY `fk_municipio_idx` (`municipio`),
  CONSTRAINT `fk_municipio` FOREIGN KEY (`municipio`) REFERENCES `municipios` (`nombre`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinicas`
--

LOCK TABLES `clinicas` WRITE;
/*!40000 ALTER TABLE `clinicas` DISABLE KEYS */;
INSERT INTO `clinicas` VALUES (1,'METROPOLITANA','BARUTA'),(3,'FLORESTA','CHACAO'),(7,'EL MARQUES','SUCRE'),(8,'LA TRINIDAD','HATILLO'),(11,'LOIRA','LIBERTADOR'),(12,'SANTA SOFIA','BARUTA'),(13,'SANATRIX','CHACAO'),(14,'SANTIAGO DE LEON','LIBERTADOR');
/*!40000 ALTER TABLE `clinicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiales`
--

DROP TABLE IF EXISTS `materiales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materiales` (
  `id_material` int(11) NOT NULL,
  `placa` varchar(7) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_placaMateriales_idx` (`placa`),
  CONSTRAINT `fk_placaMateriales` FOREIGN KEY (`placa`) REFERENCES `ambulancias` (`placa`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiales`
--

LOCK TABLES `materiales` WRITE;
/*!40000 ALTER TABLE `materiales` DISABLE KEYS */;
INSERT INTO `materiales` VALUES (145,'AD519XM','GAZA',5,1),(189,'AD519XM','JERINGAS',7,3),(145,'FG138NU','GAZA',2,4),(189,'FG138NU','JERINGAS',2,5),(145,'TY482MK','GAZA',7,6),(189,'TY482MK','JERINGAS',5,7),(200,'AD519XM','FERULA',3,8),(200,'FG138NU','FERULA',1,9),(200,'TY482MK','FERULA',2,10),(160,'AD519XM','VENDAS',8,11),(160,'FG138NU','VENDAS',3,12),(160,'TY482MK','VENDAS',6,13),(146,'AD519XM','DESFIBRILADOR',1,14),(146,'FG138NU','DESFIBRILADOR',1,15),(146,'TY482MK','DESFIBRILADOR',1,16),(150,'AD519XM','TENSIOMETRO',2,17),(150,'FG138NU','TENSIOMETRO',2,18),(150,'TY482MK','TENSIOMETRO',2,19),(153,'AD519XM','TORNIQUETE',3,20),(153,'FG138NU','TORNIQUETE',2,21),(153,'TY482MK','TORNIQUETE',2,22);
/*!40000 ALTER TABLE `materiales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `municipios`
--

DROP TABLE IF EXISTS `municipios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `municipios` (
  `nombre` varchar(80) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `municipios`
--

LOCK TABLES `municipios` WRITE;
/*!40000 ALTER TABLE `municipios` DISABLE KEYS */;
INSERT INTO `municipios` VALUES ('BARUTA'),('CHACAO'),('HATILLO'),('LIBERTADOR'),('SUCRE');
/*!40000 ALTER TABLE `municipios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacientes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `apellido` varchar(80) NOT NULL,
  `cedula` varchar(15) NOT NULL,
  `genero` varchar(13) NOT NULL,
  `fecha_nac` date NOT NULL,
  `tipo_sangre` varchar(6) NOT NULL,
  `numero_telefono` varchar(45) NOT NULL,
  `municipio` varchar(13) NOT NULL,
  `fecha_reg` date NOT NULL,
  `estado` varchar(12) NOT NULL,
  `correo` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (10,'LIONEL','MESSI','28155432','MASCULINO','1987-06-24','AB-','0414-9902174','LIBERTADOR','2022-06-11','INACTIVO','leomessi@gmail.com'),(111,'LUKA','MODRIC','28301783','MASCULINO','1985-02-08','A-','0412-2014371','LIBERTADOR','2022-06-12','ACTIVO','lukita@yahoo.com'),(156,'ANTONIO','KROSS','30395284','MASCULINO','1986-04-04','A-','0414-2166328','CHACAO','2022-06-13','ACTIVO','toni@gmail.com'),(333,'VINICIUS','JUNIOR','28149222','MASCULINO','1999-05-05','AB','04242783720','BARUTA','2022-06-12','ACTIVO','vinijr@gmail.com'),(444,'CRISTOBAL','SORIA','27392939','FEMENINO','2000-02-01','O-','04242620102','HATILLO','2022-06-13','ACTIVO','cristobak@gmail.com'),(456,'JOSE','EL ASMAR','987654','MASCULINO','1998-06-05','A-','0414-703','CHACAO','2022-06-10','INACTIVO','joselasmar@hotmail.com'),(555,'KARIM','BENZEMA','19805388','MASCULINO','1987-12-19','A','0412-1456876','SUCRE','2022-06-11','ACTIVO','benzi@gmail.com'),(777,'CRISTIANO','RONALDO','10277666','MASCULINO','1985-02-05','O','0414-1369781','LIBERTADOR','2022-06-11','INACTIVO','cr7@gmail.com'),(1234,'MARIA','PEREZ','12345678','FEMENINO','2001-01-01','A-','0424156478','HATILLO','2022-06-14','ACTIVO','gigo@yahoo.com'),(1789,'DIEGO','ARGOTTE','26837785','MASCULINO','2001-11-28','O','0414-3363749','BARUTA','2022-06-10','INACTIVO','diegoargottez@gmail.com'),(1962,'GIGI','BUFFON','28546123','FEMENINO','1978-03-08','B-','0426-555321','LIBERTADOR','2022-06-12','ACTIVO','gigi@hotmail.com'),(2345,'DANI','CEBALLOS','8945435','MASCULINO','1991-01-01','O-','0424-1051886','SUCRE','2022-06-10','INACTIVO','daniceballos@gmail.com'),(2661,'JOSE LUIS','HERRERA','6089311','MASCULINO','1996-05-16','B-','0416-5851605','LIBERTADOR','2022-06-11','ACTIVO','aja@gmail.com'),(2812,'VICTOR MANUEL','BLANCO MAGALLANES','28308698','MASCULINO','2001-12-28','O-','0424-2333582','SUCRE','2022-06-09','INACTIVO','victorblanco281201@gmail.com');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportes`
--

DROP TABLE IF EXISTS `reportes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reportes` (
  `id_reporte` int(11) NOT NULL AUTO_INCREMENT,
  `id_paciente` int(11) NOT NULL,
  `municipio` varchar(15) NOT NULL,
  `clinica` varchar(20) NOT NULL,
  `fecha` date NOT NULL,
  `descripcion` varchar(256) NOT NULL,
  `ambulancia` varchar(7) NOT NULL,
  PRIMARY KEY (`id_reporte`),
  KEY `fk_id_paciente_idx` (`id_paciente`),
  CONSTRAINT `fk_id_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportes`
--

LOCK TABLES `reportes` WRITE;
/*!40000 ALTER TABLE `reportes` DISABLE KEYS */;
INSERT INTO `reportes` VALUES (1,111,'CHACAO','SANATRIX','2022-07-24','El paciente se rompio la nariz','AD519XM'),(3,156,'CHACAO','SANATRIX','2022-07-24','El paciente se rompio la boca','AD519XM'),(4,333,'SUCRE','EL MARQUES','2022-07-24','Se golpeo la cabeza','AD519XM'),(9,333,'CHACAO','SANATRIX','2022-07-29','Se doblo el tobillo','FG138NU'),(10,333,'LIBERTADOR','LOIRA','2022-07-29','Se rompio el tobillo','AD519XM'),(11,444,'BARUTA','SANTA SOFIA','2022-07-29','Se rompio el perone','AD519XM'),(12,555,'SUCRE','EL MARQUES','2022-07-29','Se rompio el pecho','AD519XM'),(13,555,'SUCRE','EL MARQUES','2022-07-29','Se rompio el dedo','AD519XM'),(14,1962,'BARUTA','SANTA SOFIA','2022-07-29','Se rompio el femur','AD519XM');
/*!40000 ALTER TABLE `reportes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `cargo` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'victor','irma0403','Administrador'),(2,'jose','123456','Administrador'),(3,'diego','654321','Administrador'),(4,'joseL','00000','Medico');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-30  0:00:43
