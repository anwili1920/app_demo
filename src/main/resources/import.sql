INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('LAPTOPS');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('TELEVISORES');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('PANTALLAS');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('AUDIFONOS');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('CELULARES');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('TABLETS');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('MOUSES');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('MOCHILAS');
INSERT INTO BASE_DATOS.CATEGORIAS(descripcion) VALUES ('MICAS');

INSERT INTO BASE_DATOS.CLIENTES(dni,nombre1,nombre2,apellido1,apellido2,celular,direccion) VALUES (71194513,'ANGIE','MARIEL','CENTENO','CACERES',989411019,'AVENIDA EJERCITO 865 BLUE SPACE MAGDALENA DEL MAR');
INSERT INTO BASE_DATOS.CLIENTES(dni,nombre1,nombre2,apellido1,apellido2,celular,direccion) VALUES (89231441,'MARIE','CIELO','ALAMOS','MENDOZA',989988667,'AVENIDA AREQUIPA 4596 MIRAFLORES');
INSERT INTO BASE_DATOS.CLIENTES(dni,nombre1,nombre2,apellido1,apellido2,celular,direccion) VALUES (82194213,'BENJAMIN','ABIGAEL','BERDMAN','TOWERS',952667019,'AVENIDA LA REPUBLICA 4752 MIRAFLORES');

INSERT INTO BASE_DATOS.COMPRAS(fid_cliente,fecha,medio_pago,comentario) VALUES (1,TO_DATE('2023-03-01', 'YYYY-MM-DD'),'T','RECOJO EN TIENDA');
INSERT INTO BASE_DATOS.COMPRAS(fid_cliente,fecha,medio_pago,comentario) VALUES (3,TO_DATE('2022-12-11', 'YYYY-MM-DD'),'T','RECOJO EN TIENDA');
INSERT INTO BASE_DATOS.COMPRAS(fid_cliente,fecha,medio_pago,comentario) VALUES (2,TO_DATE('2023-03-01', 'YYYY-MM-DD'),'T','RECOJO EN TIENDA');
INSERT INTO BASE_DATOS.COMPRAS(fid_cliente,fecha,medio_pago,comentario) VALUES (1,TO_DATE('2022-11-15', 'YYYY-MM-DD'),'T','RECOJO EN TIENDA');

INSERT INTO BASE_DATOS.PRODUCTOS(nombre,fid_categoria,codigo_barras,precio_venta,cantidad_stock) VALUES ('Laptop ROG Zephyrus M16',1,'5901234123457',7999.00,6);
INSERT INTO BASE_DATOS.PRODUCTOS(nombre,fid_categoria,codigo_barras,precio_venta,cantidad_stock) VALUES ('Skullcandy Audífono Cassette Bt Black',4,'5001234128857',119.90,20);
INSERT INTO BASE_DATOS.PRODUCTOS(nombre,fid_categoria,codigo_barras,precio_venta,cantidad_stock) VALUES ('Mouse Inalambrico Usb Genius Traveler 900s Ultra Delgado',7,'9914734123457',64.00,35);
INSERT INTO BASE_DATOS.PRODUCTOS(nombre,fid_categoria,codigo_barras,precio_venta,cantidad_stock) VALUES ('MOCHILA SAXOLINE LAPTOP BACKPACK CITY 651 GRIS',8,'0463234195357',152.76,10);
INSERT INTO BASE_DATOS.PRODUCTOS(nombre,fid_categoria,codigo_barras,precio_venta,cantidad_stock) VALUES ('Apple iPad (5thGEneration) Wi-Fi, 128GB - Gris espacial',6,'9812077141057',916.78,15);

INSERT INTO BASE_DATOS.COMPRAS_PRODUCTOS(fid_compra,fid_producto,cantidad,total) VALUES (2,3,1,152.76);
INSERT INTO BASE_DATOS.COMPRAS_PRODUCTOS(fid_compra,fid_producto,cantidad,total) VALUES (1,1,1,7999.00);
INSERT INTO BASE_DATOS.COMPRAS_PRODUCTOS(fid_compra,fid_producto,cantidad,total) VALUES (1,2,1,119.90);
INSERT INTO BASE_DATOS.COMPRAS_PRODUCTOS(fid_compra,fid_producto,cantidad,total) VALUES (3,5,1,916.78);
INSERT INTO BASE_DATOS.COMPRAS_PRODUCTOS(fid_compra,fid_producto,cantidad,total) VALUES (4,4,1,64.00);
INSERT INTO BASE_DATOS.COMPRAS_PRODUCTOS(fid_compra,fid_producto,cantidad,total) VALUES (4,3,1,152.76);
-- $2a$10$62S5CVAG7MOOJ/ufotcqReuEJs/dbyVc7Z4gZVRc0SAK2rpueM8ry == password
INSERT INTO BASE_DATOS.USUARIOS(fid_cliente,email,password) VALUES (3,'benjamin.berdman123@gmail.com','$2a$10$62S5CVAG7MOOJ/ufotcqReuEJs/dbyVc7Z4gZVRc0SAK2rpueM8ry');
INSERT INTO BASE_DATOS.USUARIOS(fid_cliente,email,password) VALUES (1,'angie.centeno@pucp.edu.pe','$2a$10$62S5CVAG7MOOJ/ufotcqReuEJs/dbyVc7Z4gZVRc0SAK2rpueM8ry');
INSERT INTO BASE_DATOS.USUARIOS(fid_cliente,email,password) VALUES (2,'mariecieloab@gmail.com','$2a$10$62S5CVAG7MOOJ/ufotcqReuEJs/dbyVc7Z4gZVRc0SAK2rpueM8ry');

INSERT INTO BASE_DATOS.TARJETAS(numero_tarjeta,nombre_tarjeta,fid_usuario,fecha_vencimiento) VALUES ('1456728398635167','ANGIE MARIEL CENTENO CACERES',1,'03/27'); 
INSERT INTO BASE_DATOS.TARJETAS(numero_tarjeta,nombre_tarjeta,fid_usuario,fecha_vencimiento) VALUES ('0987123487329973','BENJAMIN BERDMAN',3,'05/24'); 
INSERT INTO BASE_DATOS.TARJETAS(numero_tarjeta,nombre_tarjeta,fid_usuario,fecha_vencimiento) VALUES ('9182003482716638','MARIE CIELO ALAMOS',2,'01/28'); 
INSERT INTO BASE_DATOS.TARJETAS(numero_tarjeta,nombre_tarjeta,fid_usuario,fecha_vencimiento) VALUES ('1129882671831730','ANGIE CENTENO',1,'06/24'); 