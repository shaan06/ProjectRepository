/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.GoldsHeadTrainerRole;

import Business.Trainer.Trainers;
import java.util.HashSet;


/**
 *
 * @author keyur_donga
 */
public class GoldsTrainerOrganization extends Organization{
 

    public GoldsTrainerOrganization() {
        super(Organization.Type.GoldsHeadTrainerOrg.getValue());
       
        
    }
     @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new GoldsHeadTrainerRole());
        return roles;
    }
     
}
