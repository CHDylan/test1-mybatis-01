package com.mybatis.pojo;

public class Person {
    /**
     *
     */
    private  Studnet  studnet ;


    @Override
    public String toString() {
        return "Person{" +
                "studnet=" + studnet +
                '}';
    }

    public Studnet getStudnet() {
        return studnet;
    }

    public void setStudnet(Studnet studnet) {
        this.studnet = studnet;
    }
}
