/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmltableview;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author koma
 */
public class Person {
    
    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty email = new SimpleStringProperty("");
    
    public Person(){
        this("","","");
    }
    
    public Person(String firstName, String lastName, String email){
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }
    
    public void setFirstName(String fName){
        this.firstName.set(fName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
    
    public String getFirstName(){
        return firstName.get();
    }
    
    public String getLastName(){
        return lastName.get();
    }
        
    public String getEmail(){
        return email.get();
    }
    
    public String getPrimary(){
        return email.get();
    }
        
    public String getSecondary(){
        return email.get();
    }
    
    
}
