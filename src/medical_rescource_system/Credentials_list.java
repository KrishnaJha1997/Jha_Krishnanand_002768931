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
public class Credentials_list {
    

    private ArrayList<credentials> history;  

    public Credentials_list(){
        this.history = new ArrayList<credentials>();
//        ArrayList<credentials> misEmpleados = new ArrayList<>();
        
    }
   
    
    public ArrayList<credentials> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<credentials> history) {
        this.history = history;
    }
    
    public credentials addNewDetails(){
        //Instantiate an object of Data Type EmployeeDetails
        credentials newDetails = new credentials(); 
        history.add(newDetails);
        return newDetails;
       
    }

    public void deleteEmployeeDetails(credentials ed) {
        history.remove(ed);
        
    }
}
