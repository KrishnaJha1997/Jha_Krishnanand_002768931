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
      
    
}
