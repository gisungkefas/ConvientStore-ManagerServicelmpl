package org.example.model;

public class Applicant extends Staff{

    String qualification;

    Integer yearsOfExperience;



    public String getQualification() {
        return qualification;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
