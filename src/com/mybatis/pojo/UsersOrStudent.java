package com.mybatis.pojo;

public class UsersOrStudent {
    
    /**
     *
     */
    private  Integer ids;

    /**
     *
     */
    private  String names;

    /**
     *
     */
    private float  monerys ;

    @Override
    public String toString() {
        return "UsersOrStudent{" +
                "ids=" + ids +
                ", names='" + names + '\'' +
                ", monerys=" + monerys +
                '}';
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public float getMonerys() {
        return monerys;
    }

    public void setMonerys(float monerys) {
        this.monerys = monerys;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }
}
