package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by tbxsx on 17-5-26.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
//            获得configure对象
            Configuration configuration = new Configuration();
//            使用configure对象载入hibernate的配置(不然哪里去找pojo的类和XXX.hbm.xml文件)
            configuration.configure("hibernate.cfg.xml");
//            服务注册
            ServiceRegistry serviceRegistry =
                    new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//            获得sessionFactory
//            接下来的所有session都使用这个工厂获得
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
