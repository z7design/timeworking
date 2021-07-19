INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Alex', 'Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Maria', 'Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Jose', 'Mario', 'zmdesignweb@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('David', 'Justino', 'davidjustino@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_DRIVER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 2);

INSERT INTO tb_address (cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi)VALUES('32378-026','Rua Rio de Janeiro', 0, 'Vila Universal', 'betim', 'mg', '3550308',0, '31', '7107');
INSERT INTO tb_address (cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi)VALUES('32378-020','Rua Minas Gerais', 0, 'Espirito Santo', 'betim', 'mg', '3550308',0, '31', '7108');
INSERT INTO tb_address (cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi)VALUES('32378-022','Rua Santa Catarina', 0, 'Amazonas', 'betim', 'mg', '3550308',0, '31', '7109');
INSERT INTO tb_address (cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi)VALUES('32378-028','Rua Minas Gerais', 0, 'Vila Universal', 'betim', 'mg', '3550308',0, '31', '7106');

INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('Tecksid', '00825545502','73869687000170','Tecksid','contato@tekside.com','2021-01-14T10:00:00Z');
INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('Nansem', '00825545502','63110812000100','Nansem','contato@tekside.com','2021-01-14T10:00:00Z');
INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('SEOYON', '00825545502','39213127000124','Plascar','contato@tekside.com','2021-01-14T10:00:00Z');
INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('Real', '00825545502','39213127000124','Plascar','contato@tekside.com','2021-01-14T10:00:00Z');
INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('Marelli', '00825545502','39213127000124','Marelli','contato@tekside.com','2021-01-14T10:00:00Z');
INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('FORMTAP', '00825545502','39213127000124','FORMTAP','contato@tekside.com','2021-01-14T10:00:00Z');
INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('GARAGEM', '00825545502','39213127000124','Plascar','contato@tekside.com','2021-01-14T10:00:00Z');
INSERT INTO tb_client (name, cpf, cnpj, razon_social, email, date_register) VALUES ('Plascar', '00825545502','39213127000124','Plascar','contato@tekside.com','2021-01-14T10:00:00Z');

INSERT INTO tb_route (name, code_Route) VALUES ('VISTA ALEGRE (A)','01-B08');
INSERT INTO tb_route (name, code_Route) VALUES ('VISTA ALEGRE (A)R','01-A08R');
INSERT INTO tb_route (name, code_Route) VALUES ('VISTA ALEGRE (A)R','01-A12');
INSERT INTO tb_route (name, code_Route) VALUES ('MORADA DA SERRA (A) R','01-A12R');
INSERT INTO tb_route (name, code_Route) VALUES ('BOM SUCESSO (A)01-A19','01-A19');
INSERT INTO tb_route (name, code_Route) VALUES ('BOM SUCESSO','01-A19R');
INSERT INTO tb_route (name, code_Route) VALUES ('JARDIM PETROPOLIS (A)','02-A36');
INSERT INTO tb_route (name, code_Route) VALUES ('VISTA ALEGRE (A)','01-A08');
INSERT INTO tb_route (name, code_Route) VALUES ('CENTRO IBIRITE (A)','01-A08COMPL');
INSERT INTO tb_route (name, code_Route) VALUES ('CENTRO IBIRITE (A) R','01-A12COMPL');
INSERT INTO tb_route (name, code_Route) VALUES ('M DA SERRA COMPL (A)','01-A08-Ñ-PROD');
INSERT INTO tb_route (name, code_Route) VALUES ('MANGUEIRAS COMPL (A)','01-A12-Ñ-PROD');
INSERT INTO tb_route (name, code_Route) VALUES ('VISTA ALEGRE IMPROD(A)','04-A04R');
INSERT INTO tb_route (name, code_Route) VALUES ('SABARA COMPL (A)','04-A04 COMPL');
INSERT INTO tb_route (name, code_Route) VALUES ('Contagem(A)','CONTAGEM(A)');
INSERT INTO tb_route (name, code_Route) VALUES ('Contagem(B)','CONTAGEM(B)');
INSERT INTO tb_route (name, code_Route) VALUES ('Contagem(A)SAB','CONTAGEM(A)SAB');
INSERT INTO tb_route (name, code_Route) VALUES ('Contagem(B)SAB','CONTAGEM(B)SAB');
INSERT INTO tb_route (name, code_Route) VALUES ('Contagem(ADM)','CONTAGEM ADM');
INSERT INTO tb_route (name, code_Route) VALUES ('NOVA CONTAGEM (A)','NOVA CONTAGEM(A)');
INSERT INTO tb_route (name, code_Route) VALUES ('NOVA CONTAGEM (B)','NOVA CONTAGEM(B)');
INSERT INTO tb_route (name, code_Route) VALUES ('NOVA CONTAGEM (C)','NOVA CONTAGEM(C)');
INSERT INTO tb_route (name, code_Route) VALUES ('IBIRITE(A)','IBIRITE(A)');
INSERT INTO tb_route (name, code_Route) VALUES ('IBIRITE(B)','IBIRITE(B)');
INSERT INTO tb_route (name, code_Route) VALUES ('IBIRITE(C)','IBIRITE(C)');
INSERT INTO tb_route (name, code_Route) VALUES ('TROPICAL(A)','TROPICAL(A)');
INSERT INTO tb_route (name, code_Route) VALUES ('TROPICAL(B)','TROPICAL(B)');
INSERT INTO tb_route (name, code_Route) VALUES ('TROPICAL(C)','TROPICAL(C)');
INSERT INTO tb_route (name, code_Route) VALUES ('BETIM(A)','BETIM(A)');
INSERT INTO tb_route (name, code_Route) VALUES ('BETIM(B)','BETIM(B)');
INSERT INTO tb_route (name, code_Route) VALUES ('BETIM(C)','BETIM(C)');
INSERT INTO tb_route (name, code_Route) VALUES ('PTB(A)','PTB(A)');
INSERT INTO tb_route (name, code_Route) VALUES ('ICAIVERA(A)','ICAIVERA(A)');
INSERT INTO tb_route (name, code_Route) VALUES ('ICAIVERA(B)','ICAIVERA(B)');
INSERT INTO tb_route (name, code_Route) VALUES ('ICAIVERA(C)','ICAIVERA(C)');
INSERT INTO tb_route (name, code_Route) VALUES ('PEDRA AZUL(C)','PEDRA AZUL(C)');
INSERT INTO tb_route (name, code_Route) VALUES ('MAG/BETIM','MAG/BETIM');
INSERT INTO tb_route (name, code_Route) VALUES ('MAG/CONTAGEM','MAG/CONTAGEM');
INSERT INTO tb_route (name, code_Route) VALUES ('MAG/CONTAGEM','MAG/NOVA CONTAGEM');
INSERT INTO tb_route (name, code_Route) VALUES ('MAG/CONTAGEM','MAG/BARREIRO');

INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 1);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 2);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 3);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 4);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 5);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 6);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 7);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 8);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 9);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 10);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 11);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 12);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 13);
INSERT INTO tb_client_route (client_id, route_id) VALUES (1, 14);

