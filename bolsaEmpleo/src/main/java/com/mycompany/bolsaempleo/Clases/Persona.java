package com.mycompany.bolsaempleo.Clases;


/**
 * Persona is an abstract class that contains the basic information of a person.
 * @author Santiago Baron Zuleta
 * Creation Date: 29/07/2022
 */

public abstract class Persona {
    
    // Declaring the variables that will be used in the class.
    public String name;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String age;
    public String idNumber;
    public String gender;
    public String profession;
    public String yearsOfExperience;
 
    /**
     * A constructor
     * @param name First element to save
     * @param lastName Second element to save
     * @param email Third elemento to save
     * @param phoneNumber Fourth element to save
     * @param age Fifth element to save
     * @param idNumber Sixth element to save
     * @param gender Seventh element to save
     */
    public Persona(String name, String lastName, String email, String phoneNumber,
                    String age, String idNumber, String gender){
    
        // Assigning the values of the parameters to the variables.
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.idNumber = idNumber;
        this.gender = gender;

        
    }
    
}
