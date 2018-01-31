/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author keyur_donga
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Boolean checkIfExists(Type type){
        for(Organization org : organizationList){
            if(org.getName() == type.getValue()){
                return true;
            }
        }
        return false;
    }
    
    public void createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.GoldsInventoryOrg.getValue())){
            organization = new GoldsInventoryOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.GoldsAccountantOrg.getValue())){
            organization = new AccountantOrganisation();
            organizationList.add(organization);
        } 
         else if (type.getValue().equals(Type.CrossFitAccountantOrg.getValue())){
            organization = new CrossAccountantOrganization();
            organizationList.add(organization);
        } 
           else if (type.getValue().equals(Type.CrossFitInventoryOrg.getValue())){
            organization = new CrossFitInventoryOrganization();
            organizationList.add(organization);
        }
             else if (type.getValue().equals(Type.AnytimeInventoryOrg.getValue())){
            organization = new AnyTimeInventoryOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.AnytimeAccountantOrg.getValue())){
            organization = new AnytimeAccountantOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.DieticianOrg.getValue())){
            organization = new DieticianOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LogManager.getValue())){
            organization = new LogManager();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.GoldsHeadTrainerOrg.getValue())){
            organization = new GoldsTrainerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CrossFitHeadTrainerOrg.getValue())){
            organization = new CrossFitTrainerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AnytimeHeadTrainerOrg.getValue())){
            organization = new AnyTimeTrainerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DieticianOrg.getValue())){
            organization = new DieticianOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PRManager.getValue())){
            organization = new PRManagerOrganisation();
            organizationList.add(organization);
        }
    }
}