package ap.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "drivers")
public class BDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "number")
    private String number;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Date date;

    @Column(name = "type")
    private DriverType type;

    @OneToOne(cascade = CascadeType.ALL)
    private DriverImage idImage;


    public DriverImage getIdImage() {
        return idImage;
    }

    public void setIdImage(DriverImage idImage) {
        this.idImage = idImage;
    }

    public BDriver() {
    }


    public BDriver(String number, Date date, String description, DriverImage idImage, DriverType type) {
        this.number = number;
        this.date = date;
        this.description = description;
        this.idImage = idImage;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public DriverType getType() {
        return type;
    }


    public void setType(DriverType type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
