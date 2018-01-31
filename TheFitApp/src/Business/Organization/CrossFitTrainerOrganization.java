/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CrossFitHeadTrainerRole;
import Business.Role.GoldsHeadTrainerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class CrossFitTrainerOrganization extends Organization {
    
    public CrossFitTrainerOrganization() {
        super(Organization.Type.CrossFitHeadTrainerOrg.getValue());
       
        
    }
     @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new CrossFitHeadTrainerRole());
        return roles;
}
}
