/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolsaempleo.Clases;

/**
 *
 * @author santi
 */
public class Aspirante extends Persona{
    
    public String educationPlace;
    public String degree;
    public String startDateDegree;
    public String endDateDegree;
    
    public String lastCompany;
    public String startLastJob;
    public String endLastJob;
    public String yearsOfExperience;
    public String positionLastJob;
    public String profession;
    
    public Aspirante(String name, String lastName, String email, String phoneNumber,
                    String age, String idNumber,String profession, String gender, String educationPlace,
                    String degree, String startDateDegree, String endDateDegree,
                    String lastCompany, String startLastJob, String endLastJob,
                    String yearsOfExperience, String positionLastJob){
    
        super(name, lastName, email, phoneNumber, age, idNumber, gender);
        
        this.positionLastJob = positionLastJob;
        this.profession = profession;
        this.yearsOfExperience = yearsOfExperience;
        this.educationPlace = educationPlace;
        this.degree = degree;
        this.startDateDegree = startDateDegree;
        this.endDateDegree = endDateDegree;
        
        this.lastCompany = lastCompany;
        this.startLastJob = startLastJob;
        this.endLastJob = endLastJob;
    
    }
    
    
}
