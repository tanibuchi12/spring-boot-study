DROP TABLE IF EXISTS PLAYER;

CREATE TABLE PLAYER (
ID       INT NOT NULL AUTO_INCREMENT,
NAME     VARCHAR(30) NOT NULL,
NUMBER   INT NOT NULL,
POSITION VARCHAR(2) NOT NULL,
PRIMARY KEY(ID)
);