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
            Connection conn = ConnectionSingleton.getInstance().getConnection();

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
            conn.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }

    @Override
    public boolean Insert(Student obj) {
        boolean result = false;
        try{
            Connection conn = ConnectionSingleton.getInstance().getConnection();

            String query = "INSERT INTO Student (FirstName, LastName, StudentNumber, dateOfBirth) " +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, obj.getFirName());
            ps.setString(2, obj.getLasName());
            ps.setString(3, obj.getStudNum());
            ps.setDate(4, obj.getDateBr());

            int affectedRows = ps.executeUpdate();
            if(affectedRows > 0){
                return true;
            }



            conn.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
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
        Student student = null;
        try{
            Connection conn = ConnectionSingleton.getInstance().getConnection(); //Crea la connessione invocando il metodo e non INSTANZIANDO, perchè il costruttore singlenton è private

            String query = "select studentID, firstName, lastName, studentNumber, dateOfBirth " +
                    "FROM STUDENT WHERE studentID = ?"; // il simbolo "?" indica il parametro 1
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id); // 1 Indica il parametro 1 specificato dal simbolo ? di SQL
            ResultSet rs = ps.executeQuery();


            while(rs.next()){
                student = new Student();
                student.setId(rs.getInt("studentID"));
                student.setFirName(rs.getString("firstName"));
                student.setLasName(rs.getString("lastName"));
                student.setStudNum(rs.getString("studentNumber"));
                student.setDateBr(rs.getDate("dateOfBirth"));


            }
            conn.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return student;
    }


    public Student getByMatricola(String matricola) {
        //TODO Da specificare
        return null;
    }
}
