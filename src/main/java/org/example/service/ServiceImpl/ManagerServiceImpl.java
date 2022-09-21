package org.example.service.ServiceImpl;


import org.example.model.Applicant;
import org.example.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {


    @Override
    public String hire(Applicant applicant) {

    if(applicant.getQualification().equals("2.2")){
        return "Dear"+ " " +applicant.getFirstName()+" "+ "You have not meet the minimum requirement for this position";
    }

    if(applicant.getYearsOfExperience() < 5){
        return "Dear"+" "+applicant.getFirstName()+" "+ "You have not meet the minimum requirement for this position";
    }
    return "Congratulation You have qualified for the first round of our recruitment process somebody will contact your for the next stage";

    }


}
