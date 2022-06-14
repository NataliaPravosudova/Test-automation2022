package lab6;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Employee {

//    CREATE TABLE `attest`.`employee` (
//      `id_employee` INT NOT NULL AUTO_INCREMENT,
//      `name` VARCHAR(45) NOT NULL,
//      `job` VARCHAR(100) NULL,
//      `rank` VARCHAR(45) NULL,
//      `age` INT NULL,
//    PRIMARY KEY (`id_employee`));


    @Id
    private Long id_employee;
    private String name;
    private String job;
    private String rank;
    private Integer age;

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id_employee=" + id_employee +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", rank='" + rank + '\'' +
                ", age=" + age +
                '}';
    }
}
