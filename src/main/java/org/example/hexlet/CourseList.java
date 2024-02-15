package org.example.hexlet;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    public static List<Course> createSampleCourseList() {
        List<Course> courses = new ArrayList<>();

        courses.add(new Course(1, "Introduction to", "Learn the basics of Java programming language"));
        courses.add(new Course(2, "Web Development Fundamentals", "Explore the essentials of web development"));
        courses.add(new Course(3, "Data Structures and Algorithms", "Master algorithms and data structures"));

        return courses;
    }
}
