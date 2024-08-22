package lk.ijse.repository;

import lk.ijse.Config.SessionFactoryConfiguration;
import lk.ijse.Entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public Integer saveStudent(Student student){
        Transaction transaction = session.beginTransaction();

        try {
            Integer id = (Integer) session.save(student);
            transaction.commit();
            return id;
        }catch (Exception e){
            transaction.rollback();
            return -1;
        }

    }
    public Student getStudent(Integer id){
        Student student = session.get(Student.class , id);
        return student;
    }

    public void updateStudent(Student student){

        Transaction transaction = session.beginTransaction();
        try {
            session.update(student);
            transaction.commit();

        }catch (Exception e){
            transaction.rollback();

        }

    }


    public void deleteStudent(Student student){

        Transaction transaction = session.beginTransaction();
        try {
            session.delete(student);
            transaction.commit();

        }catch (Exception e){
            transaction.rollback();

        }

    }
}
