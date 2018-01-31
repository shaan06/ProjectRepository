/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Trainer;

/**
 *
 * @author dell
 */
public class Trainers {
    
   String name;
   int ID;
   private static int count = 1;
    
      public Trainers(){
          ID = count; 
          count++; }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    @Override
    public String toString() {
        return name;
    }
  }
