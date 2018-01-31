/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NewUser;

import Business.Trainer.Trainers;

/**
 *
 * @author keyur_donga
 */
public class NewUser {
    
    private String fName;
    private String lName;
    private String dob;
    private String sex;
    private String height;
    private String weight;
    private String username;
    private String password;
    private int id;
    private static int count = 1;
    private Trainers trainer;

    public NewUser() {
        id = count;
        count++;
        trainer = new Trainers();
    }

    public Trainers getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainers trainer) {
        this.trainer = trainer;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
}
