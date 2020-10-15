package ru.startsev.model;

public class Person {
    private String lastName;
    private String firstName;
    private String role;

    public Person(String lastName, String firstName, String role) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.role = role;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
