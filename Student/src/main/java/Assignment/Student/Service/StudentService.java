package Assignment.Student.Service;


import Assignment.Student.Entity.Student;
import Assignment.Student.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studnetRepo;

    public void save(Student student) {
        studnetRepo.save(student);
    }

    public void setSession(HttpSession httpSession, Principal principal) {

        List<Student> ops = studnetRepo.findAllByUsername(principal.getName());

        if(!ops.isEmpty()){
            httpSession.setAttribute("email" , ops.get(0).getEmail() );
        } else {
            System.out.println("System Error");
        }
    }
}
