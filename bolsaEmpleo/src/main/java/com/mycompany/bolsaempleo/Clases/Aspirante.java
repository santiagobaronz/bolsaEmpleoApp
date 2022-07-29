package com.mycompany.bolsaempleo.Clases;

/**
 * Aspirante is a class that extends the class Persona and has the following attributes:
 * educationPlace, degree, startDateDegree, endDateDegree, lastCompany, startLastJob, endLastJob,
 * yearsOfExperience, positionLastJob, profession
 * @author Santiago Baron Zuleta
 * Creation Date: 29/07/2022
 */

public class Aspirante extends Persona{
    
    // Declaring the attributes of the class.
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
    
    /**
     * A constructor
     * @param name First element to save
     * @param lastName Second element to save
     * @param email Third elemento to save
     * @param phoneNumber Fourth element to save
     * @param age Fifth element to save
     * @param idNumber Sixth element to save
     * @param profession Seventh element to save
     * @param gender Eight element to save
     * @param educationPlace Nineth element to save
     * @param degree Tenth element to save
     * @param startDateDegree Eleventh element to save
     * @param endDateDegree Twelfth element to save
     * @param lastCompany Thirteenth element to save
     * @param startLastJob Fourteenth element to save
     * @param endLastJob Fiftteenth element to save
     * @param yearsOfExperience Sixteenth element to save
     * @param positionLastJob Seventeenth element to save
     */

    public Aspirante(String name, String lastName, String email, String phoneNumber,
                    String age, String idNumber,String profession, String gender, String educationPlace,
                    String degree, String startDateDegree, String endDateDegree,
                    String lastCompany, String startLastJob, String endLastJob,
                    String yearsOfExperience, String positionLastJob){
    
        // Calling the constructor of the superclass.
        super(name, lastName, email, phoneNumber, age, idNumber, gender);
        
        // Assigning the values of the parameters to the attributes of the class.
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
