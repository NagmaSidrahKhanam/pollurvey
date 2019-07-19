package com.spring.stackroute;

public class Student {
    public String name;
    public int id;



    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;   //setter injection
    }

    public void Student()
    {
        this.id=id;
        this.name=name;
        System.out.println("name   : "+name);
        System.out.println("id      :   "+id);

    }
    public void print()
    {
        System.out.println(name);
        System.out.println(id);
    }

    public void display()
    {
        System.out.println(name);
        System.out.println(id);
    }
}
