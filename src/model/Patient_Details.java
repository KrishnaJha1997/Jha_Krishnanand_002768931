/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Guest User
 */
public class Patient_Details {
    String doc_name;
    String patient_name;
    String age;
    String syst_BP;
    String dyst_BP;
    String heartRate;
    String wt;
    String ht;

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String pass) {
        this.patient_name = pass;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSyst_BP() {
        return syst_BP;
    }

    public void setSyst_BP(String syst_BP) {
        this.syst_BP = syst_BP;
    }

    public String getDyst_BP() {
        return dyst_BP;
    }

    public void setDyst_BP(String dyst_BP) {
        this.dyst_BP = dyst_BP;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }
    @Override
    public String toString() {
        
        return String.valueOf(ht);
    }

        
    
}
