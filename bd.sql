
CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    last_name varchar(255),
    first_name varchar(255),
    password text,
    phone_number varchar(9),
    matricule varchar(10) UNIQUE,
    type ENUM('STUDENT', 'ADMIN'),
    
    PRIMARY KEY (id)
);



CREATE TABLE classe(
    id int NOT NULL AUTO_INCREMENT,
    departement varchar(255),
    cycle varchar(100),
    level int,
    
    PRIMARY KEY (id)
);

ALTER TABLE users
    ADD classe INTEGER,
    ADD CONSTRAINT FOREIGN KEY(classe) REFERENCES classe(id) ON DELETE CASCADE;

CREATE TABLE ue(
    id int NOT NULL AUTO_INCREMENT,
    code varchar(10),
    intitule text,
    classe int,
    
    FOREIGN KEY (classe) REFERENCES classe(id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);


CREATE TABLE note(
    id int NOT NULL AUTO_INCREMENT,
    ue int,
    user int,
    exam ENUM('CC','TP','SN','S3','S4'),
    value double,
    
    FOREIGN KEY (ue) REFERENCES ue(id) ON DELETE CASCADE,
    FOREIGN KEY (user) REFERENCES users(id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);

CREATE TABLE sms(
    id int NOT NULL AUTO_INCREMENT,
    note int,
    user int,
    state boolean,
    
    FOREIGN KEY (note) REFERENCES note(id) ON DELETE CASCADE,
    FOREIGN KEY (user) REFERENCES users(id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);
