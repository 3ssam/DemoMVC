//package mo.essam.controllers;
//
//import mo.essam.DAO.StudentDAO;
//import mo.essam.models.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/student")
//public class StudentRestController {
//
//    @Autowired
//    private StudentDAO studentDAO;
//
//    @GetMapping("/{id}")
//    public Optional<Student> getStudentbyid(@PathVariable("id") int id){
//        return studentDAO.findById(id);
//    }
//
//    @GetMapping(path="",produces = {"application/xml"})
//    public List<Student> getStudents(){
//        return studentDAO.findAll();
//    }
//
//    @PostMapping(path = "")
//    public Student createStudent(@RequestBody Student student){
//        studentDAO.save(student);
//        return student;
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public String deleteStudent(@PathVariable("id") int id){
//        studentDAO.deleteById(id);
//        return "done";
//    }
//
//
//    @PutMapping(path = "")
//    public Student getStudents(@RequestBody Student student){
//        studentDAO.save(student);
//        return student;
//    }
//
//
//
//}
