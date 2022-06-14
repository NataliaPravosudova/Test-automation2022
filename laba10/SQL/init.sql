CREATE SCHEMA `attest` ;

CREATE TABLE `attest`.`student` (
  `id_student` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `size` VARCHAR(4) NULL,
  `birthday` DATETIME NULL,
  PRIMARY KEY (`id_student`));

  CREATE TABLE `attest`.`address` (
    `id_address` INT NOT NULL AUTO_INCREMENT,
    `city` VARCHAR(45) NULL,
    `street` VARCHAR(45) NULL,
    `building` INT NULL,
    PRIMARY KEY (`id_address`));

    CREATE TABLE `attest`.`employee` (
      `id_employee` INT NOT NULL AUTO_INCREMENT,
      `name` VARCHAR(45) NOT NULL,
      `job` VARCHAR(100) NULL,
      `rank` VARCHAR(45) NULL,
      `age` INT NULL,
      PRIMARY KEY (`id_employee`));

