/* Aula de OO em Java */

CREATE TABLE clientes (
    id_cliente int AUTO_INCREMENT NOT NULL,
    tipo varchar(1) NOT NULL, /*Tipo de cliente: F (Físico) ou J (Jurídico)*/
    nome varchar(70) NOT NULL,
    cpf varchar(30),
    cnpj varchar(30),
    sexo varchar(1),
    razao_social varchar(70),
    endereco varchar(70),
    cidade varchar(70),
    uf varchar(2),
    PRIMARY KEY (id_cliente)   
);




