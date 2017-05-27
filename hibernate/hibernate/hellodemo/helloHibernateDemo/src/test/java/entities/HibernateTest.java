package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tbxsx on 17-5-26.
 */
public class HibernateTest {

    @Before
    public void init() {

    }

    @After
    public void destroy() {

    }

    @Test
    public void testUtil() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = new User();
        user.setEmail("123");
        user.setUsername("Tbxsx");
        session.save(user);
        session.getTransaction().commit();
        System.out.println("Test!");
    }
}
