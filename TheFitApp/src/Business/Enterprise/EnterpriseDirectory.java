/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Golds){
            enterprise = new GoldsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.AnytimeFitness){
            enterprise = new AnytimeFitnessEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else  if (type == Enterprise.EnterpriseType.CrossFit){
            enterprise = new CrossFitEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public Boolean cieEnterprise(String name){
        for(Enterprise enp : enterpriseList){
            if(enp.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