INSERT INTO tb_client_route (client_id, route_id) VALUES (2, 23);
INSERT INTO tb_client_route (client_id, route_id) VALUES (2, 24);
INSERT INTO tb_client_route (client_id, route_id) VALUES (2, 25);

INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 15);
INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 16);
INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 17);
INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 18);
INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 19);
INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 20);
INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 21);
INSERT INTO tb_client_route (client_id, route_id) VALUES (3, 22);

INSERT INTO tb_client_route (client_id, route_id) VALUES (4, 26);
INSERT INTO tb_client_route (client_id, route_id) VALUES (4, 27);
INSERT INTO tb_client_route (client_id, route_id) VALUES (4, 28);


INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Felix', 'https://img-premium.flaticon.com/png/512/607/607345.png?token=exp=1623424784~hmac=140c92ef8a190f223cd26c58c68f5eaf','319999990','felix@site.com.br','325655', '253456254658','789538425','00825545502');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Joao', 'https://img-premium.flaticon.com/png/512/305/305982.png?token=exp=1623424840~hmac=6598b2f130d445339455f19ab5b8a924','319999990','contato@site.com.br','325655', '253456254658','432412542','14409950010');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Weverton', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','contato@site.com.br','325655', '253456254658','176526183','35020821039');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Maurilio', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','192110536','51598267000');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Cassio', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','361949418','19833745040');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Gerivaldo', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','489280614','82141662095');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Eliazar', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','266849957','74508582079');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Michael', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','141824347','32080649000');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Guedes', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','243566979','75178068076');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Rafael', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','495704441','68365506041');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Vagner Maciael', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','504550512','44864752087');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Deusdete', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','177849083','92563783020');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Paulo Franca', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','222000181','06678413008');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Marcelo', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','147090428','74966426065');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Danile Pieres', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','325655', '253456254658','405264951','07570125070');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Alison', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','30110921', '69133379419','346107866','94357321000');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Caetano', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','30520540', '57630349160','429564417','24801829082');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Carlos Herinque', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31070230', '29488289916','160444329','37385874037');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Carlos Roberto', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','30315150', '19463554387','434901088','98821154033');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Felipe', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '11779851376','265195226','63568112000');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Euler', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '15371043252','477629684','24762903000');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Eliazar', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '16805603582','241805818','31430929049');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Emersom', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '04563311702','412256368','15592479085');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Julio', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '22588881067','200904528','64085080067');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Rogerio', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '27455531788','310659127','57170211009');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Rael', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '00611363346','282710401','41437550096');
INSERT INTO tb_driver (name, img_Url, celphone, email, cep, cnh, rg, cpf ) VALUES ('Vitorino', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg','319999990','seumail@site.com.br','31970076', '19841403780','134037558','26929421081');


INSERT INTO tb_fleet (number, description) VALUES ('400','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('500','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('1500','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('2600','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3000','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3300','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3400','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3450','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3350','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3500','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3550','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3600','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3650','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3750','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3850','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('3950','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4000','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4050','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4100','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4150','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4200','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4250','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4350','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4450','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4550','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4650','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4750','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4850','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('4950','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('5050','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('5150','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('5250','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('5350','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('1','OLYMPUSTURISMO');
INSERT INTO tb_fleet (number, description) VALUES ('VALONE','OLYMPUSTURISMO');

INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (1, 16);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (2, 15);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (3, 14);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (4, 13);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (5, 12);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (6, 11);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (6, 10);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (7, 9);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (8, 8);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (9, 7);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (10, 6);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (11, 5);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (12, 4);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (13, 3);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (14, 2);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (15, 2);
INSERT INTO tb_driver_fleet (driver_id, fleet_id) VALUES (16, 1);

INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO','',1, 1, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:07', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',1, 1, 2, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',0, 1, 3, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 0, 4, 2, 4, 14);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',0, 1, 5, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',1, 0, 6, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',0, 1, 7, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 0, 8, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '22:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',1, 1, 9, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',1, 0, 10, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',0, 1, 11, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',1, 0, 12, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',0, 1, 13, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 0, 14, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',0, 1, 15, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 0, 16, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',0, 1, 17, 1, 2, 1);
INSERT INTO tb_shedules_teams(hours_initial, hours_finish, date_register, shift, input_Type, output_Type, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 0, 18, 1, 2, 1);


INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (1, 16);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (2, 15);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (3, 14);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (5, 13);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (7, 12);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (9, 11);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (11, 10);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (12, 13);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (4, 15);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (8, 9);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (14, 3);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (5, 6);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (8, 1);
INSERT INTO tb_shedules_teams_driver(shedules_teams_id, driver_id) VALUES (6, 3);

INSERT INTO tb_shedules_teams_fleet(shedules_teams_id, fleet_id) VALUES (1, 6);
INSERT INTO tb_shedules_teams_fleet(shedules_teams_id, fleet_id) VALUES (2, 5);
INSERT INTO tb_shedules_teams_fleet(shedules_teams_id, fleet_id) VALUES (3, 4);
INSERT INTO tb_shedules_teams_fleet(shedules_teams_id, fleet_id) VALUES (4, 3);
INSERT INTO tb_shedules_teams_fleet(shedules_teams_id, fleet_id) VALUES (5, 2);
INSERT INTO tb_shedules_teams_fleet(shedules_teams_id, fleet_id) VALUES (6, 1);

INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (1, 6);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (1, 5);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (1, 4);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (1, 3);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (1, 2);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (1, 1);

INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (2, 6);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (2, 5);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (2, 4);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (2, 3);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (2, 2);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (2, 1);

INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (3, 6);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (3, 5);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (3, 4);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (3, 3);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (3, 2);
INSERT INTO tb_shedules_teams_client(shedules_teams_id, client_id) VALUES (3, 1);

INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (1, 1);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (1, 2);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (1, 3);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (1, 4);

INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (2, 5);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (2, 6);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (2, 7);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (2, 8);

INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (3, 1);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (3, 2);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (3, 3);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (3, 4);

INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (4, 5);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (4, 6);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (4, 7);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (4, 8);

INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (5, 5);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (5, 6);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (5, 7);
INSERT INTO tb_shedules_teams_route(shedules_teams_id, route_id) VALUES (5, 8);

INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 8);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 7);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 6);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 5);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 4);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 3);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 2);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (1, 1);

INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 8);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 7);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 6);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 5);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 4);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 3);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 2);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (2, 1);

INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 8);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 7);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 6);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 5);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 4);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 3);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 2);
INSERT INTO tb_fleet_route(fleet_id, route_id) VALUES (3, 1);

INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:07', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',2, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',3, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',4, 2, 4, 14);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',5, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',6, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',7, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',8, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '22:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',9, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',10, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',11, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',12, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',13, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',14, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',15, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',16, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',17, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',18, 1, 2, 1);


INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:07', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',2, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',3, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',4, 2, 4, 14);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',5, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',6, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',7, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',8, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '22:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',9, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',10, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',11, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',12, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',13, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',14, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',15, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',16, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',17, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',18, 1, 2, 1);


INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (1, 16);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (2, 15);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (3, 14);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (5, 13);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (7, 12);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (9, 11);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (11, 10);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (12, 13);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (4, 15);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (8, 9);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (14, 3);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (5, 6);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (8, 1);
INSERT INTO tb_onduty_driver(onduty_id, driver_id) VALUES (6, 3);


INSERT INTO tb_onduty_fleet(onduty_id, fleet_id) VALUES (1, 6);
INSERT INTO tb_onduty_fleet(onduty_id, fleet_id) VALUES (2, 5);
INSERT INTO tb_onduty_fleet(onduty_id, fleet_id) VALUES (3, 4);
INSERT INTO tb_onduty_fleet(onduty_id, fleet_id) VALUES (4, 3);
INSERT INTO tb_onduty_fleet(onduty_id, fleet_id) VALUES (5, 2);
INSERT INTO tb_onduty_fleet(onduty_id, fleet_id) VALUES (6, 1);

INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (1, 6);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (1, 5);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (1, 4);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (1, 3);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (1, 2);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (1, 1);

INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (2, 6);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (2, 5);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (2, 4);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (2, 3);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (2, 2);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (2, 1);

INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (3, 6);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (3, 5);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (3, 4);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (3, 3);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (3, 2);
INSERT INTO tb_onduty_client(onduty_id, client_id) VALUES (3, 1);

INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (1, 1);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (1, 2);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (1, 3);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (1, 4);

INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (2, 5);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (2, 6);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (2, 7);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (2, 8);

INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (3, 1);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (3, 2);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (3, 3);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (3, 4);

INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (4, 5);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (4, 6);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (4, 7);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (4, 8);

INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (5, 5);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (5, 6);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (5, 7);
INSERT INTO tb_onduty_route(onduty_id, route_id) VALUES (5, 8);

INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',1, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:07', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',2, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',3, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',4, 2, 4, 14);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',5, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',6, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '00:00','22:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',7, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',8, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '22:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',9, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',10, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',11, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',12, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',13, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',14, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','2º TURNO',15, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',16, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','3º TURNO',17, 1, 2, 1);
INSERT INTO tb_onduty(hours_initial, hours_finish, date_register, shift, driver_id, fleet_id, client_id, route_id) VALUES ( '13:00','00:00', TIMESTAMP WITH TIME ZONE '2019-01-03T10:00:00Z','1º TURNO',18, 1, 2, 1);

