package apicareer.app.controllers;

import apicareer.app.models.Student;
import apicareer.app.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @Autowired
    StudentRepository studentRepository;

@RequestMapping("/")
    public String index(){
    return "index";
}
    @GetMapping("/studentform")
    public String studentform(Model model)
    {
        model.addAttribute("student", new Student());
        return "studentform";
    }

    @PostMapping("/studentform")
    public String displayform(@Valid @ModelAttribute("student")Student student, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "studentform";
        }else {
            studentRepository.save(student);
            return"printform";
        }
    }

}
