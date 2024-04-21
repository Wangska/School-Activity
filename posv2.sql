-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2024 at 02:50 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `posv2`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `cartid` int(11) NOT NULL,
  `INID` int(11) NOT NULL,
  `Product_Name` varchar(50) NOT NULL,
  `Bar_code` varchar(50) NOT NULL,
  `qty` varchar(20) NOT NULL,
  `Unit_Price` varchar(20) NOT NULL,
  `Total_Price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`cartid`, `INID`, `Product_Name`, `Bar_code`, `qty`, `Unit_Price`, `Total_Price`) VALUES
(141, 6, 'Hawaaiian Pizza', '1001', '2', '150', '300.0'),
(142, 6, 'Hawaaiian Pizza', '1001', '2', '150', '300.0'),
(143, 7, 'Ham and Cheese', '1002', '2', '120', '240.0'),
(144, 7, 'Ham and Cheese', '1002', '2', '120', '240.0'),
(145, 8, 'Ham and Cheese', '1002', '2', '120', '240.0'),
(146, 9, 'Ham and Cheese', '1002', '5', '120', '600.0'),
(147, 10, 'Ham', '1003', '2', '150', '300.0'),
(148, 10, 'Ham', '1003', '2', '150', '300.0'),
(149, 11, 'Hams', '1004', '5', '150', '750.0'),
(150, 12, 'Hams', '1004', '25', '150', '3750.0'),
(151, 13, 'Ham and Cheese', '1002', '2', '120', '240.0'),
(152, 14, 'Ham', '1003', '2', '150', '300.0'),
(153, 15, 'Ham', '1003', '2', '150', '300.0'),
(154, 16, 'hammonado', '1005', '2', '160', '320.0'),
(155, 16, 'hammonado', '1005', '2', '160', '320.0'),
(156, 17, 'Hams', '1004', '23', '150', '3450.0'),
(157, 18, 'Ham', '1003', '2', '150', '300.0'),
(158, 19, 'hammonado', '1005', '2', '160', '320.0'),
(159, 19, 'hammonado', '1005', '2', '160', '320.0'),
(160, 19, 'hammonado', '1005', '2', '160', '320.0'),
(161, 19, 'hammonado', '1005', '2', '160', '320.0'),
(162, 19, 'hammonado', '1005', '2', '160', '320.0'),
(163, 19, 'hammonado', '1005', '2', '160', '320.0');

-- --------------------------------------------------------

--
-- Table structure for table `extra`
--

CREATE TABLE `extra` (
  `exid` int(11) NOT NULL,
  `val` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `extra`
--

INSERT INTO `extra` (`exid`, `val`) VALUES
(1, '19');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pid` int(50) NOT NULL,
  `pname` varchar(200) NOT NULL,
  `psupplier` varchar(50) NOT NULL,
  `pbarcode` varchar(50) NOT NULL,
  `pqty` varchar(200) NOT NULL,
  `pprice` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pid`, `pname`, `psupplier`, `pbarcode`, `pqty`, `pprice`) VALUES
(1, 'Hawaaiian Pizza', 'Witchhut', '1001', '30', '150'),
(2, 'Ham and Cheese', 'Witchhut', '1002', '20', '120'),
(4, 'Ham', 'Witchhut', '1003', '20', '150'),
(5, 'Hams', 'Witchhut', '1004', '20', '150'),
(6, 'hammonado', 'Witchhut', '1005', '20', '160');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `salesid` int(200) NOT NULL,
  `INID` varchar(200) NOT NULL,
  `total_qty` varchar(200) NOT NULL,
  `tota_bill` varchar(200) NOT NULL,
  `status` varchar(20) NOT NULL,
  `balance` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`salesid`, `INID`, `total_qty`, `tota_bill`, `status`, `balance`) VALUES
(1001, '1', '20', '200', 'Paid', '0'),
(1002, '6', '2.0', '300.0', 'Paid', '0.0'),
(1003, '6', '2.0', '300.0', 'Paid', '0.0'),
(1004, '7', '4.0', '480.0', 'Paid', '20.0'),
(1005, '8', '2.0', '240.0', 'Paid', '60.0'),
(1006, '9', '5.0', '600.0', 'Unpaid', '-600.0'),
(1007, '10', '4.0', '600.0', 'Unpaid', '-600.0'),
(1008, '11', '5.0', '750.0', 'Partial', '-650.0'),
(1009, '12', '25.0', '3750.0', 'Unpaid', '-3750.0'),
(1010, '13', '2.0', '240.0', 'Unpaid', '-240.0'),
(1011, '14', '2.0', '300.0', 'Unpaid', '-300.0'),
(1012, '15', '2.0', '300.0', 'Unpaid', '-300.0'),
(1013, '16', '4.0', '640.0', 'Unpaid', '-640.0'),
(1014, '17', '23.0', '3450.0', 'Unpaid', '-3450.0'),
(1015, '18', '2.0', '300.0', 'Unpaid', '-300.0'),
(1016, '19', '12.0', '1920.0', 'Paid', '80.0');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(200) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `middlename` varchar(50) NOT NULL,
  `address` varchar(200) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contactnumber` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `account_type` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(200) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `lastname`, `firstname`, `middlename`, `address`, `email`, `contactnumber`, `gender`, `account_type`, `username`, `password`, `status`) VALUES
