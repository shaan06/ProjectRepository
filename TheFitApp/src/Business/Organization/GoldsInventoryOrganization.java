/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GoldsInventoryRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author keyur_donga
 */
public class GoldsInventoryOrganization extends Organization{

    public GoldsInventoryOrganization() {
        super(Type.GoldsInventoryOrg.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new GoldsInventoryRole());
        return roles;
        
    }
     
}
