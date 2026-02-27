package Aggregation;

import java.util.List;

public class Department {
    public String name;
    public List<Teacher> teachers;

    public Department(String name, List<Teacher> teachers){
        this.name = name;
        this.teachers = teachers;
    }
}
