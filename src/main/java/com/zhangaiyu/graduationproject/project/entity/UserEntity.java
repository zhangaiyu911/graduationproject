package com.zhangaiyu.graduationproject.project.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long Id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
