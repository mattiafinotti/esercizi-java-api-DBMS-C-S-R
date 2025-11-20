package api.lezione.__database.controllers;

import api.lezione.__database.models.Student;
import api.lezione.__database.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")

public class StudentController {
    @Autowired
    private StudentService serv;

    @GetMapping
    public List<Student> studList(){
        return serv.studListService();
    }
    @GetMapping("{varId}")
    public ResponseEntity getStudentById(@PathVariable int varId){
        Student resu = serv.getStudentDetailService(varId);
        if(resu == null){
            return ResponseEntity.notFound().build();
        }
        else
            return ResponseEntity.ok(resu);
    }

    @PostMapping("insert")
    public ResponseEntity addStudent(@RequestBody Student student){
        boolean insertResult = serv.studInsertService(student);
        if(insertResult) {
            return ResponseEntity.ok().build();
        }
            else
                return ResponseEntity.unprocessableEntity().build();
        }
    } //ResponseEntity permette di gestire il corpo della risposta e il codice di status



