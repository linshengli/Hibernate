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
        Book book = new Book();
        book.setId(1l);
        book.setEmail("123");
        book.setUsername("Tbxsx");
        session.save(book);
        session.getTransaction().commit();
        System.out.println("Test!");
    }
}
