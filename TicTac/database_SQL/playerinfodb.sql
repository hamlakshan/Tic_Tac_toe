-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 30, 2014 at 11:56 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `playerinfodb`
--
CREATE DATABASE IF NOT EXISTS `playerinfodb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `playerinfodb`;

-- --------------------------------------------------------

--
-- Table structure for table `multilayer`
--

CREATE TABLE IF NOT EXISTS `multilayer` (
  `Player1` text NOT NULL,
  `Score1` int(11) NOT NULL,
  `Player2` text NOT NULL,
  `Score2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `multilayer`
--

INSERT INTO `multilayer` (`Player1`, `Score1`, `Player2`, `Score2`) VALUES
('Manoj', 0, 'Anusha', 1),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('Tharaka', 5, 'Dilan', 0),
('abcd', 2, 'efgh', 1),
('Tharaka', 5, 'Dilan', 0),
('anusha', 2, 'nishadi', 0);

-- --------------------------------------------------------

--
-- Table structure for table `sigleplayertable`
--

CREATE TABLE IF NOT EXISTS `sigleplayertable` (
  `Name` text NOT NULL,
  `ComScore` int(11) NOT NULL,
  `PlayerScore` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sigleplayertable`
--

INSERT INTO `sigleplayertable` (`Name`, `ComScore`, `PlayerScore`) VALUES
('Anusha', 0, 5),
('Manoj', 0, 6),
('Manoj', 0, 6);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
