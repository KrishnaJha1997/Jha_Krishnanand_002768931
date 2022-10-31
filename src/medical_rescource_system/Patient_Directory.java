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
public class Patient_Directory {
    
    private ArrayList<Patient_Details> pat_history;
    
    public Patient_Directory(){
        this.pat_history = new ArrayList<Patient_Details>();
        
    }

    public ArrayList<Patient_Details> getHistory() {
        return pat_history;
    }

    public void setHistory(ArrayList<Patient_Details> pat_history) {
        this.pat_history = pat_history;
    }
    
    public Patient_Details addNewDetails(){
        //Instantiate an object of Data Type EmployeeDetails
        Patient_Details newDetails = new Patient_Details(); 
        pat_history.add(newDetails);
        return newDetails;
       
    }

    public void deleteEmployeeDetails(Patient_Details pd) {
        pat_history.remove(pd);
        
    }
}

    

