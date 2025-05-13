-- Salas del cine
INSERT INTO sala (id, nombre, capacidad) VALUES (1, 'Sala 1 - Estándar', 150);
INSERT INTO sala (id, nombre, capacidad) VALUES (2, 'Sala 2 - 3D', 120);
INSERT INTO sala (id, nombre, capacidad) VALUES (3, 'Sala 3 - Premium', 80);
INSERT INTO sala (id, nombre, capacidad) VALUES (4, 'Sala 4 - IMAX', 200);
INSERT INTO sala (id, nombre, capacidad) VALUES (5, 'Sala 5 - VIP', 50);

ALTER TABLE sala ALTER COLUMN id RESTART WITH 6;

-- Entradas disponibles
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (1, 'Cliente 1', '2023-11-15 18:00:00', 8.50, 1);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (2, 'Cliente 2', '2023-11-15 20:30:00', 9.50, 2);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (3, 'Cliente 3', '2023-11-16 17:45:00', 7.50, 3);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (4, 'Cliente 4', '2023-11-16 21:15:00', 10.00, 4);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (5, 'Cliente 5', '2023-11-17 19:00:00', 12.50, 5);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (6, 'Cliente 6', '2023-11-17 22:00:00', 9.00, 1);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (7, 'Cliente 7', '2023-11-18 16:30:00', 6.50, 2);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (8, 'Cliente 8', '2023-11-18 19:45:00', 8.00, 3);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (9, 'Cliente 9', '2023-11-19 18:15:00', 9.50, 4);
INSERT INTO entrada (id, cliente, fecha_hora, precio, sala_id) VALUES (10, 'Cliente 10', '2023-11-19 21:30:00', 11.00, 5);

ALTER TABLE entrada ALTER COLUMN id RESTART WITH 11;