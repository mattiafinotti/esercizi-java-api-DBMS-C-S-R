package api.lezione.__database.services;

import api.lezione.__database.models.Student;
import api.lezione.__database.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> studListService(){
        return repo.getAll();
    }

    public Student getStudentDetailService(int varId){
        return repo.getById(varId);
    }

    public boolean studInsertService(Student student){
        return repo.Insert(student);
    }

    public boolean studUpdateService(Student student){
        return repo.Update(student);
    }

    public boolean studDeliteService(int varId){
        return repo.Delete(varId);
    }
}

