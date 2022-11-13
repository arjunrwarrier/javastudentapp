-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2022 at 05:35 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` int(11) NOT NULL,
  `studentid` int(11) NOT NULL,
  `physicsmark` int(11) NOT NULL,
  `chemistrymark` int(11) NOT NULL,
  `mathsmark` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`id`, `studentid`, `physicsmark`, `chemistrymark`, `mathsmark`) VALUES
(1, 1, 32, 45, 34),
(2, 2, 23, 30, 45),
(3, 3, 29, 39, 49),
(4, 4, 45, 47, 49),
(5, 5, 22, 27, 19),
(6, 6, 40, 38, 28),
(7, 7, 36, 22, 24),
(8, 10, 40, 17, 29),
(9, 11, 10, 17, 19),
(10, 12, 19, 20, 22),
(11, 13, 14, 22, 12),
(12, 14, 34, 41, 39),
(13, 15, 45, 50, 49),
(14, 16, 12, 15, 19),
(15, 17, 48, 49, 47),
(16, 18, 56, 34, 45),
(17, 19, 32, 34, 12);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `rollnumber` int(11) NOT NULL,
  `admno` int(11) NOT NULL,
  `college` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `rollnumber`, `admno`, `college`) VALUES
(2, 'Saron', 17, 101, 'mgu'),
(3, 'Sam', 3, 103, 'rit'),
(4, 'john', 4, 104, 'iit'),
(5, 'Rinu', 5, 105, 'mgu'),
(6, 'Sajith', 6, 106, 'bvm'),
(7, 'Abin', 7, 107, 'rit'),
(10, 'Nikhil', 8, 108, 'cas'),
(11, 'Jerin', 9, 109, 'nit'),
(12, 'Fahad', 10, 110, 'mgu'),
(13, 'Manny', 11, 111, 'mgu'),
(14, 'Sid', 12, 112, 'ktu'),
(15, 'Diego', 13, 113, 'nit'),
(16, 'Skipper', 14, 114, 'rit'),
(17, 'Jack', 15, 115, 'cas'),
(18, 'Aaron', 16, 116, 'rit'),
(19, 'Bruce', 17, 117, 'mgu');

-- --------------------------------------------------------

--
-- Table structure for table `studentsdummy`
--

CREATE TABLE `studentsdummy` (
  `id` int(11) NOT NULL,
  `sname` varchar(20) NOT NULL,
  `rnumber` int(11) NOT NULL,
  `adnumber` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentsdummy`
--

INSERT INTO `studentsdummy` (`id`, `sname`, `rnumber`, `adnumber`) VALUES
(1, 'Arjun', 1, 100),
(2, 'Dileesh', 2, 101),
(3, 'Sam', 3, 103),
(4, 'john', 4, 104),
(5, 'Rinu', 5, 105),
(6, 'Sajith', 6, 106),
(7, 'Abin', 7, 107),
(8, 'Nikhil', 8, 108),
(9, 'Jerin', 9, 109),
(10, 'Fahad', 10, 110),
(11, 'Manny', 11, 111),
(12, 'Sid', 12, 112),
(13, 'Diego', 13, 113),
(14, 'Skipper', 14, 114),
(15, 'Jack', 15, 115);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studentsdummy`
--
ALTER TABLE `studentsdummy`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `marks`
--
ALTER TABLE `marks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `studentsdummy`
--
ALTER TABLE `studentsdummy`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
