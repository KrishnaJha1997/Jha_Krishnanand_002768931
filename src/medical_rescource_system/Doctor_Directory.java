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
public class Doctor_Directory {
    
    private ArrayList<Doctor> doc_history;
    
    public Doctor_Directory(){
        this.doc_history = new ArrayList<Doctor>();
        
    }

    public ArrayList<Doctor> getHistory() {
        return doc_history;
    }

    public void setHistory(ArrayList<Doctor> doc_history) {
        this.doc_history = doc_history;
    }
    
    public Doctor addNewDetails(){
        //Instantiate an object of Data Type EmployeeDetails
        Doctor newDetails = new Doctor(); 
        doc_history.add(newDetails);
        return newDetails;
       
    }

    
    public void deleteDoctors(Doctor doc) {
        doc_history.remove(doc);
        
    }
    
  
    
}
