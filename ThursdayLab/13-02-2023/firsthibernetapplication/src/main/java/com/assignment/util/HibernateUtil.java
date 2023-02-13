package com.assignment.util;

//import java.lang.module.Configuration;
import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import com.assignment.model.Student;
import com.mysql.cj.xdevapi.SessionFactory;



public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(AvailableSettings.URL, "jdbc:mysql://localhost:3306/collectiondb?useSSL=false");
                settings.put(AvailableSettings.USER, "root");
                settings.put(AvailableSettings.PASS, "Poonam@123");
                settings.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(AvailableSettings.SHOW_SQL, "true");

                settings.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(AvailableSettings.HBM2DDL_AUTO, "create-drop");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Student.class);

                StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                sessionFactory = (SessionFactory) configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}