CREATE SCHEMA `graphql_tutorial` DEFAULT COLLATE = `utf8_bin` DEFAULT CHARACTER
SET = `utf8`;

CREATE TABLE `owners` (
    `id` INT (11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `firstname` VARCHAR(255) DEFAULT NULL,
    `lastname` VARCHAR(255) DEFAULT NULL,
    `age` TINYINT (3) DEFAULT NULL);

CREATE TABLE `pets` (
    `id` INT (11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) DEFAULT NULL,
    `age` TINYINT (3) DEFAULT NULL,
    `type` ENUM ('DOG', 'CAT', 'BADGER', 'MAMMOTH'),
    `owner_id` INT (11) DEFAULT NULL,
        FOREIGN KEY fk_owner (id) REFERENCES owners (id) ON
        UPDATE
            CASCADE ON DELETE RESTRICT);

INSERT INTO `owners` (`firstname`, `lastname`, `age`)
    VALUES ('Steve', 'Stevensen', 5), ('Jeff', 'Jeffersen', 88), ('Oscar', 'Oscarsen', 2), ('Heiko', 'Stumpf', 2);

INSERT INTO `pets` (`name`, `age`, `type`, `owner_id`)
    VALUES ('Steve', 5, 'BADGER', 1), ('Jeff', 88, 'MAMMOTH', 2), ('Oscar', 2, 'CAT',2), ('Heiko', 2, 'DOG', 4);