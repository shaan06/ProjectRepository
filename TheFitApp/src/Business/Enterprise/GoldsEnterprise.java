/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.GoldsEpHeadRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author keyur_donga
 */
public class GoldsEnterprise extends Enterprise{

    public GoldsEnterprise(String name) {
        super(name, EnterpriseType.Golds);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new GoldsEpHeadRole());
        return roles;
    }
    
    
    
}
