-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2022 a las 21:55:44
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_final_g3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `detalles` varchar(200) DEFAULT NULL,
  `calorias` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`id`, `nombre`, `detalles`, `calorias`, `estado`) VALUES
(1, 'Pizza', 'Muzzarella con aceitunas', 230, 1),
(2, 'Arroz', 'Blanco o integral', 300, 1),
(3, 'Tarta', 'De verduras con queso', 400, 1),
(4, 'Empanadas', 'Humita', 500, 0),
(6, 'Helado', 'asidjaisdj', 1000, 0),
(7, 'Ensalada', 'Ingredientes: Tomate, huevo, zanahoria, choclo, lechuga, remolacha', 200, 0),
(9, 'Milanesas', 'De zapallo', 150, 1),
(10, 'Milanesas', 'De pollo', 175, 1),
(11, 'Tomate', 'Redondo', 50, 1),
(12, 'Huevos', 'Hervidos', 75, 1),
(13, 'Papas', 'Hervidas', 45, 1),
(14, 'Papas', 'Al horno', 60, 1),
(15, 'Puré', 'Mixto (papa, zapallo)', 100, 1),
(16, 'Ensalada rusa', 'Con mayonesa', 200, 1),
(17, 'Empanadas', 'De verdura y/o pollo', 250, 1),
(18, 'Fideos', 'Con salsa blanca', 150, 1),
(19, 'Ensala de fruta', 'Sin azucar', 250, 1),
(20, 'Guiso de lentejas', 'Con porotos, papas, zapallo', 450, 1),
(21, 'Yogurt', 'Con cereales', 150, 1),
(22, 'Galletitas', 'Integrales', 150, 1),
(23, 'Ravioles', 'De verdura con salsa roja', 300, 1),
(24, 'Pollo', 'Al horno con papas', 500, 1),
(25, 'Manzana', 'Roja o verde', 200, 1),
(26, 'Banana', 'Mediana', 150, 1),
(27, 'Tostadas', 'Con mermelada o queso light', 250, 1),
(28, 'Gelatina', 'Una taza', 250, 1),
(29, 'Kiwi Asado', 'kiwi con cascara asado a las brazas', 100, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `id` int(11) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `peso_inicial` double NOT NULL,
  `peso_deseado` double NOT NULL,
  `limite_calorico` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`id`, `id_paciente`, `fecha_inicio`, `fecha_fin`, `peso_inicial`, `peso_deseado`, `limite_calorico`, `estado`) VALUES
