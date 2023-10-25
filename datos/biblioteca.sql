-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-10-2023 a las 19:23:36
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generos`
--

CREATE TABLE `generos` (
  `id` varchar(20) NOT NULL,
  `nombre` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `generos`
--

INSERT INTO `generos` (`id`, `nombre`) VALUES
('A454', 'Accion'),
('C231', 'Crimen'),
('D614', 'Drama'),
('M244', 'Mafia'),
('S986', 'Suspenso'),
('W803', 'Western');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `isbn` varchar(20) NOT NULL,
  `titulo` varchar(250) NOT NULL,
  `autor` varchar(250) NOT NULL,
  `idGenero` varchar(250) NOT NULL,
  `anioPublicacion` varchar(10) NOT NULL,
  `unidadesDisponibles` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`isbn`, `titulo`, `autor`, `idGenero`, `anioPublicacion`, `unidadesDisponibles`) VALUES
('F649', 'Following', 'Christopher Nolan', 'S986', '1998', 1),
('G942', 'Good Fellas', 'Scorscese', 'M244', '1990', 497),
('H617', 'High Plains Drifter', 'Clint Eastwood', 'W803', '1973', 10),
('H678', 'Heat', 'Michael Mann', 'C231', '1995', 10),
('L992', 'The Untouchables', 'Brian de Palma', 'M244', '1989', 17),
('M191', 'Memento', 'Christopher Nolan', 'S986', '2000', 10),
('M516', 'Mystic River', 'Clint Eastwood', 'C231', '2003', 19),
('T265', 'The Godfather', 'Mario Puzo', 'M244', '1970', 20),
('T882', 'Taxi Driver', 'Scorscese', 'D614', '1976', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id` varchar(20) NOT NULL,
  `isbnLibro` varchar(20) NOT NULL,
  `cedulaUsuario` varchar(20) NOT NULL,
  `fechaPrestamo` varchar(70) NOT NULL,
  `fechaVencimiento` varchar(70) NOT NULL,
  `fechaRetorno` varchar(70) DEFAULT NULL,
  `estaActivo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`id`, `isbnLibro`, `cedulaUsuario`, `fechaPrestamo`, `fechaVencimiento`, `fechaRetorno`, `estaActivo`) VALUES
('P275', 'L992', '1090272917', '2023-10-23', '2023-09-06', NULL, 1),
('P288', 'L992', '1872649', '2023-10-23', '2024-01-02', NULL, 1),
('P482', 'G942', '1872649', '2023-10-23', '2023-11-01', '2023-10-23', 0),
('P635', 'M516', '2', '2023-10-20', '2025-01-01', NULL, 1),
('P637', 'G942', '1090272917', '2023-10-18', '2023-10-22', '2023-10-23', 0),
('P727', 'G942', '1', '2023-10-18', '2024-01-01', NULL, 1),
('P773', 'H617', '2', '2023-10-18', '2023-11-01', '2023-10-23', 0),
('P862', 'L992', '1872649', '2023-10-25', '2025-07-07', NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `id` int(11) NOT NULL,
  `cedulaUsuario` varchar(20) NOT NULL,
  `detalles` text NOT NULL,
  `fechaRealizacion` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`id`, `cedulaUsuario`, `detalles`, `fechaRealizacion`) VALUES
(3, '1', 'Generación de informe', '2023-10-25 12:22:43');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `cedula` varchar(20) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(150) NOT NULL,
  `usuario` varchar(250) NOT NULL,
  `contrasenia` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`cedula`, `nombre`, `apellidos`, `usuario`, `contrasenia`) VALUES
('1', 'root', 'root', 'root', 'root'),
('1090272917', 'Mateo', 'Loaiza', 'mateo', 'mateo'),
('1872649', 'Pablito', 'Clavo un Clavito', 'pablito', 'clavito'),
('2', 'Nicolas', 'Vargas', 'nicolas', 'nicolas');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `generos`
--
ALTER TABLE `generos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`isbn`),
  ADD KEY `idGenero` (`idGenero`);

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idLibro` (`isbnLibro`),
  ADD KEY `idUsuario` (`cedulaUsuario`);

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cedulaUsuario` (`cedulaUsuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`cedula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `registros`
--
ALTER TABLE `registros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`idGenero`) REFERENCES `generos` (`id`);

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `prestamos_ibfk_1` FOREIGN KEY (`isbnLibro`) REFERENCES `libros` (`isbn`),
  ADD CONSTRAINT `prestamos_ibfk_2` FOREIGN KEY (`cedulaUsuario`) REFERENCES `usuarios` (`cedula`);

--
-- Filtros para la tabla `registros`
--
ALTER TABLE `registros`
  ADD CONSTRAINT `registros_ibfk_1` FOREIGN KEY (`cedulaUsuario`) REFERENCES `usuarios` (`cedula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
