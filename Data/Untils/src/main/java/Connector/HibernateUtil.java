package Connector;

import EntityClass.Units;
import EntityClass.Weapons_Grenade;
import EntityClass.Weapons_Machinegun;
import EntityClass.Weapons_RPG;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class HibernateUtil {

    static public Session getOpen()
    {Configuration conf = new Configuration();
       var session = conf.configure();
        var pt = session.buildSessionFactory();

        return pt.openSession();
    }
    static public Session getOpen2()
    {Configuration conf = new Configuration();
        conf
                .addAnnotatedClass(Units.class)
                .addAnnotatedClass(Weapons_RPG.class)
                .addAnnotatedClass(Weapons_Machinegun.class)
                .addAnnotatedClass(Weapons_Grenade.class)
                .setProperty("hibernate.connection.driver_class","org.postgresql.Driver")
                .setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5435/postgres")
                .setProperty("hibernate.connection.username","postgres")
                .setProperty("hibernate.connection.password","123")
                .setProperty("hibernate.hbm2ddl.auto","update")
                .setProperty("hibernate.show_sql","true");


        var session = conf.configure();
        var pt = session.buildSessionFactory();

        return pt.openSession();
    }
    @Bean
     public Session getOpen3()
    {Configuration conf = new Configuration();
        conf
                .addAnnotatedClass(Units.class)
                .addAnnotatedClass(Weapons_RPG.class)
                .addAnnotatedClass(Weapons_Machinegun.class)
                .addAnnotatedClass(Weapons_Grenade.class)
                .setProperty("hibernate.connection.driver_class","org.postgresql.Driver")
                .setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5435/postgres")
                .setProperty("hibernate.connection.username","postgres")
                .setProperty("hibernate.connection.password","123")
                .setProperty("hibernate.hbm2ddl.auto","update")
                .setProperty("hibernate.show_sql","true");


        var session = conf.configure();
        var pt = session.buildSessionFactory();

        return pt.openSession();
    }



}
