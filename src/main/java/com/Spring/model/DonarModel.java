package com.Spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donors")
public class DonarModel {

    @Id
    private Integer number;

    private String name;
    private int age;
    private String bloodgroup;
    private String email;
    private String phone;
    private String location;

    // Getters and Setters
    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getBloodgroup() { return bloodgroup; }
    public void setBloodgroup(String bloodgroup) { this.bloodgroup = bloodgroup; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
