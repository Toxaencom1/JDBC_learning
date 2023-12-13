package com.taxah;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class Db {
    private static final String URL = "jdbc:mysql://localhost:8086";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void con() {
        Connector connector = new Connector();
        try (Session session = connector.getSession()){


//            Delete all from table =============================================
            Transaction t = session.beginTransaction();
            List<Magic> magics = session.createQuery("from Magic ", Magic.class).getResultList();
            magics.forEach(session::delete);
            t.commit();


//    //Update ========================================================
//            String hql = "from Magic where id = :id";
//            Query<Magic> query = session.createQuery(hql, Magic.class);
//            query.setParameter("id", 4);
//            Magic magic = query.getSingleResult();
//            System.out.println(magic);
//            magic.setDamage(100);
//            magic.setName("Rage");
//            session.beginTransaction();
//            session.update(magic);
//            session.getTransaction().commit();

//            List<Magic> books = session.createQuery("FROM Magic",Magic.class).getResultList();
//            books.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    //Add to table =======================================================
//        Magic magic = new Magic("Magic arrow", 10, 0,0);
//        session.beginTransaction();
//        session.save(magic);
//        magic = new Magic("Lightning",25,0,0); session.save(magic);
//        magic = new Magic("Stone Skin",0,0,6); session.save(magic);
//        magic = new Magic("Blood lust",0,6,0); session.save(magic);
//        magic = new Magic("Bane",0,-3,0); session.save(magic);
//        magic = new Magic("Healing",-30,0,0); session.save(magic); session.getTransaction().commit();
//        session.close();


//        ===========================================================
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure()
//                .build();
//        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Magic magic = new Magic("Fairy arrow",10,1,1);
//        session.beginTransaction();
//        session.save(magic);
//        session.getTransaction().commit();
//        session.close();
//============================================================
//        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
//            Statement statement = con.createStatement();
//            statement.execute("DROP SCHEMA IF EXISTS test");
//            statement.execute("CREATE SCHEMA IF NOT EXISTS test");
//            statement.execute("CREATE TABLE IF NOT EXISTS test.table (" +
//                    "id INT NOT NULL," +
//                    "firstname VARCHAR(45) NULL, " +
//                    "lastname VARCHAR(45) NULL," +
//                    "PRIMARY KEY (id));");
//            statement.execute("INSERT INTO  test.table (id,firstname,lastname)" +
//                    "VALUES (1,'Иван','Иванов')");
//            statement.execute("INSERT INTO  test.table (id,firstname,lastname)" +
//                    "VALUES (2,'Петр','Петров')");
//            ResultSet set = statement.executeQuery("SELECT * FROM test.table;");
//            while (set.next()) {
//                System.out.println(set.getString(3) + " " + set.getString(2) + " " + set.getInt(1));
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

    }

}
