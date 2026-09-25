import Connector.HibernateUtil;
import EntityClass.TestEntity;

public class Runner {
    static void main() {

        var session = HibernateUtil.getOpen();

        session.beginTransaction();

        var user = new TestEntity("johua","proba1", "postgres");
        session.persist(user);

        session.getTransaction().commit();
    }
}
