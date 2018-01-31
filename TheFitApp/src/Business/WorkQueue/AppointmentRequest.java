/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.NewUser.NewUser;

import java.util.Date;

/**
 *
 * @author keyur_donga
 */
public class AppointmentRequest {

    private int id;
    private String message;
    private NewUser sender;
    private Enterprise receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private static int count = 1;
    
    public AppointmentRequest(){
        requestDate = new Date();
        id = count;
        count++;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NewUser getSender() {
        return sender;
    }

    public void setSender(NewUser sender) {
        this.sender = sender;
    }

    public Enterprise getReceiver() {
        return receiver;
    }

    public void setReceiver(Enterprise receiver) {
        this.receiver = receiver;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){
        return status;
    }
}
