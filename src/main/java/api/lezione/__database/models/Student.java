package api.lezione.__database.models;

import java.sql.Date;

public class Student extends Person{

    private String studNum;
    private Date dateBr;

    public Student()
    {
        super();
    }

    public Student(String firName, String lasName, String studNum, Date dateBr) {
        super(firName, lasName);
        this.studNum = studNum;
        this.dateBr = dateBr;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }

    public Date getDateBr() {
        return dateBr;
    }

    public void setDateBr(Date dateBr) {
        this.dateBr = dateBr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studNum='" + studNum + '\'' +
                ", dateBr=" + dateBr +
                ", lasName='" + lasName + '\'' +
                ", firName='" + firName + '\'' +
                '}';
    }
}
