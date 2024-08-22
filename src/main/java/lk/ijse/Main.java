package lk.ijse;

import lk.ijse.Config.SessionFactoryConfiguration;
import lk.ijse.Entity.Student;
import lk.ijse.embeded.StudentName;
import lk.ijse.repository.StudentRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {


    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
      Student student = new Student();
       student.setAddress("Matugama");
       StudentName studentName = new StudentName("Sachini","Poornima");
       student.setName(studentName);
        Integer id = studentRepository.saveStudent(student);
      System.out.println(id);

//          Student student = studentRepository.getStudent(1);
//          System.out.println(student.toString());
//
//          student.setAddress("panadura");
//          studentRepository.updateStudent(student);
//
//          studentRepository.deleteStudent(student);
//


    }
}