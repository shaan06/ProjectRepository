/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AnytimeEpHeadRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author keyur_donga
 */
public class AnytimeFitnessEnterprise extends Enterprise{
    
    public AnytimeFitnessEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.AnytimeFitness);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new AnytimeEpHeadRole());
        return roles;
    }
}
