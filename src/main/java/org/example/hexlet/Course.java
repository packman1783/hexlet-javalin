
package org.example.hexlet;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class Course {

    @ToString.Include
    private String name;
    private String description;
    private  int id;

    public Course(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
