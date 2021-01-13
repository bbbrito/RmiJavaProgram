CREATE DATABASE  IF NOT EXISTS `cadastro_curriculo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cadastro_curriculo`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: cadastro_curriculo
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `candidato`
--

DROP TABLE IF EXISTS `candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidato` (
  `email` varchar(255) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  `residencia` varchar(45) DEFAULT NULL,
  `formacao` varchar(45) DEFAULT NULL,
  `habilidades` varchar(100) DEFAULT NULL,
  `experiencia1` varchar(150) DEFAULT NULL,
  `experiencia2` varchar(150) DEFAULT NULL,
  `experiencia3` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidato`
--

LOCK TABLES `candidato` WRITE;
/*!40000 ALTER TABLE `candidato` DISABLE KEYS */;
INSERT INTO `candidato` VALUES ('andre.martins@gmail.com','André','Martins','Belém','Sistemas de Informação','Redes, Sistemas Distribuídos','Estágio de 1 ano na Empresa X, onde trabalhei com manutenção de redes de computadores','Trabalhei com redes de sensores por 5 anos na Empresa Y',''),('arlete.silva@gmail.com','Arlete','Silva','São Paulo','Engenharia da Computação','Robótica','Trabalhei com robótica por 5 anos na Empresa Y','Trabalhei com arduino por 2 anos na Empresa A',''),('bruno.costa@gmail.com','Bruno','Costa','Belém','Engenharia da Computação','Rede de sensores','Trabalhei por 5 anos na empresa Z com gerenciamento e manutenção de rede de sensores','',''),('claudio.lago@gmail.com','Claudio','Lago','São Paulo','Sistemas de Informação','Análise de Dados','Trabalhei 1 ano na Empresa X como analista de dados','',''),('joao.castro@gmail.com','João','Castro','Ananindeua','Ciência da Computação','Internet das Coisas, Computação em Nuvem','Estágio de 1 ano na Empresa X, onde trabalhei com computação em nuvem','Trabalhei com IoT e Computação em Nuvem por 2 anos na Empresa Z',''),('jose.santos@gmail.com','José','Santos','Belém','Ciência da Computação','Análise de Dados, Internet das Coisas, Computação em Nuvem','Estágio de 1 ano na Empresa X','',''),('marcos.fontes@gmail.com','Marcos','Fontes','São Paulo','Sistemas de Informação','Análise de Dados','Estágio de 1 ano na Empresa X, onde trabalhei como analista de dados','Trabalhei com aprendizado de máquina por 5 anos na Empresa Y',''),('maria_silva@gmail.com','Maria','Silva','Belém','Ciência da Computação','Análise de Dados, Internet das Coisas, Computação em Nuvem','Estágio de 1 ano na Empresa X, onde trabalhei como analista de dados','Trabalhei com IoT e Computação em Nuvem por 5 anos na Empresa Y',''),('paulo.maranhao@gmail.com','Paulo','Maranhão','Ananindeua','Sistemas de Informação','Análise de Dados, Internet das Coisas, Computação em Nuvem','Trabalhei por 1 ano na Empresa X como analista de dados','Trabalhei com IoT e Computação em Nuvem por 2 anos na Empresa X',''),('rafaela.magno@gmail.com','Rafaela','Magno','Belém','Engenharia da Computação','Internet das Coisas, Computação em Nuvem','Trabalhei com Arduino por 2 anos na empresa Z','Trabalhei com IoT e Computação em Nuvem por 5 anos na Empresa X','');
/*!40000 ALTER TABLE `candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'cadastro_curriculo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-12 20:17:06
