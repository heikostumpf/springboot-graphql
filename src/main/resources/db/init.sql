CREATE SCHEMA `graphql_tutorial` DEFAULT COLLATE=`utf8_bin` DEFAULT CHARACTER SET=`utf8`;

CREATE TABLE `pets` (`id` INT(11) NOT NULL AUTO_INCREMENT, `name` VARCHAR(255) DEFAULT NULL, `age` TINYINT(3) DEFAULT NULL, `type` ENUM('DOG','CAT','BADGER','MAMMOTH'), PRIMARY KEY(`id`));

INSERT INTO `pets` (`name`,`age`,`type`) VALUES ('Steve', 5, 'BADGER'), ('Jeff', 88, 'MAMMOTH'), ('Oscar', 2, 'CAT'), ('Heiko', 2, 'DOG');