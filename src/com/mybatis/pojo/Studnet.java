package com.mybatis.pojo;


import java.io.BufferedInputStream;
import java.io.File;
import java.util.ArrayList;

public class Studnet {



    private  Integer id;

    private  String name;

    /**
     *
     */
    private  Float   monery;

    private ArrayList arryaylist;

    public ArrayList getArryaylist() {


        return arryaylist;
    }

    public void setArryaylist(ArrayList arryaylist) {
        this.arryaylist = arryaylist;
    }



    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monery=" + monery +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMonery() {
        return monery;
    }

    public void setMonery(Float monery) {
        this.monery = monery;
    }
}
