/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author Rumeysa
 */
public class Sponsor{

    private String CompanyName;
    private String WorkingArea;
    private String Email;
    private String password;

    public Sponsor(String CompanyName, String WorkingArea, String Email, String password) {
        this.CompanyName=CompanyName;
        this.WorkingArea=WorkingArea;
        this.Email=Email;
        this.password=password;

    }
      public Sponsor() {
   

    }



    public String getCompanyName() {
        return CompanyName;
    }

    /**
     * @param CompanyName the CompanyName to set
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * @return the WorkingArea
     */
    public String getWorkingArea() {
        return WorkingArea;
    }

    /**
     * @param WorkingArea the WorkingArea to set
     */
    public void setWorkingArea(String WorkingArea) {
        this.WorkingArea = WorkingArea;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
