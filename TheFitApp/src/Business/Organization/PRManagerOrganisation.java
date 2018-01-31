/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class PRManagerOrganisation extends Organization{

    public PRManagerOrganisation() {
        super(Type.PRManager.getValue());
    }

    
    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
    
    
}
