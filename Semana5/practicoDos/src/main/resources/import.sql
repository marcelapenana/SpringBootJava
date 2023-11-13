INSERT INTO clientes (nombre, direccion, create_at) VALUES('Edwin Hernández',  'San Martín', '2017-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Valeria Roque',  'San Juan Tepezontes', '2018-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Oscar Hernández',  'San Martín', '2017-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Emerson Mendez',  'San Juan Tepezontes', '2018-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Edwin Hernández',  'San Martín', '2017-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Valeria Roque',  'San Juan Tepezontes', '2018-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('David Roque',  'San Martín', '2017-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Andrea Sánchez',  'San Juan Tepezontes', '2018-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Luis Calixto',  'San Martín', '2017-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Andrew Holmos',  'San Juan Tepezontes', '2018-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Edwin Hernández',  'San Martín', '2017-08-01');
INSERT INTO clientes (nombre, direccion, create_at) VALUES('Valeria Roque',  'San Juan Tepezontes', '2018-08-01');

/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('TV LG', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('IPHONE 8 ', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('LAPTOP HP', 1499990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 299990, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());


INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);