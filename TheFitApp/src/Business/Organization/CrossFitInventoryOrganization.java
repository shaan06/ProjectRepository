/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CrossFitInventoryRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class CrossFitInventoryOrganization extends Organization {

    public CrossFitInventoryOrganization() {
        super(Type.CrossFitInventoryOrg.getValue());
    }

 
    @Override
   public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new CrossFitInventoryRole());
        return roles;
    }
    
}
