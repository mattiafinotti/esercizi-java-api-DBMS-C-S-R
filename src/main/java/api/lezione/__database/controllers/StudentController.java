package api.lezione.__database.controllers;

import api.lezione.__database.models.Student;
import api.lezione.__database.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/students")

public class StudentController {
    @Autowired
    private StudentService serv;
    @GetMapping("list")
    public List<Student> studList(){
        return serv.studListService();
    }

}
