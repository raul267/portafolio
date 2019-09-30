-- Generado por Oracle SQL Developer Data Modeler 19.2.0.182.1216
--   en:        2019-09-28 06:45:51 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g

DROP TABLE accidente CASCADE CONSTRAINTS;

DROP TABLE actividad CASCADE CONSTRAINTS;

DROP TABLE asesoria_actividad CASCADE CONSTRAINTS;

DROP TABLE asesorias CASCADE CONSTRAINTS;

DROP TABLE capacitacion CASCADE CONSTRAINTS;

DROP TABLE capacitacion_asistente CASCADE CONSTRAINTS;

DROP TABLE cobroextra_facturacion CASCADE CONSTRAINTS;

DROP TABLE cobros_extra CASCADE CONSTRAINTS;

DROP TABLE comuna CASCADE CONSTRAINTS;

DROP TABLE contrato CASCADE CONSTRAINTS;

DROP TABLE detalle_lista CASCADE CONSTRAINTS;

DROP TABLE empleado_cliente CASCADE CONSTRAINTS;

DROP TABLE empresa CASCADE CONSTRAINTS;

DROP TABLE facturacion CASCADE CONSTRAINTS;

DROP TABLE historial_profesional CASCADE CONSTRAINTS;

DROP TABLE info_actividad CASCADE CONSTRAINTS;

DROP TABLE insumos CASCADE CONSTRAINTS;

DROP TABLE lista_empresa CASCADE CONSTRAINTS;

DROP TABLE mensaje CASCADE CONSTRAINTS;

DROP TABLE plan CASCADE CONSTRAINTS;

DROP TABLE profesional CASCADE CONSTRAINTS;

DROP TABLE propuesta_mejora CASCADE CONSTRAINTS;

DROP TABLE region CASCADE CONSTRAINTS;

DROP TABLE reporte_mensual CASCADE CONSTRAINTS;

DROP TABLE tipo_actividad CASCADE CONSTRAINTS;

DROP TABLE tipo_chequeo CASCADE CONSTRAINTS;

DROP TABLE tipo_cobro_extra CASCADE CONSTRAINTS;

DROP TABLE tipo_empresa CASCADE CONSTRAINTS;

DROP TABLE tipo_estado_lista CASCADE CONSTRAINTS;

DROP TABLE tipo_usuario CASCADE CONSTRAINTS;

DROP TABLE usuario CASCADE CONSTRAINTS;

DROP TABLE visita CASCADE CONSTRAINTS;


CREATE TABLE accidente (
   id_accidente          NUMBER(5) NOT NULL,
   fecha_accidente       DATE NOT NULL,
   id_empleado_cliente   NUMBER(3) NOT NULL,
   descripcion           VARCHAR2(4000) NOT NULL
);

ALTER TABLE accidente ADD CONSTRAINT accidente_pk PRIMARY KEY ( id_accidente );

CREATE TABLE actividad (
   id_actividad        NUMBER(4) NOT NULL,
   id_tipo_actividad   NUMBER(3) NOT NULL,
   direccion           VARCHAR2(60) NOT NULL,
   enterreno           NUMBER(1) NOT NULL,
   id_empleado         number(3) not null,
   tiempo_ejecucion    number(2),
   fecha_actividad     DATE NOT NULL,
   descripcion         VARCHAR2(100),
   check_list          VARCHAR2(1000),
   realizada           number(1) not null,
   id_empresa          NUMBER(3),
   id_asesoria         NUMBER(5)
);

ALTER TABLE actividad ADD CONSTRAINT actividad_pk PRIMARY KEY ( id_actividad );

CREATE TABLE asesoria_actividad (
   id_asesoria_act   NUMBER NOT NULL,
   estado            NUMBER NOT NULL,
   id_asesoria       NUMBER NOT NULL,
   id_actividad      NUMBER NOT NULL
);

ALTER TABLE asesoria_actividad ADD CONSTRAINT asesoria_actividad_pk PRIMARY KEY ( id_asesoria_act );

CREATE TABLE asesorias (
   id_asesoria   NUMBER(5) NOT NULL,
   descripcion   VARCHAR2(2000) 
    NOT NULL,
   id_empresa    NUMBER(3) NOT NULL,
   vigente       NUMBER(3) NOT NULL,
   id_plan       NUMBER(1) NOT NULL
);

ALTER TABLE asesorias ADD CONSTRAINT asesorias_pk PRIMARY KEY ( id_asesoria );

CREATE TABLE capacitacion (
   id_capacitacion      NUMBER(1) NOT NULL,
   fecha_capacitacion   DATE NOT NULL,
   lugar_capacitacion   VARCHAR2(1000) NOT NULL
);

ALTER TABLE capacitacion ADD CONSTRAINT capacitacion_pk PRIMARY KEY ( id_capacitacion );

CREATE TABLE capacitacion_asistente (
   id_capacitacion_asistente   NUMBER(5) NOT NULL,
   cantidad_asistentes         NUMBER(5) NOT NULL,
   id_empleado_cliente         NUMBER(3) NOT NULL,
   id_actividad                NUMBER(4) NOT NULL,
   id_profesional              NUMBER NOT NULL,
   fecha                       DATE NOT NULL,
   id_capacitacion             NUMBER(1) NOT NULL
);

