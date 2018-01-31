/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AnyTimeInventoryRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class AnyTimeInventoryOrganization extends Organization{

    public AnyTimeInventoryOrganization() {
        super(Type.AnytimeInventoryOrg.getValue());
    }

    
    
    
    @Override
    public HashSet<Role> getSupportedRole() {
       roles = new HashSet<>();
       roles.add(new AnyTimeInventoryRole());
       return roles;
    }
    
}
