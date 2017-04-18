package com.zykj.yi_xiu_g.activity.bean;

/**
 * Created by zykj on 2017/4/18.
 */

public class Bean {


    /**
     * id : 1
     * name : 苹果
     * pid : 0
     * type : 1
     */

    private int id;
    private String name;
    private String pid;
    private String type;

    @Override
    public String toString() {
        return "Bean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
