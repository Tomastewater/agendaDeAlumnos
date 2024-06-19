-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 19, 2024 at 04:47 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agendappi2`
--

-- --------------------------------------------------------

--
-- Table structure for table `departamentos`
--

CREATE TABLE `departamentos` (
  `DepartamentoID` int(11) NOT NULL,
  `NombreDepartamento` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `departamentos`
--

INSERT INTO `departamentos` (`DepartamentoID`, `NombreDepartamento`) VALUES
(1, 'Comercio'),
(2, 'Contabilidad y Finanzas'),
(3, 'Licenciatura en Informática'),
(4, 'Gestión de Sistemas de Información');

-- --------------------------------------------------------

--
-- Table structure for table `materias`
--

CREATE TABLE `materias` (
  `MateriaID` int(11) NOT NULL,
  `NombreMateria` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `materias`
--

INSERT INTO `materias` (`MateriaID`, `NombreMateria`) VALUES
(1, 'Marketing'),
(2, 'Economía Internacional'),
(3, 'Gestión de Ventas'),
(4, 'Contabilidad Avanzada'),
(5, 'Análisis Financiero'),
(6, 'Auditoría'),
(7, 'Programación'),
(8, 'Bases de Datos'),
(9, 'Redes de Computadoras'),
(10, 'Sistemas de Información'),
(11, 'Administración de Proyectos'),
(12, 'Seguridad Informática');

-- --------------------------------------------------------

--
-- Table structure for table `personamaterias`
--

CREATE TABLE `personamaterias` (
  `ID` int(11) NOT NULL,
  `PersonaID` int(11) DEFAULT NULL,
  `MateriaID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `personamaterias`
--

INSERT INTO `personamaterias` (`ID`, `PersonaID`, `MateriaID`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 1, 3),
(4, 2, 1),
(5, 2, 2),
(6, 2, 3),
(7, 3, 1),
(8, 3, 2),
(9, 3, 3),
(10, 4, 4),
(11, 4, 5),
(12, 4, 6),
(13, 5, 4),
(14, 5, 5),
(15, 5, 6),
(16, 6, 4),
(17, 6, 5),
(18, 6, 6),
(19, 7, 7),
(20, 7, 8),
(21, 7, 9),
(22, 8, 7),
(23, 8, 8),
(24, 8, 9),
(25, 9, 7),
(26, 9, 8),
(27, 9, 9),
(28, 10, 10),
(29, 10, 11),
(30, 10, 12),
(31, 11, 10),
(32, 11, 11),
(33, 11, 12),
(34, 12, 10),
(35, 12, 11),
(36, 12, 12);

-- --------------------------------------------------------

--
-- Table structure for table `personas`
--

CREATE TABLE `personas` (
  `ID` int(11) NOT NULL,
  `DNI` varchar(20) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `DepartamentoID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `personas`
--

INSERT INTO `personas` (`ID`, `DNI`, `Nombre`, `Apellido`, `DepartamentoID`) VALUES
(1, '12345678', 'Carlos', 'Pérez', 1),
(2, '23456789', 'María', 'Gómez', 1),
(3, '34567890', 'Juan', 'Rodríguez', 1),
(4, '45678901', 'Ana', 'Fernández', 2),
(5, '56789012', 'Luis', 'Martínez', 2),
(6, '67890123', 'Elena', 'Sánchez', 2),
(7, '78901234', 'Miguel', 'López', 3),
(8, '89012345', 'Laura', 'García', 3),
(9, '90123456', 'Jorge', 'Hernández', 3),
(10, '01234567', 'Sofía', 'Ramírez', 4),
(11, '12349876', 'Andrés', 'Torres', 4),
(12, '23450987', 'Marta', 'Vargas', 4);

-- --------------------------------------------------------

--
-- Stand-in structure for view `vistapersonasdepartamentos`
-- (See below for the actual view)
--
CREATE TABLE `vistapersonasdepartamentos` (
`ID` int(11)
,`DNI` varchar(20)
,`Nombre` varchar(50)
,`Apellido` varchar(50)
,`Departamento` varchar(50)
);

-- --------------------------------------------------------

--
-- Structure for view `vistapersonasdepartamentos`
--
DROP TABLE IF EXISTS `vistapersonasdepartamentos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`` SQL SECURITY DEFINER VIEW `vistapersonasdepartamentos`  AS SELECT `p`.`ID` AS `ID`, `p`.`DNI` AS `DNI`, `p`.`Nombre` AS `Nombre`, `p`.`Apellido` AS `Apellido`, `d`.`NombreDepartamento` AS `Departamento` FROM (`personas` `p` join `departamentos` `d` on(`p`.`DepartamentoID` = `d`.`DepartamentoID`))  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`DepartamentoID`);

--
-- Indexes for table `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`MateriaID`);

--
-- Indexes for table `personamaterias`
--
ALTER TABLE `personamaterias`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `PersonaID` (`PersonaID`),
  ADD KEY `MateriaID` (`MateriaID`);

--
-- Indexes for table `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `DNI` (`DNI`),
  ADD KEY `DepartamentoID` (`DepartamentoID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `departamentos`
--
ALTER TABLE `departamentos`
  MODIFY `DepartamentoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `materias`
--
ALTER TABLE `materias`
  MODIFY `MateriaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `personamaterias`
--
ALTER TABLE `personamaterias`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `personas`
--
ALTER TABLE `personas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `personamaterias`
--
ALTER TABLE `personamaterias`
  ADD CONSTRAINT `personamaterias_ibfk_1` FOREIGN KEY (`PersonaID`) REFERENCES `personas` (`ID`),
  ADD CONSTRAINT `personamaterias_ibfk_2` FOREIGN KEY (`MateriaID`) REFERENCES `materias` (`MateriaID`);

--
-- Constraints for table `personas`
--
ALTER TABLE `personas`
  ADD CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`DepartamentoID`) REFERENCES `departamentos` (`DepartamentoID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