ALTER TABLE capacitacion_asistente ADD CONSTRAINT capacitacion_asistente_pk PRIMARY KEY ( id_capacitacion_asistente );

CREATE TABLE cobroextra_facturacion (
   id               NUMBER(5) NOT NULL,
   cantidad         NUMBER(5) NOT NULL,
   id_cobro_extra   NUMBER(5) NOT NULL,
   id_facturacion   NUMBER(5) NOT NULL
);

ALTER TABLE cobroextra_facturacion ADD CONSTRAINT cobroextra_facturacion_pk PRIMARY KEY ( id );

CREATE TABLE cobros_extra (
   id_cobro_extra        NUMBER(5) NOT NULL,
   monto                 NUMBER(5) NOT NULL,
   fecha_cobro_extra     DATE NOT NULL,
   id_tipo_cobro_extra   NUMBER(3) NOT NULL
);

ALTER TABLE cobros_extra ADD CONSTRAINT cobros_extra_pk PRIMARY KEY ( id_cobro_extra );

CREATE TABLE comuna (
   id_comuna          NUMBER(3) NOT NULL,
   nombre             VARCHAR2(50) NOT NULL,
   region_id_region   NUMBER(3) NOT NULL
);

ALTER TABLE comuna ADD CONSTRAINT comuna_pk PRIMARY KEY ( id_comuna );

CREATE TABLE contrato (
   id_contrato          NUMBER(3) NOT NULL,
   fecha_inicio         DATE NOT NULL,
   fecha_termino        DATE,
   ubicacion_archivo    VARCHAR2(50) NOT NULL,
   empresa_id_empresa   NUMBER(3) NOT NULL
);

ALTER TABLE contrato ADD CONSTRAINT contrato_pk PRIMARY KEY ( id_contrato );

CREATE TABLE detalle_lista (
   id_detalle_lista       NUMBER(3) NOT NULL,
   id_tipo_chequeo        NUMBER(3) NOT NULL,
   id_lista_empresa       NUMBER(4) NOT NULL,
   id_tipo_estado_lista   NUMBER(3) NOT NULL
);

ALTER TABLE detalle_lista ADD CONSTRAINT detalle_lista_pk PRIMARY KEY ( id_detalle_lista );

CREATE TABLE empleado_cliente (
   id_empleado_cliente   NUMBER(3) NOT NULL,
   run                   VARCHAR2(10) NOT NULL,
   nombre                varchar2(60) not null,
   direccion             varchar2(200) not null,
   id_empresa            number(3) not null,
   operativo             number(1) not null
   
);

ALTER TABLE empleado_cliente ADD CONSTRAINT empleado_cliente_pk PRIMARY KEY ( id_empleado_cliente );

CREATE TABLE empresa (
   id_empresa        number(3) not null,
   nombre            VARCHAR2(100) NOT NULL,
   id_tipo_empresa   number(3) not null,
   direccion         VARCHAR2(200) NOT NULL,
   estado            number(1) not null,
   id_plan      number(1) not null,
   id_usuario       number(3) not null,
   id_comuna number(3) not null
);

ALTER TABLE empresa ADD CONSTRAINT empresa_pk PRIMARY KEY ( id_empresa );

CREATE TABLE facturacion (
   id_facturacion      NUMBER(5) NOT NULL,
   monto_facturacion   NUMBER(6) NOT NULL,
   fecha_facturacion   DATE NOT NULL,
   id_empresa          NUMBER(3) NOT NULL,
   fecha_vencimiento   DATE NOT NULL,
   fecha_pago          date,
   id_plan        NUMBER(1) NOT NULL
);

ALTER TABLE facturacion ADD CONSTRAINT facturacion_pk PRIMARY KEY ( id_facturacion );

CREATE TABLE historial_profesional (
   id_historial     NUMBER(1, 1) NOT NULL,
   id_profesional   NUMBER(1, 1) NOT NULL,
   id_actividad     NUMBER(1, 1) NOT NULL
);

ALTER TABLE historial_profesional ADD CONSTRAINT historial_profesional_pk PRIMARY KEY ( id_historial );

CREATE TABLE info_actividad (
   id_info        NUMBER(5) NOT NULL,
   informacion    VARCHAR2(4000) NOT NULL,
   id_actividad   NUMBER(4) NOT NULL
);

ALTER TABLE info_actividad ADD CONSTRAINT info_actividad_pk PRIMARY KEY ( id_info );

CREATE TABLE insumos (
   id_insumo            NUMBER(1) NOT NULL,
   descripcion_insumo   VARCHAR2(2000) NOT NULL,
   id_actividad     NUMBER(4) NOT NULL
);

ALTER TABLE insumos ADD CONSTRAINT insumos_pk PRIMARY KEY ( id_insumo );

CREATE TABLE lista_empresa (
   id_lista            NUMBER(4) NOT NULL,
   descripcion         VARCHAR2(50) NOT NULL,
   id_empresa          NUMBER(3) NOT NULL,
   fecha_realizacion   DATE NOT NULL,
   vigente             NUMBER(1) NOT NULL
);

