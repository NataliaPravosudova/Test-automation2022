package lab6;

import org.hibernate.Criteria;
import org.hibernate.Session;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HibernateMain {
    public static Object[][] main() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee user = new Employee();
        user.setName("NEW_USER");
        user.setJob("NEW_JOB");
        user.setRank("NEW_RANK");
        user.setAge(99);


        //CRUD

        //Create
        session.beginTransaction();
        Serializable id = session.save(user);
        session.getTransaction().commit();
        System.out.println("User " + user + " saved with id" + id);


        //READ
        session.beginTransaction();
        List<Employee> userList1 = session.createQuery("SELECT a FROM User a WHERE idUser = 1", Employee.class).getResultList();
        List<Employee> userList2 = session.createQuery("SELECT a FROM User a WHERE idUser = 2", Employee.class).getResultList();
        session.getTransaction().commit();

        session.close();
        Object[][] a = new Object[][]{
                {userList1.toString()},
                {userList2.toString()}
        };

        return a;
    }
}