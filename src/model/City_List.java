/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Guest User
 */
public class City_List {
    
    private ArrayList<City> city_history;
    
    public City_List(){
        this.city_history = new ArrayList<City>();
        
    }

    public ArrayList<City> getHistory() {
        return city_history;
    }

    public void setHistory(ArrayList<City> city_history) {
        this.city_history = city_history;
    }
    
    public City addNewDetails(){
        //Instantiate an object of Data Type EmployeeDetails
        City newDetails = new City(city); 
        city_history.add(newDetails);
        return newDetails;
       
    }

    public void deleteEmployeeDetails(City pd) {
        city_history.remove(pd);
        
    }
    
    
    
    
    
}
