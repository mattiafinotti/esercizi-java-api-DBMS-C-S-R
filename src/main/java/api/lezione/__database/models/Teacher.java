package api.lezione.__database.models;

public class Teacher extends Person{
    private String teaSub;

    public Teacher()
    {
        super();
    }

    public Teacher(String firName, String lasName, String teaSub) {
        super(firName, lasName);
        this.teaSub = teaSub;
    }

    public String getTeaSub() {
        return teaSub;
    }

    public void setTeaSub(String teaSub) {
        this.teaSub = teaSub;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaSub='" + teaSub + '\'' +
                ", firName='" + firName + '\'' +
                ", lasName='" + lasName + '\'' +
                '}';
    }
}
