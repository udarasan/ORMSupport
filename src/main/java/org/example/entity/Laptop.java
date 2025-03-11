package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String name;
    @ManyToMany(mappedBy = "laptops")
    private List<Student>students;

    public Laptop() {}

    public Laptop(int lid, String name, List<Student> students) {
        this.lid = lid;
        this.name = name;
        this.students = students;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
