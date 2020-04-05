package com.st.studytour.stmember.entity;

public class MemberInformationEntityWithBLOBs extends MemberInformationEntity {
    private String unitAddress;

    private String hobby;

    private String aphorism;

    private String ext;

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress == null ? null : unitAddress.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getAphorism() {
        return aphorism;
    }

    public void setAphorism(String aphorism) {
        this.aphorism = aphorism == null ? null : aphorism.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}