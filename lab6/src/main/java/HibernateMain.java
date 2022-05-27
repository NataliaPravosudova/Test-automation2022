package lab6;
import org.hibernate.Session;
import java.io.Serializable;
import java.util.Date;

public class HibernateMain {
    public static void main(String[] args) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Student student=new Student();
        student.setName("Vasja 4");
        student.setBd(new Date());
        student.setSize("XL");
        student.setId_student(4L);
        session.beginTransaction();
        Serializable id=session.save(student);
        session.getTransaction().commit();

        System.out.println("object "+ student+ " saved with id = "+id);

        session.beginTransaction();
        Student readStudent = session.find(Student.class,id);
        System.out.println("readStudent : "+ readStudent);
        session.getTransaction().commit();

        session.close();
    }

}