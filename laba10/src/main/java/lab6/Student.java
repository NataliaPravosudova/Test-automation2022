package lab6;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class Student {
//    `student` (
//            `id_student` INT NOT NULL AUTO_INCREMENT,
//  `name` VARCHAR(100) NOT NULL,
//  `size` VARCHAR(4) NULL,
//  `birthday` DATETIME NULL,
//    PRIMARY KEY (`id_student`));

    @Id
    private Long id_student;
    private String name;
    private String size;
    private Date birthday;

    public Long getId_student() {
        return id_student;
    }

    public void setId_student(Long id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
