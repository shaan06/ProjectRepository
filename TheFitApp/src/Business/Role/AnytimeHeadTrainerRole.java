/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AnytimeHeadTrainerJPanel.AnytimeHeadTrainerWorkAreaJPanel;

/**
 *
 * @author dell
 */
public class AnytimeHeadTrainerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AnytimeHeadTrainerWorkAreaJPanel(userProcessContainer, organization, system);
    }
    @Override
    public String toString(){
        return RoleType.AnytimeHeadTrainer.getValue();
    }
}
