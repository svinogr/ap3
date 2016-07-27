package ap.entity;

public class Search {

    public Search() {
    }
    private String number;

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Search{" +
                "number='" + number + '\'' +
                '}';
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
