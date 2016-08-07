package ap.entity;

import javax.persistence.*;

@Entity
public class DriverImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "link")
    String link;

    @Column(name = "image")
    private byte[] imageByte;

    public DriverImage(BDriver bDriver, String link, byte[] imageByte) {
        this.link = link;
        this.imageByte = imageByte;
    }

    public DriverImage() {
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImageByte() {
        return imageByte;
    }

    public void setImageByte(byte[] imageByte) {
        this.imageByte = imageByte;
    }
}
