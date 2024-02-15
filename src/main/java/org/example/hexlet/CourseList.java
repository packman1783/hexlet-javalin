package org.example.hexlet;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    public static List<Course> CreatedList() {
        List<Course> courses = new ArrayList<>();

        courses.add(new Course(1, "Introduction", "Learn Java language"));
        courses.add(new Course(2, "Web Development", "Explore web development"));
        courses.add(new Course(3, "Data Algorithms", "Algorithms and structures"));

        return courses;
    }
}
