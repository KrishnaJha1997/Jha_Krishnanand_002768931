package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krishna
 */
public class Patient{
    
    int patientid;
    String doctorname;
    String wellness;
    Person p;
    VitalSigns vs;
    EncounterHistory encounter;

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }
    
    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
    
    private ArrayList<VitalSigns> vitalsigns;

    
    
    public Patient(int patientid, String doctorname,VitalSigns vitalsigns,Person p) {
        this.patientid = patientid;
        this.doctorname = doctorname;
        this.vitalsigns = new ArrayList<>();
        this.vs = vitalsigns;
        addVitalSigns(vitalsigns);        
        this.p = p;
    }
  
   

    
    
    public ArrayList<VitalSigns> getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(ArrayList<VitalSigns> vitalsigns) {
        this.vitalsigns = vitalsigns;
    }

    
    public void addVitalSigns(VitalSigns vs){
        vitalsigns.add(vs);
        
    }
    
    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getWellness() {
        return wellness;
    }

    public void setWellness(String wellness) {
        this.wellness = wellness;
    }
  
    
     public String getgroupAge(double age) {
            String groupAge;
            if (age<1){
                groupAge= "New Born";
            } else if ( age >= 1 && age < 3) {
                groupAge = " Infant";
            } else if (age>=3 &&  age <= 6){
                groupAge = "Toddler";
            } else if (age >= 6 && age <= 10)  {
                groupAge = " PreSchooler";
            } else if (age >= 11 && age <= 16){
                groupAge= " School Age";
            } else if ( age >= 16){
                groupAge= " Adolescent";
            } else {
                groupAge = "Invaild age";
                
            }
            return groupAge;
        }   
    
         public boolean isThisVitalSignNormal(String vitalsigns,VitalSigns vs) {
       
        
        Double age = getP().getAge();
        String definedAge= getgroupAge(age);
        
    if (vitalsigns.equals("Respiratory rate")) {
        if (definedAge == "New Born"){
            if (vs.getRespiratoryRate() >= 10 && vs.getRespiratoryRate() <= 20) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
        }
    } else if (definedAge == "Infant"){
    
        if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
    } else if (definedAge=="Toddler"){
        
         if (vs.getRespiratoryRate() >= 30 && vs.getRespiratoryRate() <= 40) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
    } else if (definedAge=="PreSchooler"){
        
        if (vs.getRespiratoryRate() >= 40 && vs.getRespiratoryRate() <= 50) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
    }  else if (definedAge== "School Age"){
        
        if (vs.getRespiratoryRate() >= 50 && vs.getRespiratoryRate() <= 60) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
    }   else if(definedAge== "Adolescent"){
                    if (vs.getRespiratoryRate() >= 60 && vs.getRespiratoryRate() <= 70) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
            
                   
    }
    }else if (vitalsigns.equals("Blood Pressure")) {

            
        if (definedAge== "New Born"){
            if (vs.getBloodPressure() >= 40 && vs.getBloodPressure() <= 60) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        }  else if (definedAge== "Infant"){
                
                
                    if (vs.getBloodPressure() >= 60 && vs.getBloodPressure() <= 80) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        }  else if (definedAge=="Toddler"){
                    if (vs.getBloodPressure() >= 80 && vs.getBloodPressure() <= 100) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        }  else if (definedAge=="Pre Schooler"){
                    if (vs.getBloodPressure() >= 100 && vs.getBloodPressure() <= 120) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        } else if (definedAge== "School Age"){
                    if (vs.getBloodPressure() >= 120 && vs.getBloodPressure() <= 130) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        } else if (definedAge== "Adolescent"){
                    if (vs.getBloodPressure() >= 130 && vs.getBloodPressure() <= 140) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
            }

        }
    else if (vitalsigns.equals("Heart Rate")) {

            if (definedAge=="New Born"){
                
                    if (vs.getHeartRate() >= 20 && vs.getHeartRate() <= 30) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        } else if (definedAge== "Infant"){
                    if (vs.getHeartRate() >= 30 && vs.getHeartRate() <= 40) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        } else if (definedAge== "Toddler"){
                    if (vs.getHeartRate() >= 40 && vs.getHeartRate() <= 50) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        }else if(definedAge== "Pre Schooler"){
                    if (vs.getHeartRate() >= 50 && vs.getHeartRate() <= 60) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
        } else if (definedAge=="School Age"){
                    if (vs.getHeartRate() >= 60 && vs.getHeartRate() <= 70) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
    }     else if (definedAge== "Adolescent"){
                    if (vs.getHeartRate() >= 70 && vs.getHeartRate() <= 80) {
                        setWellness("Normal");
                        return true;
                    } else {
                        setWellness("Abnormal");
                        return false;
                    }
            }
    }
     else {

            return false;                       
        }
        
return false;
        
        
        
    }    
    
}
