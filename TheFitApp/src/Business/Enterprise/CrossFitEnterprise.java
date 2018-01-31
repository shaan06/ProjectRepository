/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CrossFitEpHeadRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author keyur_donga
 */
public class CrossFitEnterprise extends Enterprise{
      public CrossFitEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CrossFit);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new CrossFitEpHeadRole());
        return roles;
    }
}
