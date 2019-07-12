package com.stackroute;

public class Actor {

    // Declaration
    private String name,gender;
    private int age;

    public Actor(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Actor()
    {

    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}