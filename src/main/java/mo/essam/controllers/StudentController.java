package mo.essam.controllers;

import mo.essam.DAO.StudentDAO;
import mo.essam.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping("/addform")
    public ModelAndView studentForm(){
        ModelAndView view = new ModelAndView();
        view.setViewName("studentlogin");
        return view;
    }

    @RequestMapping("/add")
    public void addStudent(Student student){
        studentDAO.save(student);
    }

    @RequestMapping("/show")
    public ModelAndView getStudent(@RequestParam int id){
        ModelAndView view = new ModelAndView("home");
        Student student = studentDAO.findById(id).orElse(null);
        view.addObject("student",student);
        return view;
    }


    @RequestMapping("/delete")
    public ModelAndView deleteStudent(@RequestParam int id){
        String response;
        ModelAndView view = new ModelAndView("home");
        Student student = studentDAO.findById(id).orElse(null);
        if (student == null)
            response = "Error this id is not found";
        else {
            response = "we are delete this id = " + id;
            studentDAO.deleteById(id);
        }
        view.addObject("response", response);
        return view;
    }


    @RequestMapping("/update")
    public ModelAndView updateStudent(@RequestParam int id,Student student){
        ModelAndView view = new ModelAndView("home");
        Student Orignalstudent = studentDAO.findById(id).orElse(null);
        if (Orignalstudent == null)
           studentDAO.save(student);
        else {
            student.setId(id);
            studentDAO.save(student);
        }
        view.addObject("student", student);
        return view;
    }


    @RequestMapping("/showgeaterthen")
    public ModelAndView getStudentbyidGeaterthan(@RequestParam int id){
        ModelAndView view = new ModelAndView("home");
        List<Student> students = studentDAO.findByIdGreaterThan(id);
        System.out.println(students);
        return view;
    }

    @RequestMapping("/showname")
    public ModelAndView getStudentbyname(@RequestParam String name){
        ModelAndView view = new ModelAndView("home");
        List<Student> students = studentDAO.findByName(name);
        System.out.println(students);
        view.addObject("student",students);
        return view;
    }

    @RequestMapping("/showsorted")
    public ModelAndView getStudentSortedbyname(@RequestParam String name){
        ModelAndView view = new ModelAndView("home");
        List<Student> students = studentDAO.findByNameSorted(name);
        System.out.println(students);
        view.addObject("student",students);
        return view;
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public Optional<Student> getStudentbyid(@PathVariable("id") int id){
        return studentDAO.findById(id);
    }

    @RequestMapping("")
    @ResponseBody
    public List<Student> getStudents(){
        return studentDAO.findAll();
    }


}
