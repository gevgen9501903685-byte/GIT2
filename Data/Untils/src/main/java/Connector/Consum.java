package Connector;

import EntityClass.Units;
import lombok.Cleanup;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class Consum {

    private Session session = HibernateUtil.getOpen2();

    public void transactionGet(Consumer<Session> action) {

        session.beginTransaction();

        action.accept(session);

        session.getTransaction().commit();
        session.close();

    }
}
