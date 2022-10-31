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
public class PersonDirectory {
    
    private ArrayList<Person> personList;  

    public PersonDirectory(){
        this.personList = new ArrayList<Person>();
//        ArrayList<credentials> misEmpleados = new ArrayList<>();

        Person person = new Person();
        person.setUserName("sysAdmin");
        person.setPassword("sysAdmin");
        person.setId(1);
        person.setRole("System Admin");
        person.setEmail("sysAdmin@gmail.com");
        person.setGender("Male");
        personList.add(person);
        
        person = new Person();
        person.setUserName("Doctor");
        person.setPassword("Doctor");
        person.setId(2);
        person.setRole("Doctor");
        person.setEmail("Doctor@gmail.com");
        person.setGender("Female");
        personList.add(person);
        
        person = new Person();
        person.setUserName("hospAdmin");
        person.setPassword("hospAdmin");
        person.setId(3);
        person.setRole("hospAdmin");
        person.setEmail("hospAdmin@gmail.com");
        person.setGender("Male");
        personList.add(person);
        
        person = new Person();
        person.setUserName("commAdmin");
        person.setPassword("commAdmin");
        person.setId(4);
        person.setRole("Community Admin");
        person.setEmail("commAdmin@gmail.com");
        person.setGender("Male");
        personList.add(person);
         
    }
   
    
    public ArrayList<Person> getHistory() {
        return personList;
    }

    public void setHistory(ArrayList<Person> history) {
        this.personList = history;
    }
    
    public Person addNewDetails(){
        //Instantiate an object of Data Type EmployeeDetails
        Person newDetails = new Person(); 
        personList.add(newDetails);
        return newDetails;
       
    }

    public void deleteEmployeeDetails(Person ed) {
        personList.remove(ed);
        
    }
    
}
