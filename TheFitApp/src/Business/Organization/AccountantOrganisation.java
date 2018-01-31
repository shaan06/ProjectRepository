/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GoldsAccountantRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class AccountantOrganisation extends Organization{

    public AccountantOrganisation() {
        super(Type.GoldsAccountantOrg.getValue());
    }

    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new GoldsAccountantRole());
        return roles;
    }
}
