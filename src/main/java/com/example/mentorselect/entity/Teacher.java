package com.example.mentorselect.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    private int id;
    private String name;
    private int snum;
    private int scope;
    @OneToMany(mappedBy = "teacher")
    private List<Student> student;
}