ALTER TABLE lista_empresa ADD CONSTRAINT lista_empresa_pk PRIMARY KEY ( id_lista );

CREATE TABLE mensaje (
   id_mesaje      NUMBER(1, 1) NOT NULL,
   id_emisor      VARCHAR2(3000) NOT NULL,
   id_remitente   VARCHAR2(3000) NOT NULL
);

ALTER TABLE mensaje ADD CONSTRAINT mensaje_pk PRIMARY KEY ( id_mesaje );

CREATE TABLE plan (
   id_plan            NUMBER(1) NOT NULL,
   descripcion_plan   VARCHAR2(2000) NOT NULL
);

ALTER TABLE plan ADD CONSTRAINT plan_pk PRIMARY KEY ( id_plan );

CREATE TABLE profesional (
   id_profesional   NUMBER NOT NULL,
   nombre           VARCHAR2(200) NOT NULL,
   rut              VARCHAR2(200) NOT NULL,
   direccion        VARCHAR2(200) NOT NULL,
   contratado       NUMBER(1),
   id_usuario      NUMBER(3) NOT NULL
);

ALTER TABLE profesional ADD CONSTRAINT profesional_pk PRIMARY KEY ( id_profesional );

CREATE TABLE propuesta_mejora (
   id_propuesta       NUMBER(3) NOT NULL,
   descripcion        VARCHAR2(50) NOT NULL,
   id_lista_empresa   NUMBER(4) NOT NULL,
   aprovada           NUMBER(1) NOT NULL
);

ALTER TABLE propuesta_mejora ADD CONSTRAINT propuesta_mejora_pk PRIMARY KEY ( id_propuesta );

CREATE TABLE region (
   id_region   NUMBER(3) NOT NULL,
   nombre      VARCHAR2(50) NOT NULL
);

ALTER TABLE region ADD CONSTRAINT region_pk PRIMARY KEY ( id_region );

CREATE TABLE reporte_mensual (
   id_reporte      NUMBER(4) NOT NULL,
   fecha_reporte   DATE NOT NULL,
   id_empresa      NUMBER(3) NOT NULL,
   descripcion     VARCHAR2(2000) NOT NULL
);

ALTER TABLE reporte_mensual ADD CONSTRAINT reporte_mensual_pk PRIMARY KEY ( id_reporte );

CREATE TABLE tipo_actividad (
   id_tipo       NUMBER(3) NOT NULL,
   descripcion   VARCHAR2(50) NOT NULL
);

ALTER TABLE tipo_actividad ADD CONSTRAINT tipo_actividad_pk PRIMARY KEY ( id_tipo );

CREATE TABLE tipo_chequeo (
   id_tipo_chequeo   NUMBER(3) NOT NULL,
   nombre_chequeo    VARCHAR2(50) NOT NULL,
   descripcion       VARCHAR2(4000) NOT NULL
);

ALTER TABLE tipo_chequeo ADD CONSTRAINT tipo_chequeo_pk PRIMARY KEY ( id_tipo_chequeo );

CREATE TABLE tipo_cobro_extra (
   id_tipo       NUMBER(3) NOT NULL,
   descripcion   VARCHAR2(50) NOT NULL
);

ALTER TABLE tipo_cobro_extra ADD CONSTRAINT tipo_cobro_extra_pk PRIMARY KEY ( id_tipo );

CREATE TABLE tipo_empresa (
   id_tipo       NUMBER(3) NOT NULL,
   descripcion   VARCHAR2(50) NOT NULL
);

ALTER TABLE tipo_empresa ADD CONSTRAINT tipo_empresa_pk PRIMARY KEY ( id_tipo );

CREATE TABLE tipo_estado_lista (
   id_estado     NUMBER(3) NOT NULL,
   descripcion   VARCHAR2(100) NOT NULL
);

ALTER TABLE tipo_estado_lista ADD CONSTRAINT tipo_estado_lista_pk PRIMARY KEY ( id_estado );

CREATE TABLE tipo_usuario (
   id_tipousuario   NUMBER(3) NOT NULL,
   nombre           VARCHAR2(50) NOT NULL
);

ALTER TABLE tipo_usuario ADD CONSTRAINT tipo_usuario_pk PRIMARY KEY ( id_tipousuario );

