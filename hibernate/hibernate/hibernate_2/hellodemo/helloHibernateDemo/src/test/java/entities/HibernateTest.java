package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.HibernateUtil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

    @Test
    public void testSet() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = new User();
        Phone phone = new Phone();
        phone.setPhone("15821859797");
        phone.setUser(user);
        user.setUsername("lls");
        user.setEmail("email@qq.com");
        Set<String> phoneSet = new HashSet<String>();
        phoneSet.add(phone.getPhone());
        user.setPhoneSet(phoneSet);
        session.save(user);
        session.getTransaction().commit();
        System.out.println("Test!");
    }

    @Test
    public void testManyToMany() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = new User();
        User user1 = new User();
        user.setEmail("email0@qq.com");
        user.setUsername("name0");
        user1.setEmail("email1@qq.com");
        user1.setUsername("name1");


        Address address = new Address();
        Address address1 = new Address();
        address.setName("address0");
        address1.setName("address1");


        Set<Address> addressSet = new HashSet<Address>();
        addressSet.add(address);

        Set<Address> addressSet1 = new HashSet<Address>();
        addressSet1.add(address);
        addressSet1.add(address1);

        user.setAddressSet(addressSet);
        user1.setAddressSet(addressSet1);

        session.save(user);
        session.save(user1);
        session.save(address);
        session.save(address1);

        User user2 = session.get(User.class,2l);
        System.out.println(user2.getEmail());
        System.out.println(user2.getAddressSet().size());
        Set<Address> set1 = user2.getAddressSet();
        Iterator<Address> iterator  = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        session.getTransaction().commit();
        System.out.println("Test!");
    }


    @Test
    public void testOneToOne(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Husband husband = new Husband();
        husband.setName("husband1");

        Wife wife = new Wife();
        wife.setName("wife1");

        husband.setWife(wife);
        wife.setHusband(husband);
        session.save(new Husband());
        session.save(wife);

        session.getTransaction().commit();
        System.out.println("Test!");
    }
}
