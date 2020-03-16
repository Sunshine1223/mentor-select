package com.example.mentorselect.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class CourseSelect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    private int score;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Student student;

}
