/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author Rumeysa
 */
public class Entrepreneur {
 
    private String UserName;
    private String WorkingArea;
    private String Email;
    private String password;

    public Entrepreneur(String UserName, String WorkingArea, String Email, String password) {
            this.UserName=UserName;
            this.Email=Email;
            this.WorkingArea=WorkingArea;
            this.password=password;

    }
    
   public Entrepreneur() {
    

    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
 /****/
