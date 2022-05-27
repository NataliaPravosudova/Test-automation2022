package lab7;
import org.hibernate.Session;
import task.day_7_8.model.RelatedStudent;

public class RelatedOneToManyMain {
    public static void main(String[] args) {
        Session session= RelatedHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        RelatedStudent student = session.find(RelatedStudent.class,1L);
        System.out.println("readStudent : "+ student);
        session.getTransaction().commit();
    }
}