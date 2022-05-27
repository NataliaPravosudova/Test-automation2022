package lab7.model;
import javax.persistence.*;

@Entity
public class RelatedAddress {

    @Id
    private Long id_address;
    private String city;
    private String street;
    private Integer building;
    @OneToOne
    @MapsId
    @JoinColumn(name="id_student")
    private RelatedStudent relatedStudent;

    public RelatedStudent getRelatedStudent() {
        return relatedStudent;
    }
    public void setRelatedStudent(RelatedStudent relatedStudent) {
        this.relatedStudent = relatedStudent;
    }
    public Long getId_address() {
        return id_address;
    }
    public void setId_address(Long id_address) {
        this.id_address = id_address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Integer getBuilding() {
        return building;
    }
    public void setBuilding(Integer building) {
        this.building = building;
    }
    @Override
    public String toString() {
        return "Address{" +
                "id_address=" + id_address +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                '}';
    }
}