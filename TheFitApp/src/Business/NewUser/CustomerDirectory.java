/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NewUser;

import Business.Trainer.Trainers;
import java.util.ArrayList;

/**
 *
 * @author keyur_donga
 */
public class CustomerDirectory {
    
    private ArrayList<NewUser> employeeList;

    public CustomerDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<NewUser> getEmployeeList() {
        return employeeList;
    }
    
    public NewUser createUser(NewUser nu){
        employeeList.add(nu);
        return nu;
    }
   }