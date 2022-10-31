/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medical_rescource_system;

import java.util.ArrayList;

/**
 *
 * @author Krishna
 */
public class Hospital_List {
    
    private ArrayList<Hospital> hosp_history;
    
    public Hospital_List(){
        this.hosp_history = new ArrayList<Hospital>();
        
    }

    public ArrayList<Hospital> getHistory() {
        return hosp_history;
    }

    public void setHistory(ArrayList<Hospital> hosp_history) {
        this.hosp_history = hosp_history;
    }
    
    public Hospital addNewDetails(){
        //Instantiate an object of Data Type EmployeeDetails
        Hospital newDetails = new Hospital(); 
        hosp_history.add(newDetails);
        return newDetails;
       
    }

    public void deleteEmployeeDetails(Hospital hp) {
        hosp_history.remove(hp);
        
    }
    
}
