package lab7.model;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class RelatedStudent {
    @Id
    private Long id_student;
    private String name;
    private String size;
    private Date bd;

    @OneToMany(mappedBy = "idphone")
    public Set<Phone> phoneSet;

    @MapsId
    @OneToOne
    @JoinColumn(name="id_address")
    private RelatedAddress relatedAddress;

    public Set<Phone> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(Set<Phone> phoneSet) {
        this.phoneSet = phoneSet;
    }

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

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "RelatedStudent{" +
                "id_student=" + id_student +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", bd=" + bd +
                ", phoneSet=" + phoneSet +
                ", relatedAddress=" + relatedAddress +
                '}';
    }
}