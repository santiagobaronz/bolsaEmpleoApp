/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolsaempleo.Clases;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public abstract class Persona {
    
    public String name;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String age;
    public String idNumber;
    public String gender;
    public String profession;
    public String yearsOfExperience;
 
    
    public Persona(String name, String lastName, String email, String phoneNumber,
                    String age, String idNumber, String gender){
    
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.idNumber = idNumber;
        this.gender = gender;

        
    }
    
}
