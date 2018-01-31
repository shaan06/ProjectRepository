/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.NewUser.CustomerDirectory;
import Business.Role.Role;
import Business.Trainer.TrainerDirectory;
import Business.TrainerUserAccounts.TrainerUserAccountsDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.InventoryQueue;
import Business.WorkQueue.InventoryRequest;
import java.util.HashSet;

/**
 *
 * @author keyur_donga
 */
public abstract class Organization {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private TrainerDirectory trainerDirectory;
    private int organizationID;
    private static int count=0;
    private TrainerUserAccountsDirectory userAccountsDirectory;
    private CustomerDirectory customerDirectory;
    private InventoryQueue intQ;
    private InventoryRequest inventoryRequest;

  
    public TrainerUserAccountsDirectory getUserAccountsDirectory() {
        return userAccountsDirectory;
    }

    public TrainerDirectory getTrainerDirectory() {
        return trainerDirectory;
    }
    public HashSet<Role> roles;

    
    public enum Type{
        GoldsInventoryOrg("Golds Inventory Organization"),
        CrossFitInventoryOrg("CrossFit Inventory Organization"),
        AnytimeInventoryOrg("Anytime Inventory Organization"),
        GoldsHeadTrainerOrg(" Gold Head Trainer Organization"), 
        CrossFitHeadTrainerOrg("Cross Fit Head Trainer Organization "),
        AnytimeHeadTrainerOrg("Anytime Head Trainer Organization"),
        DieticianOrg("Dietician Organization"), 
        GoldsAccountantOrg("Accountant Organization"),
        CrossFitAccountantOrg("CrossFit Accountant Organization"),
        AnytimeAccountantOrg("Anytime Accountant Organization"),
        LogManager("Log Manager"),
        PRManager("PR Manager");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        count++;
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        trainerDirectory = new TrainerDirectory();
        userAccountsDirectory = new TrainerUserAccountsDirectory();
        organizationID = count;
        intQ = new InventoryQueue();
        customerDirectory = new CustomerDirectory();
        roles = new HashSet<>();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public abstract HashSet<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

   

    public void setName(String name) {
        this.name = name;
    }

   

    @Override
    public String toString() {
        return name;
    }
    
    
}
