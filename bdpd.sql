-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20221113.0eded7bb43
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 15-11-2022 a las 01:56:09
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdpd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`id`, `email`, `password`) VALUES
(1, 'a@a.cl', '12345'),
(2, 'gpa.fuentesc@gmail.com', '12345');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `scex`
--

CREATE TABLE `scex` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `edad` int(11) NOT NULL,
  `exclusion` varchar(50) NOT NULL,
  `pension` int(11) NOT NULL,
  `afp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `scex`
--

INSERT INTO `scex` (`id`, `nombre`, `apellido`, `edad`, `exclusion`, `pension`, `afp`) VALUES
(1, 'Gabriel', 'Fuentes', 90, 'FFAA', 354000, 'CAPREDENA'),
(2, 'Gabriela', 'Dicaprio', 90, 'EMPLEADO', 1300000, 'CAPREDENA'),
(3, 'Gadiel', 'Godoy', 90, 'EMPLEADO', 700000, 'CAPREDENA'),
(4, 'Leandro', 'Frez', 90, 'EMPLEADO', 600000, 'CAPREDENA'),
(5, 'Fabiola', 'Gort', 90, 'EMPLEADO', 890000, 'CAPREDENA'),
(6, 'Marcela', 'Flores', 90, 'EMPLEADO', 1700000, 'CAPREDENA'),
(7, 'Francisco', 'Fuentes', 90, 'FFAA', 745000, 'CAPREDENA'),
(8, 'Fernando', 'Flores', 90, 'FFAA', 1700000, 'CAPREDENA'),
(9, 'Felipe', 'Fuentes', 90, 'FFAA', 4500000, 'CAPREDENA'),
(10, 'Diego', 'Farias', 90, 'FFAA', 500000, 'CAPREDENA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sipen`
--

CREATE TABLE `sipen` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `edad` int(11) NOT NULL,
  `pension` int(11) NOT NULL,
  `afp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sipen`
--

INSERT INTO `sipen` (`id`, `nombre`, `apellido`, `edad`, `pension`, `afp`) VALUES
(1, 'Gabriel', 'Fuentes', 90, 354000, 'HABITAT'),
(2, 'Luz', 'FLores', 90, 214000, 'HABITAT'),
(3, 'Paz', 'Puentes', 90, 124000, 'PROVIDA'),
(4, 'Flaviana', 'Gor', 90, 754000, 'HABITAT'),
(5, 'Victor', 'Fiass', 90, 354000, 'MODELO'),
(6, 'Francisco', 'Godoy', 90, 544000, 'MODELO'),
(7, 'Geronimo', 'Sain', 90, 5004000, 'HABITAT'),
(8, 'Gabriel', 'Vergara', 90, 354000, 'HABITAT'),
(9, 'Felipe', 'Bravo', 90, 354000, 'HABITAT'),
(10, 'Diego', 'Farias', 90, 500000, 'PROVIDA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `slafi`
--

CREATE TABLE `slafi` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `contribucion` int(11) NOT NULL,
  `edad` int(11) NOT NULL,
  `pension` int(11) NOT NULL,
  `afp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `slafi`
--

INSERT INTO `slafi` (`id`, `nombre`, `apellido`, `contribucion`, `edad`, `pension`, `afp`) VALUES
(1, 'Gabriel', 'Fuentes', 1500000, 90, 1970000, 'HABITAT'),
(2, 'Matias', 'Estay', 870000, 90, 127000, 'MODELO'),
(3, 'Hector', 'Flores', 2200000, 90, 197000, 'HABITAT'),
(4, 'Fran', 'Martinez', 1200000, 90, 788000, 'HABITAT'),
(5, 'Alejandro', 'Fuang', 540000, 90, 970000, 'PROVIDA'),
(6, 'Paz', 'Puentes', 870000, 90, 700000, 'MODELO'),
(7, 'Fabiola', 'Ruiz', 290000, 90, 197000, 'PROVIDA'),
(8, 'Geno', 'Roa', 250000, 90, 1000000, 'HABITAT'),
(9, 'Gerardo', 'Vidal', 988000, 90, 100000, 'MODELO'),
(10, 'Flor', 'Morales', 139000, 90, 197000, 'HABITAT');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `scex`
--
ALTER TABLE `scex`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sipen`
--
ALTER TABLE `sipen`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `slafi`
--
ALTER TABLE `slafi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `scex`
--
ALTER TABLE `scex`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `sipen`
--
ALTER TABLE `sipen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `slafi`
--
ALTER TABLE `slafi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
