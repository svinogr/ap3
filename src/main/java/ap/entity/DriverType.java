package ap.entity;



public enum DriverType {
    BZPOV("без поворотников"),OBOCH("обочечники"),PARK("парковщики");
    private String type;

    DriverType(String type) {
        this.type = type;
    }


    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
