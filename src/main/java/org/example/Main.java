package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        /*Student student = new Student();
        student.setId(2);
        student.setName("John2");
        student.setAddress("Colombo2");*/
        //session.save(student);
        //session.update(student);
        //Student student=session.get(Student.class,1);
        //System.out.println(student.getName());
        //session.delete(student);


        transaction.commit();
        session.close();

    }
}