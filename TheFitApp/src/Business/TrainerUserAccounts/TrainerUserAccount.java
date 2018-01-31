/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TrainerUserAccounts;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Trainer.Trainers;

/**
 *
 * @author dell
 */
public class TrainerUserAccount {

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

    public Trainers getTrainers() {
        return trainers;
    }

    public void setTrainers(Trainers trainers) {
        this.trainers = trainers;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    private String username;
    private String password;
    private Trainers trainers;
    private Role role;
    
   public TrainerUserAccount(){
     Trainers trainers = new Trainers();
    }
   @Override
    public String toString() {
        return username;
    }
}
