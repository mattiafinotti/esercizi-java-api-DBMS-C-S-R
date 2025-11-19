package api.lezione.__database.repositories;

import api.lezione.__database.models.Student;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IRepositoryWrite<Student>, IRepositoryRead<Student> {
    //Read methods
    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try{
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setPort(3306);
            ds.setUser("Mattia");
            ds.setPassword("root1999!");
            ds.setDatabaseName("lezione_api_1");
            ds.setUseSSL(false);
            ds.setAllowPublicKeyRetrieval(true);

            Connection conn = ds.getConnection();

            String query = "select studentID, firstName, lastName, studentNumber, dateOfBirth FROM STUDENT";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("studentID"));
                student.setFirName(rs.getString("firstName"));
                student.setLasName(rs.getString("lastName"));
                student.setStudNum(rs.getString("studentNumber"));
                student.setDateBr(rs.getDate("dateOfBirth"));

                students.add(student);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }

    @Override
    public boolean Insert(Student obj) {
        return false;
    }

    @Override
    public boolean Update(Student obj) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }
    //Rear Methods
    @Override
    public Student getById(int id) {
        return null;
    }


    public Student getByMatricola(String matricola) {
        //TODO Da specificare
        return null;
    }
}
