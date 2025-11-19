package api.lezione.__database.models;

public abstract class Person {
    protected int id;
    protected String firName;
    protected String lasName;

    public Person(){

    }

    public Person(String firName, String lasName) {
        super();
        this.firName = firName;
        this.lasName = lasName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirName() {
        return firName;
    }

    public void setFirName(String firName) {
        this.firName = firName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
}
