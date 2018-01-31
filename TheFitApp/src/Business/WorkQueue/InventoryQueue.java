/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dell
 */
public class InventoryQueue {
    
     private ArrayList<InventoryRequest> inventoryRequestList;
    
    public InventoryQueue(){
        inventoryRequestList = new ArrayList<>();
    }

    public ArrayList<InventoryRequest> getinventoryRequestList() {
        return inventoryRequestList;
    }

    public InventoryRequest  addinventorytRequest(InventoryRequest ar){
        
        inventoryRequestList.add(ar);
        return ar;
    }
    
    public InventoryRequest getinventoryRequest(int id){
        for(InventoryRequest ar : inventoryRequestList){
            if(ar.getId() == id){
                return ar;
            }
        }
        return null;
    }
    
    public String updateinventoryRequest(InventoryRequest ar1){
        for(InventoryRequest ar : inventoryRequestList){
            if(ar.getId() == ar1.getId()){
                ar.setMessage(ar1.getMessage());
                ar.setResolveDate(new Date());
                ar.setStatus("Confirmed");
                return "Approved";
            }
        }
        return "error";
    
}
}
