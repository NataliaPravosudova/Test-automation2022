package lab6;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
//    CREATE TABLE `attest`.`address` (
//            `id_address` INT NOT NULL AUTO_INCREMENT,
//    `city` VARCHAR(45) NULL,
//    `street` VARCHAR(45) NULL,
//    `building` INT NULL,
//    PRIMARY KEY (`id_address`));

    @Id
    private Long id_address;
    private String  city;
    private String street;
    private Integer building;

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
