package com.choisroyalfamily.massivcode.jsonexam;

import com.google.gson.annotations.SerializedName;

/**
 * Created by massivcode@gmail.com on 2017. 3. 11. 10:22
 */

public class Family {
    @SerializedName("#")
    private int count;

    @SerializedName("아버지")
    private String fatherName;

    @SerializedName("어머니")
    private String motherName;

    public Family(int count, String fatherName, String motherName) {
        this.count = count;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SubModel{");
        sb.append("count=").append(count);
        sb.append(", fatherName='").append(fatherName).append('\'');
        sb.append(", motherName='").append(motherName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
