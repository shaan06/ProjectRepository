/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AnyTimeAccountantRole;
import Business.Role.CrossAccountantRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class AnytimeAccountantOrganization extends Organization{
 
        public AnytimeAccountantOrganization(){
        
        super(Organization.Type.AnytimeAccountantOrg.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new AnyTimeAccountantRole());
        return roles;
    }
}
