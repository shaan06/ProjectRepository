/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Trainer;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class TrainerDirectory {
    
    private ArrayList<Trainers> trainerDirectory;
    
    public TrainerDirectory(){
        trainerDirectory = new ArrayList<>();
        
    }

    public ArrayList<Trainers> getTrainerDirectory() {
        return trainerDirectory;
    }

    public void setTrainerDirectory(ArrayList<Trainers> trainerDirectory) {
        this.trainerDirectory = trainerDirectory;
    }
    
      public Trainers createEmployee(String name){
        Trainers trainers = new Trainers();
        trainers.setName(name);
        trainerDirectory.add(trainers);
        return trainers;
    }
    
}
