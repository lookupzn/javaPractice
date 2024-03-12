package com.collection_.set_;

import java.util.Objects;

public class HashSet01 {
    public static void main(String[] args) {
        Stu s1 = new Stu("Windy",12);
        Stu s2 = new Stu("Windy",12);

        System.out.println(s1.hashCode());//-1703883620
        System.out.println(s2.hashCode());//-1703883620
    }
}

class Stu{
    private String name;
    private int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stu stu = (Stu) o;
        return age == stu.age &&
                Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