CREATE TABLE usuario (
   id_usuario       NUMBER(3) NOT NULL,
   id_tipo_usuario   NUMBER(3) NOT NULL,
   nick_name         VARCHAR2(50) NOT NULL,
   password          VARCHAR2(4000) NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( id_usuario );

CREATE TABLE visita (
   id_visita      NUMBER(1, 1) NOT NULL,
   fecha_visita   DATE NOT NULL,
   hora_inicio    DATE NOT NULL,
   hora_fin       DATE,
   id_plan        NUMBER(1, 1) NOT NULL
);

ALTER TABLE visita ADD CONSTRAINT visita_pk PRIMARY KEY ( id_visita );

ALTER TABLE accidente
   ADD CONSTRAINT accidente_empleado_cliente_fk FOREIGN KEY ( id_empleado_cliente )
       REFERENCES empleado_cliente ( id_empleado_cliente );

ALTER TABLE actividad
   ADD CONSTRAINT actividad_asesorias_fk FOREIGN KEY ( id_asesoria )
       REFERENCES asesorias ( id_asesoria );

ALTER TABLE actividad
   ADD CONSTRAINT actividad_tipo_actividad_fk FOREIGN KEY ( id_tipo_actividad )
       REFERENCES tipo_actividad ( id_tipo );

ALTER TABLE asesorias
   ADD CONSTRAINT asesorias_empresa_fk FOREIGN KEY ( id_empresa )
       REFERENCES empresa ( id_empresa );

ALTER TABLE asesorias
   ADD CONSTRAINT asesorias_plan_fk FOREIGN KEY ( id_plan )
       REFERENCES plan ( id_plan );

ALTER TABLE capacitacion_asistente
   ADD CONSTRAINT asistente_actividad_fk FOREIGN KEY ( id_actividad )
       REFERENCES actividad ( id_actividad );

ALTER TABLE capacitacion_asistente
   ADD CONSTRAINT asistente_capacitacion_fk FOREIGN KEY ( id_capacitacion )
       REFERENCES capacitacion ( id_capacitacion );

ALTER TABLE cobros_extra
   ADD CONSTRAINT cobro_extra_fk FOREIGN KEY ( id_tipo_cobro_extra )
       REFERENCES tipo_cobro_extra ( id_tipo );

ALTER TABLE cobroextra_facturacion
   ADD CONSTRAINT cobros_extra_fk FOREIGN KEY ( id_cobro_extra )
       REFERENCES cobros_extra ( id_cobro_extra );

ALTER TABLE comuna
   ADD CONSTRAINT comuna_region_fk FOREIGN KEY ( region_id_region )
       REFERENCES region ( id_region );

ALTER TABLE contrato
   ADD CONSTRAINT contrato_empresa_fk FOREIGN KEY ( empresa_id_empresa )
       REFERENCES empresa ( id_empresa );

ALTER TABLE empleado_cliente
   ADD CONSTRAINT empleado_cliente_fk FOREIGN KEY ( id_empresa )
       REFERENCES empresa ( id_empresa );

ALTER TABLE capacitacion_asistente
   ADD CONSTRAINT empleado_cliente_fkv1 FOREIGN KEY ( id_empleado_cliente )
       REFERENCES empleado_cliente ( id_empleado_cliente );

ALTER TABLE empresa
   ADD CONSTRAINT empresa_plan_fk FOREIGN KEY ( id_plan )
       REFERENCES plan ( id_plan );

ALTER TABLE empresa
   ADD CONSTRAINT empresa_tipo_empresa_fk FOREIGN KEY ( id_tipo_empresa )
       REFERENCES tipo_empresa ( id_tipo );

ALTER TABLE empresa
   ADD CONSTRAINT empresa_usuario_fk FOREIGN KEY ( id_usuario )
       REFERENCES usuario ( id_usuario );

ALTER TABLE detalle_lista
   ADD CONSTRAINT estado_lista_fk FOREIGN KEY ( id_tipo_estado_lista )
       REFERENCES tipo_estado_lista ( id_estado );

ALTER TABLE facturacion
   ADD CONSTRAINT facturacion_empresa_fk FOREIGN KEY ( id_empresa )
       REFERENCES empresa ( id_empresa );

ALTER TABLE cobroextra_facturacion
   ADD CONSTRAINT facturacion_fk FOREIGN KEY ( id_facturacion )
       REFERENCES facturacion ( id_facturacion );

ALTER TABLE facturacion
   ADD CONSTRAINT facturacion_plan_fk FOREIGN KEY ( id_plan )
       REFERENCES plan ( id_plan );

ALTER TABLE info_actividad
   ADD CONSTRAINT info_actividad_actividad_fk FOREIGN KEY ( id_actividad )
       REFERENCES actividad ( id_actividad );

ALTER TABLE insumos
   ADD CONSTRAINT insumos_actividad_fk FOREIGN KEY ( id_actividad )
       REFERENCES actividad ( id_actividad );

ALTER TABLE propuesta_mejora
   ADD CONSTRAINT ista_empresa_fk FOREIGN KEY ( id_lista_empresa )
       REFERENCES lista_empresa ( id_lista );

ALTER TABLE lista_empresa
   ADD CONSTRAINT lista_empresa_fk FOREIGN KEY ( id_empresa )
       REFERENCES empresa ( id_empresa );

ALTER TABLE detalle_lista
   ADD CONSTRAINT lista_empresa_fkv1 FOREIGN KEY ( id_lista_empresa )
       REFERENCES lista_empresa ( id_lista );

ALTER TABLE profesional
   ADD CONSTRAINT profesional_usuario_fk FOREIGN KEY ( id_usuario )
       REFERENCES usuario ( id_usuario );

ALTER TABLE reporte_mensual
   ADD CONSTRAINT reporte_mensual_empresa_fk FOREIGN KEY ( id_empresa )
       REFERENCES empresa ( id_empresa );

ALTER TABLE detalle_lista
   ADD CONSTRAINT tipo_chequeo_fk FOREIGN KEY ( id_tipo_chequeo )
       REFERENCES tipo_chequeo ( id_tipo_chequeo );

ALTER TABLE usuario
   ADD CONSTRAINT usuario_tipo_usuario_fk FOREIGN KEY ( id_tipo_usuario )
       REFERENCES tipo_usuario ( id_tipousuario );

ALTER TABLE visita
   ADD CONSTRAINT visita_plan_fk FOREIGN KEY ( id_plan )
       REFERENCES plan ( id_plan );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            32
-- CREATE INDEX                             0
-- ALTER TABLE                             62
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   1
-- WARNINGS                                 0



-- Insertarcion 

--Insert regiones
insert into region(id_region,nombre) values(1,'Region Metropolitana');
insert into region(id_region,nombre) values(2,'Region de los rios');
insert into region(id_region,nombre) values(3,'Region de los lagos');
insert into region(id_region,nombre) values(4,'Region de Coquimbo');
insert into region(id_region,nombre) values(5,'Region Valparaiso');

-- Insert comunas
insert into comuna(id_comuna,nombre,region_id_region) values(1,'Providencia',1);
insert into comuna(id_comuna,nombre,region_id_region) values(2,'Las condes',1);
insert into comuna(id_comuna,nombre,region_id_region) values(3,'El bosque',1);
insert into comuna(id_comuna,nombre,region_id_region) values(4,'La reina',1);
insert into comuna(id_comuna,nombre,region_id_region) values(5,'San Joaquin',1);

-- Insert tipo empresa
insert into tipo_empresa(id_tipo,descripcion) values(1,'Inmobiliaria');
insert into tipo_empresa(id_tipo,descripcion) values(2,'Informatica');
insert into tipo_empresa(id_tipo,descripcion) values(3,'Contable');
insert into tipo_empresa(id_tipo,descripcion) values(4,'Consultora');
insert into tipo_empresa(id_tipo,descripcion) values(5,'Musical');

--Insertar plan
insert into plan values(1,'Este plan incluye dos visitas al mes, dos cambios al años y bla bla bla');

--Insertar tipo usuario
insert into tipo_usuario values(1,'Adminstrador');
insert into tipo_usuario values(2,'Usuario empresa');
insert into tipo_usuario values(3,'Usuario cliente');
insert into tipo_usuario values(4,'Profesional');

--Insertar usuario
insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(1,1,'admin','admin');
insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(2,3,'LaPolar','laPolar');
insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(3,3,'Julio','profe');
insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(4,3,'Jaime','chofer');

insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(5,1,'jaja','ejje');
insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(6,2,'ripley','laPolar');
insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(7,2,'falabella','profe');
insert into usuario(id_usuario,id_tipo_usuario,nick_name,password) values(8,2,'Nintendo','chofer');


-- Insert empresa
insert into empresa(id_empresa,nombre,id_tipo_empresa,direccion,estado,id_plan,id_usuario,id_comuna) values(1,'Namias',1,'Las condes 123',0,1,5,2);
insert into empresa(id_empresa,nombre,id_tipo_empresa,direccion,estado,id_plan,id_usuario,id_comuna) values(2,'TecnoActive',2,'Cerro Colorado 142',0,1,6,2);
insert into empresa(id_empresa,nombre,id_tipo_empresa,direccion,estado,id_plan,id_usuario,id_comuna) values(3,'GT',3,'La princesa 123',0,1,7,4);
insert into empresa(id_empresa,nombre,id_tipo_empresa,direccion,estado,id_plan,id_usuario,id_comuna) values(4,'Oracle',4,'Antonio varas 667',1,1,8,1);

-- Insert empleado cliente
insert into empleado_cliente(id_empleado_cliente,run,nombre,direccion,id_empresa,operativo) values(1,'11111111-1','Leonard Montez','Las vizcachas 123',1,0);
insert into empleado_cliente(id_empleado_cliente,run,nombre,direccion,id_empresa,operativo) values(2,'22222222-2','David Perez','Las condes 123',1,1);
insert into empleado_cliente(id_empleado_cliente,run,nombre,direccion,id_empresa,operativo) values(3,'33333333-3','Sheldon Cooper','Apoquindo 123',2,0);
insert into empleado_cliente(id_empleado_cliente,run,nombre,direccion,id_empresa,operativo) values(4,'44444444-4','Ted Mosby','Nueva providencia 123',1,1);
insert into empleado_cliente(id_empleado_cliente,run,nombre,direccion,id_empresa,operativo) values(5,'55555555-5','Antonia Gonazales','Santa Rosa 123',4,0);


--Insert empleado cliente
insert into profesional values(1,'Jose Ignacio Martinez','14293451-4','Las palmas 23',1,1);
insert into profesional values(2,'John Snow','847627-4','Los tulipanes 23',1,2);

--Isert Accidente
insert into accidente(id_accidente,fecha_accidente, id_empleado_cliente,descripcion) values(1,'06/08/2019',3,'Se callo y accidento');
insert into accidente(id_accidente,fecha_accidente, id_empleado_cliente,descripcion) values(2,'14/08/2019',3,'Se rompio el brazo');
insert into accidente(id_accidente,fecha_accidente, id_empleado_cliente,descripcion) values(3,'01/09/2019',3,'Le callo un piano en la cabeza');
insert into accidente(id_accidente,fecha_accidente, id_empleado_cliente,descripcion) values(4,'02/09/2019',3,'Se corto una uÃ±a');
insert into accidente(id_accidente,fecha_accidente, id_empleado_cliente,descripcion) values(5,'04/09/2019',3,'Se murio');

-- Insert facturacion
insert into facturacion(id_facturacion, monto_facturacion, fecha_facturacion,id_empresa,fecha_vencimiento,fecha_pago,id_plan) values(1,40000,'06/09/2019',1,'06/10/2019','06/10/2019',1);
insert into facturacion(id_facturacion, monto_facturacion, fecha_facturacion,id_empresa,fecha_vencimiento,fecha_pago,id_plan) values(2,40000,'06/09/2019',2,'06/10/2019','06/10/2019',1);
insert into facturacion(id_facturacion, monto_facturacion, fecha_facturacion,id_empresa,fecha_vencimiento,fecha_pago,id_plan) values(3,40000,'06/09/2019',3,'06/10/2019','06/10/2019',1);
insert into facturacion(id_facturacion, monto_facturacion, fecha_facturacion,id_empresa,fecha_vencimiento,fecha_pago,id_plan) values(4,40000,'06/09/2019',4,'06/10/2019','06/10/2019',1);

--Insert tipo cobro extra
insert into tipo_cobro_extra(id_tipo,descripcion) values(1,'Asesoria');
insert into tipo_cobro_extra(id_tipo,descripcion) values(2,'Modificacion lista');
insert into tipo_cobro_extra(id_tipo,descripcion) values(3,'Capacitacion');

--Insert cobros extra
insert into cobros_extra(id_cobro_extra,monto,fecha_cobro_extra,id_tipo_cobro_extra)values(1,30000,'03/06/2019',1);
insert into cobros_extra(id_cobro_extra,monto,fecha_cobro_extra,id_tipo_cobro_extra)values(2,30000,'07/06/2019',1);
insert into cobros_extra(id_cobro_extra,monto,fecha_cobro_extra,id_tipo_cobro_extra)values(3,40000,'06/06/2019',2);
insert into cobros_extra(id_cobro_extra,monto,fecha_cobro_extra,id_tipo_cobro_extra)values(4,70000,'03/06/2019',1);
insert into cobros_extra(id_cobro_extra,monto,fecha_cobro_extra,id_tipo_cobro_extra)values(5,30000,'01/06/2019',3);

-- Insert cobro extra
insert into cobroextra_facturacion(id,cantidad,id_cobro_extra,id_facturacion)values(1,30000,3,1);

--Insert tipo chequeo
insert into tipo_chequeo(id_tipo_chequeo,nombre_chequeo,descripcion) values(1,'Baños','Los baños estan limpios');
insert into tipo_chequeo(id_tipo_chequeo,nombre_chequeo,descripcion) values(2,'Extintores','Los extintores funcionan');
insert into tipo_chequeo(id_tipo_chequeo,nombre_chequeo,descripcion) values(3,'Alarma de incendios','La alarma de incendios suena');
insert into tipo_chequeo(id_tipo_chequeo,nombre_chequeo,descripcion) values(4,'Casco','Se usa casco');
insert into tipo_chequeo(id_tipo_chequeo,nombre_chequeo,descripcion) values(5,'Jabon','Se lavan las manos');

--Insert tipo estado lista
insert into tipo_estado_lista(id_estado,descripcion)values(1,'No vigente');
insert into tipo_estado_lista(id_estado,descripcion)values(2,'Vigente');

--Insert lista empresa
insert into lista_empresa(id_lista,descripcion,id_empresa,fecha_realizacion,vigente) values(1,'Lista creada hoy',1,'10/09/2019',1);
insert into lista_empresa(id_lista,descripcion,id_empresa,fecha_realizacion,vigente) values(2,'Lista creada hoy',2,'10/09/2019',1);
insert into lista_empresa(id_lista,descripcion,id_empresa,fecha_realizacion,vigente) values(3,'Lista creada hoy',3,'10/09/2019',1);
insert into lista_empresa(id_lista,descripcion,id_empresa,fecha_realizacion,vigente) values(4,'Lista creada hoy',4,'10/09/2019',1);

--Insert detalle lista
insert into detalle_lista(id_detalle_lista,id_tipo_chequeo,id_lista_empresa,id_tipo_estado_lista) values(1,1,1,1);
insert into detalle_lista(id_detalle_lista,id_tipo_chequeo,id_lista_empresa,id_tipo_estado_lista) values(2,2,1,1);
insert into detalle_lista(id_detalle_lista,id_tipo_chequeo,id_lista_empresa,id_tipo_estado_lista) values(3,3,1,1);
insert into detalle_lista(id_detalle_lista,id_tipo_chequeo,id_lista_empresa,id_tipo_estado_lista) values(4,4,1,2);
insert into detalle_lista(id_detalle_lista,id_tipo_chequeo,id_lista_empresa,id_tipo_estado_lista) values(5,5,1,1);

--insert propuesta mejora 
insert into propuesta_mejora(id_propuesta,descripcion,id_lista_empresa,aprovada) values(1,'Debe mejorar los extintores',1,1);

--Reporte mensual
insert into reporte_mensual(id_reporte,fecha_reporte,id_empresa,descripcion) values(1,'07/09/2019',1,'LA empresa tiene muchas cosas malas que hay que mejorar');
insert into reporte_mensual(id_reporte,fecha_reporte,id_empresa,descripcion) values(2,'07/09/2019',2,'Hay que cambiar los extintores');
insert into reporte_mensual(id_reporte,fecha_reporte,id_empresa,descripcion) values(3,'05/09/2019',3,'Los baños hay que limpairlos con cloro');   
insert into reporte_mensual(id_reporte,fecha_reporte,id_empresa,descripcion) values(4,'08/09/2019',4,'Esta empresa esta perfecta');

--Insertar contrato
insert into contrato(id_contrato, fecha_inicio, fecha_termino, ubicacion_archivo, empresa_id_empresa) values(1,'01/01/2019','01/01/2020','archivos/contratos/1.pdf',1);
insert into contrato(id_contrato, fecha_inicio, fecha_termino, ubicacion_archivo, empresa_id_empresa) values(2,'01/02/2019','01/02/2020','archivos/contratos/2.pdf',2);
insert into contrato(id_contrato, fecha_inicio, fecha_termino, ubicacion_archivo, empresa_id_empresa) values(3,'01/03/2019','01/03/2020','archivos/contratos/3.pdf',3);
insert into contrato(id_contrato, fecha_inicio, fecha_termino, ubicacion_archivo, empresa_id_empresa) values(4,'01/04/2019','01/04/2020','archivos/contratos/4.pdf',4);

--Insertar tipo actividad
insert into tipo_actividad(id_tipo,descripcion) values(1,'Visita de rutina');
insert into tipo_actividad(id_tipo,descripcion) values(2,'Asesoria');
insert into tipo_actividad(id_tipo,descripcion) values(3,'Cambio de lista');
insert into tipo_actividad(id_tipo,descripcion) values(4,'Capacitacion');
insert into tipo_actividad(id_tipo,descripcion) values(5,'Fiscalizacion');

--Insertar actividad
insert into actividad(id_actividad,id_tipo_actividad, direccion,enterreno,id_empleado, tiempo_ejecucion,fecha_actividad, descripcion,check_list,realizada,id_empresa) values(1,1,'Huechuraba 123',1,1,14,'08/09/2019','Se revisara las mejoras','Utilizaremos la lista de chequeo',1,1);
insert into actividad(id_actividad,id_tipo_actividad, direccion,enterreno,id_empleado, tiempo_ejecucion,fecha_actividad, descripcion,check_list,realizada,id_empresa) values(2,1,'Filomena 123',1,1,16,'10/09/2019','Se revisara el estado de los cascos','Utilizaremos la lista de chequeo',1,1);
insert into actividad(id_actividad,id_tipo_actividad, direccion,enterreno,id_empleado, tiempo_ejecucion,fecha_actividad, descripcion,check_list,realizada,id_empresa) values(3,1,'Las tortolas 123',0,1,19,'03/09/2019','Se revisara el estado de los extintores','Utilizaremos la lista de chequeo',1,1);
insert into actividad(id_actividad,id_tipo_actividad, direccion,enterreno,id_empleado, tiempo_ejecucion,fecha_actividad, descripcion,check_list,realizada,id_empresa) values(4,1,'Antonio Varas 123',0,1,51,'02/09/2019','Se revisara las mejoras','Utilizaremos la lista de chequeo',1,1);
insert into actividad(id_actividad,id_tipo_actividad, direccion,enterreno,id_empleado, tiempo_ejecucion,fecha_actividad, descripcion,check_list,realizada,id_empresa) values(5,1,'Pedro de valdivia 123',1,1,81,'01/09/2019','Se revisara las fallas','Utilizaremos la lista de chequeo',1,1);

--Insertar insumos
insert into insumos values(1,'Se necesitara todo tipo de cosas',1);


--Insertar info_actividad
insert into info_actividad values(1,'Han mejorado las mejoras',1);
insert into info_actividad values(2,'Hay cascos rotos',1);
insert into info_actividad values(3,'Los extintores funcionan bien',1);
insert into info_actividad values(4,'No hay mejoras para futuro',1);
insert into info_actividad values(5,'No han mejorado nada',1);

--Insertar capacitacion
insert into capacitacion values(1,'11/12/2019','Empresa la polar');

--Insertar capacitacion asistente
insert into capacitacion_asistente values(1,100,1,1,1,'11/12/2019',1);
insert into capacitacion_asistente values(2,100,2,1,1,'11/12/2019',1);
insert into capacitacion_asistente values(3,100,3,1,1,'11/12/2019',1);
insert into capacitacion_asistente values(4,100,4,1,1,'11/12/2019',1);

-- insertar Asesoria
insert into asesorias(id_asesoria,descripcion,id_empresa,vigente,id_plan) values(1,'En esta asesoria se enseñara a cuidar a sus empleados',1,1,1);
insert into asesorias(id_asesoria,descripcion,id_empresa,vigente,id_plan) values(2,'Se recomendo limpiar las escaleras',2,1,1);
insert into asesorias(id_asesoria,descripcion,id_empresa,vigente,id_plan) values(3,'Deben tener cuidado con los asensores',3,1,1);
insert into asesorias(id_asesoria,descripcion,id_empresa,vigente,id_plan) values(4,'Deben limpar mas las escaleras',4,1,1);

--Insertar asesioria actividad
insert into asesoria_actividad values(1,1,1,1);
insert into asesoria_actividad values(2,1,2,2);
insert into asesoria_actividad values(3,1,3,3);
insert into asesoria_actividad values(4,1,4,4);
insert into asesoria_actividad values(5,1,5,5);


--Procedimientos almacenados

-------------usuarios--------------------
create or replace procedure traerUsuario
(
  usuarios in out sys_refcursor,
  eid_usuario in number
)
is
begin
  open usuarios for select * from usuario where id_usuario = eid_usuario;
end;
/
-----------------------CrudEmpresa------------------------------------------------
create or replace procedure ingresarEmpresa
(
  Enombre in varchar,
  Eid_tipo_empresa number,
  Edireccion varchar,
  Eestado number,
  Eid_comuna number
)
is
begin
  insert into empresa(nombre,id_tipo_empresa,direccion,estado,id_comuna) values(Enombre,Eid_tipo_empresa,Edireccion,Eestado,Eid_comuna);
end;
/

create or replace procedure traerEmpresa
(
  empresas in out sys_refcursor
)
is
begin
  open empresas for select * from empresa;
end;
/
create or replace procedure traerEmpresaId
(
  empresas in out sys_refcursor,
  id in number
)
is
begin
  open empresas for select * from empresa where id_empresa = id;
end;
/
create or replace procedure actualizarEmpresa
(
  enombre in varchar,
  eid_tipo_empresa in number,
  Edireccion in varchar,
  eestado in number,
  Eid_comuna in number
)
is
begin
  update empresa set nombre = Enombre, id_tipo_empresa = Eid_tipo_empresa, direccion = Edireccion, estado = Eestado, id_comuna = Eid_comuna;
end;
/

create or replace procedure eliminarempresa
(
  eid_empresa in number
)
is
begin
  update empresa set estado = 1 where id_empresa = eid_empresa;
end;
/
--------------Crud empleado---------------------------------------------------
create or replace procedure ingresarempleado
(
  erun_empleado_cliente in varchar,
  erun in varchar,
  enombre in varchar,
  edireccion in varchar,
  eid_empresa in number,
  eoperativo in number
)
is
begin
  insert into empleado_cliente(run,nombre,direccion,id_empresa,operativo) values(erun, enombre, edireccion, eid_empresa, eoperativo);
end;
/
create or replace procedure listarempleados
(
  empleados in out sys_refcursor
)
is
begin
  open empleados for select * from empleado_cliente;
end;

/
create or replace procedure listarempleadoId
(
  empleados in out sys_refcursor,
  eid_empleado in number
)
is
begin
  open empleados for select * from empleado_cliente where id_empleado_cliente = eid_empleado;
end;

/
create or replace procedure actualizarEmpleado
(
  enombres in varchar,
  edireccion in varchar,
  eid in number
)
is
begin
  update empleado_cliente set nombre = enombres, direccion = edireccion where id_empleado_cliente = eid;
end;

/
create or replace procedure eliminarEmpleado
(
  eid_empleado in number
)
is
begin
  update empleado_cliente set operativo = 1 where id_empleado_cliente = eid_empleado;
end;
/

--------------------Crud profesional -----------------------------------------

create or replace procedure insertarprofesional
(
  enombre in varchar,
  erut in varchar,
  edireccion in varchar,
  econtratado in number
)
is
begin
  insert into profesional(nombre, rut,direccion,contratado) values(enombre, erut, edireccion, econtratado);
end;
/
create or replace procedure listarprofesional
(
  profesionales in out sys_refcursor
)
is
begin
  open profesionales for select * from profesional;
end;
/
create or replace procedure listarprofesionalid
(
  profesionales in out sys_refcursor,
  eid_profesional in number
)
is
begin
  open profesionales for select * from profesional where id_profesional = eid_profesional;
end;
/
create or replace procedure actualizarProfesional
(
  enombre in varchar,
  edireccion in varchar
)
is
begin
  update profesional set nombre = enombre, direccion = edireccion;
end;
/
create or replace procedure eliminarprofesional
(
  eid_profesional in number
)
is
begin
  update profesional set contratado = 1 where id_profesional = eid_profesional;
end;
/

