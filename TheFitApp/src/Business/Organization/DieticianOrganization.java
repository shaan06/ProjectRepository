/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author keyur_donga
 */
public class DieticianOrganization extends Organization{

    public DieticianOrganization() {
        super(Type.DieticianOrg.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
     
}
