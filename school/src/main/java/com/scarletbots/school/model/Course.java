package com.scarletbots.school.model;

import java.util.List;

public class Course {

    private String id;
    private String name;
    private String description;
    private List<String> steps;

    public Course() {
        // Needed by Caused by: com.fasterxml.jackson.databind.JsonMappingException: no suitable constructor found
    }

    public Course(String id, String name, String description, List<String> steps) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.steps = steps;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public List<String> getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return String.format(
                "Course [id=%s, name=%s, description=%s, steps=%s]", id, name,
                description, steps);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (id == null) {
            return other.id == null;
        } else {
            return id.equals(other.id);
        }
    }


}