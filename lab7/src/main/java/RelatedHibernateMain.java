package lab7;
import org.hibernate.Session;
import task.day_7_8.model.RelatedStudent;

public class RelatedHibernateMain {
    public static void main(String[] args) {
        Session session= RelatedHibernateUtil.getSessionFactory().openSession();

        //Create
        Long studentId=2L;
        Long id=2L;

        session.beginTransaction();
        RelatedStudent student = session.find(RelatedStudent.class,studentId);
        System.out.println("readStudent : "+ student);
        session.getTransaction().commit();

    }
}