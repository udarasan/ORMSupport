package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Laptop;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Laptop laptop1=new Laptop();
        laptop1.setLid(1);
        laptop1.setName("Dell");

        Laptop laptop2=new Laptop();
        laptop2.setLid(2);
        laptop2.setName("Hp");

        Student student1=new Student();
        student1.setId(1);
        student1.setName("Udara");
        student1.setAddress("colombo");

        Student student2=new Student();
        student2.setId(2);
        student2.setName("Manuth");
        student2.setAddress("Galle");

        List<Laptop> laptopList=new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);

        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        laptop1.setStudents(studentList);
        laptop2.setStudents(studentList);
        student1.setLaptops(laptopList);
        student2.setLaptops(laptopList);

        session.save(laptop1);
        session.save(laptop2);
        session.save(student1);
        session.save(student2);

        transaction.commit();
        session.close();

    }
}