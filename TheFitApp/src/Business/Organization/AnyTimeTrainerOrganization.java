/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AnytimeHeadTrainerRole;
import Business.Role.CrossFitHeadTrainerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class AnyTimeTrainerOrganization extends Organization {
     public AnyTimeTrainerOrganization() {
        super(Organization.Type.AnytimeHeadTrainerOrg.getValue());
       }
     @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new AnytimeHeadTrainerRole());
        return roles;
}
}
