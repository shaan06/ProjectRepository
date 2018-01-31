/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CrossAccountantRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class CrossAccountantOrganization extends Organization {

    public CrossAccountantOrganization(){
        
        super(Type.CrossFitAccountantOrg.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new CrossAccountantRole());
        return roles;
               
        
       
    }
    
}