(1, 6, '2022-11-01', '2022-11-08', 60, 50, 9500, 0),
(2, 5, '2022-11-10', '2022-11-17', 80, 60, 10000, 0),
(3, 4, '2022-10-29', '2022-11-05', 100, 70, 9000, 0),
(4, 7, '2022-12-31', '2023-01-06', 40, 45, 8000, 0),
(5, 4, '2022-11-02', '2022-11-09', 70, 65, 7500, 0),
(6, 4, '2022-12-14', '2022-12-21', 80, 70, 7000, 1),
(7, 7, '2022-12-21', '2022-12-28', 70, 60, 6000, 1),
(8, 21, '2022-11-05', '2022-11-12', 100, 80, 9000, 1),
(9, 23, '2022-12-13', '2022-12-20', 65, 60, 10000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itemdieta`
--

CREATE TABLE `itemdieta` (
  `id` int(11) NOT NULL,
  `id_dieta` int(11) NOT NULL,
  `id_comida` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `dia` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `itemdieta`
--

INSERT INTO `itemdieta` (`id`, `id_dieta`, `id_comida`, `cantidad`, `dia`, `estado`) VALUES
(1, 1, 1, 1, 1, 0),
(2, 1, 2, 2, 1, 1),
(3, 1, 3, 1, 2, 1),
(5, 1, 1, 5, 2, 0),
(6, 1, 1, 1, 3, 0),
(7, 2, 2, 1, 1, 1),
(8, 1, 11, 1, 1, 1),
(9, 1, 11, 1, 2, 1),
(10, 2, 2, 1, 3, 1),
(11, 3, 10, 1, 4, 1),
(12, 3, 11, 1, 4, 1),
(13, 3, 13, 5, 3, 1),
(14, 6, 9, 1, 1, 1),
(15, 6, 9, 1, 3, 1),
(16, 6, 10, 1, 5, 1),
(17, 6, 2, 1, 5, 1),
(18, 6, 2, 1, 1, 1),
(19, 6, 13, 1, 3, 1),
(20, 6, 13, 1, 7, 1),
(21, 6, 27, 1, 7, 1),
(22, 6, 27, 1, 3, 1),
(23, 6, 27, 1, 3, 0),
(24, 6, 25, 1, 1, 1),
(25, 6, 25, 1, 2, 1),
(26, 6, 25, 1, 6, 1),
(27, 6, 16, 1, 6, 1),
(28, 6, 16, 1, 2, 1),
(29, 6, 18, 1, 5, 1),
(30, 6, 15, 1, 3, 1),
(31, 6, 3, 1, 3, 1),
(32, 6, 11, 3, 4, 1),
(33, 6, 12, 2, 4, 1),
(34, 6, 12, 2, 2, 1),
(35, 6, 24, 1, 4, 1),
(36, 7, 2, 1, 1, 1),
(37, 7, 11, 2, 1, 1),
(38, 7, 12, 2, 1, 1),
(39, 7, 22, 3, 1, 1),
(40, 7, 24, 1, 1, 1),
(41, 7, 26, 1, 1, 1),
(42, 7, 26, 2, 2, 1),
(43, 7, 24, 1, 2, 1),
(44, 7, 19, 1, 2, 1),
(45, 7, 21, 1, 2, 1),
(46, 7, 23, 1, 3, 1),
(47, 7, 3, 1, 4, 1),
(48, 7, 11, 2, 4, 1),
(49, 7, 15, 2, 4, 1),
(50, 7, 28, 2, 3, 1),
(51, 7, 10, 2, 4, 1),
(52, 7, 12, 1, 4, 1),
(53, 7, 21, 1, 4, 1),
(54, 7, 20, 1, 5, 1),
(55, 7, 21, 1, 5, 1),
(56, 7, 15, 1, 6, 1),
(57, 7, 9, 1, 6, 0),
(58, 7, 9, 1, 1, 1),
(59, 7, 18, 1, 7, 1),
(60, 9, 1, 2, 1, 1),
(61, 9, 3, 2, 1, 1),
(62, 9, 10, 2, 2, 1),
(63, 9, 17, 2, 2, 1),
(64, 9, 16, 1, 3, 1),
(65, 9, 18, 1, 5, 1),
(66, 9, 3, 10, 5, 0),
(67, 9, 3, 10, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `domicilio` varchar(20) NOT NULL,
  `dni` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `peso_actual` float DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id`, `nombre`, `apellido`, `domicilio`, `dni`, `telefono`, `peso_actual`, `estado`) VALUES
(4, 'Nelson Marco', 'Silva', 'Ruta 5 y La Usina', '35830731', '2664690227', 80, 1),
(5, 'Luna Morena', 'Lopardo', 'No tengo idea', '30456456', '2664565656', 55, 1),
(6, 'Dante ', 'Rodriguez', 'En algun lugar de SL', '40456456', '266445454545', 65, 1),
(7, 'Lucas', 'Teruel', 'En Merlo', '454564564', '266455555555', 62, 1),
(19, 'Leila', 'Thompson', '9 de febrero 355', '38333666', '2664645714', 60, 0),
(21, 'Roberto', 'Gomez', 'La Florida 123', '123456789', '987654321', 90, 1),
(23, 'Juanjo', 'Saez', 'Las catitas 123', '111111111', '12316456456', 65, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_paciente` (`id_paciente`);

--
-- Indices de la tabla `itemdieta`
--
ALTER TABLE `itemdieta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_dieta` (`id_dieta`),
  ADD KEY `id_comida` (`id_comida`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `itemdieta`
--
ALTER TABLE `itemdieta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id`);

--
-- Filtros para la tabla `itemdieta`
--
ALTER TABLE `itemdieta`
  ADD CONSTRAINT `itemdieta_ibfk_1` FOREIGN KEY (`id_dieta`) REFERENCES `dieta` (`id`),
  ADD CONSTRAINT `itemdieta_ibfk_2` FOREIGN KEY (`id_comida`) REFERENCES `comida` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