(1, 'Espanillo', 'Joshua', 'U', 'City of Naga', 'wangska1283@gmail.com', '09666091326', 'Male', 'Admin', 'wangska1283', 'b93d5dd96894a269f57b8374ae257c73a2ec93c5', 'Active'),
(2, 'Death', 'Gun', 'Riffle', 'Minglanilla', 'deathgun69@gmail.com', '09666091312', 'Female', 'Owner', 'death', 'f7c3bc1d808e04732adf679965ccc34ca7ae3441', 'Active'),
(4, 'kigwa', 'kig', 'kig', 'naga', 'kig@gmail.com', '09666091326', 'Female', 'Cashier', 'kig123', '7c222fb2927d828af22f592134e8932480637c0d', 'Active'),
(5, 'Akira', 'kitsue', 'K', 'Naga', 'akira@gmail.com', '09666091326', 'Male', 'Cashier', 'akira', '7c222fb2927d828af22f592134e8932480637c0d', 'Active'),
(6, 'aki', 'kia', 'A', 'mingla', 'aki@gmail.com', '09666091326', 'Male', 'Cashier', 'aki', '7c222fb2927d828af22f592134e8932480637c0d', 'Active'),
(7, 'test', 'test', 't', 'mingla', 'test@gmail.com', '09666091326', 'Male', 'Cashier', 'test', '7c222fb2927d828af22f592134e8932480637c0d', 'Active'),
(8, 'trial', 'trial', 'T', 'Naga', 'trial@gmail.com', '09666091326', 'Male', 'Owner', 'trial', 'f7c3bc1d808e04732adf679965ccc34ca7ae3441', 'Active'),
(9, 'testing', 'testing', 'T', 'Naga', 'testing@gmail.com', '09666091326', 'Male', 'Owner', 'testing', 'f7c3bc1d808e04732adf679965ccc34ca7ae3441', 'Active'),
(10, 'amaterasu', 'sasuke', 'S', 'Uchiha Clan', 'sasuke@gmail.com', '09666091326', 'Male', 'Owner', 'uchiha', '7c222fb2927d828af22f592134e8932480637c0d', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`cartid`);

--
-- Indexes for table `extra`
--
ALTER TABLE `extra`
  ADD PRIMARY KEY (`exid`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`salesid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `cartid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=164;

--
-- AUTO_INCREMENT for table `extra`
--
ALTER TABLE `extra`
  MODIFY `exid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `pid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `salesid` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1017;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
