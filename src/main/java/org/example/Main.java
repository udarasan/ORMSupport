package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Laptop;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Laptop laptop=new Laptop();
        laptop.setLid(2);
        laptop.setName("Hp");

        Student student=new Student();
        student.setId(2);
        student.setName("Vidura");
        student.setAddress("Colombo");
        student.setLaptop(laptop);

        session.persist(student);
        session.persist(laptop);

        transaction.commit();
        session.close();

    }
}