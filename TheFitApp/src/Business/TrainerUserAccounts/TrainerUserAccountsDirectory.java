/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TrainerUserAccounts;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Trainer.Trainers;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class TrainerUserAccountsDirectory {
    private ArrayList<TrainerUserAccount> userAccountList;

    public TrainerUserAccountsDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<TrainerUserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public TrainerUserAccount authenticateUser(String username, String password){
        
        for (TrainerUserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        
        return null;
    }
    
    public TrainerUserAccount createUserAccounts(String username, String password, Trainers trainers){
        TrainerUserAccount userAccounts = new TrainerUserAccount();
        userAccounts.setUsername(username);
        userAccounts.setPassword(password);
        userAccounts.setTrainers(trainers);
       
        userAccountList.add(userAccounts);
        return userAccounts;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (TrainerUserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
