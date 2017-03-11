package com.choisroyalfamily.massivcode.jsonexam;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by massivcode@gmail.com on 2017. 3. 11. 10:20
 */

public class Model {
    @SerializedName("이름")
    private String name;

    @SerializedName("나이")
    private int age;

    @SerializedName("성별")
    private String gender;

    @SerializedName("주소")
    private String address;

    @SerializedName("특기")
    private List<String> talents;

    @SerializedName("가족관계")
    private Family family;

    @SerializedName("회사")
    private String company;


    public Model() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getTalents() {
        return talents;
    }

    public void setTalents(List<String> talents) {
        this.talents = talents;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Model{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", talents=").append(talents);
        sb.append(", family=").append(family);
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
