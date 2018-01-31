/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keyur_donga
 */
public class AppointmentQueue {
    
    private ArrayList<AppointmentRequest> appointmentRequestList;
    
    public AppointmentQueue(){
        appointmentRequestList = new ArrayList<>();
    }

    public ArrayList<AppointmentRequest> getAppointmentRequestList() {
        return appointmentRequestList;
    }

    public AppointmentRequest addApptRequest(AppointmentRequest ar){
        appointmentRequestList.add(ar);
        return ar;
    }
    
    public AppointmentRequest getAppointmentRequest(int id){
        for(AppointmentRequest ar : appointmentRequestList){
            if(ar.getId() == id){
                return ar;
            }
        }
        return null;
    }
    
    public String updateAppointmentRequest(AppointmentRequest ar1){
        for(AppointmentRequest ar : appointmentRequestList){
            if(ar.getId() == ar1.getId()){
                ar.setMessage(ar1.getMessage());
                ar.setResolveDate(new Date());
                ar.setStatus("Approved");
                return "Approved";
            }
        }
        return "error";
    }
    
}