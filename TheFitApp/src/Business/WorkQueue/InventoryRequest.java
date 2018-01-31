/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.util.Date;

/**
 *
 * @author dell
 */
public class InventoryRequest {
    private int id;
    private String message;
    private Organization sender;
    private Enterprise receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private static int count = 1;
    
    public InventoryRequest(){
        requestDate = new Date();
//        resolveDate = new Date();
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

    public Organization getSender() {
        return sender;
    }

    public void setSender(Organization sender) {
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
