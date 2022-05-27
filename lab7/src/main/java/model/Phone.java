package lab7.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Phone{

    @Id
    private Long idphone;
    private String number;
    private Long id_student;

    @ManyToOne
    @JoinColumn(name = "id_student", insertable=false, updatable=false)
    private RelatedStudent student;

    public Long getIdphone() {
        return idphone;
    }

    public void setIdphone(Long idphone) {
        this.idphone = idphone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId_student() {
        return id_student;
    }

    public void setId_student(Long id_student) {
        this.id_student = id_student;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "idphone=" + idphone +
                ", number='" + number + '\'' +
                ", id_student=" + id_student +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(idphone, phone.idphone) && Objects.equals(number, phone.number) && Objects.equals(id_student, phone.id_student) && Objects.equals(student, phone.student);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idphone, number, id_student, student);
    }
}