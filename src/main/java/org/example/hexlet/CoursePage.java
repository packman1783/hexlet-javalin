package org.example.hexlet;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class CoursePage {
    private List<Course> courses;
    private String header;
}
