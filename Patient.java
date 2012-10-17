/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author tom
 */
public class Patient {
    
    // The controlling manager.
    private HospitalManager patientManager;
            
    private String name;
    private int age;
    private String illness;
    private Patient prevPatient;
    private Patient nextPatient;
    
    public Patient(String name, int age, String illness, HospitalManager manager) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.prevPatient = null;
        this.nextPatient = null;
        // Link to HospitalMnager Object.
        this.patientManager = manager;
    }
    
    // Method to allow setting of prevPatient
    public void setPrevious(Patient oldPatient) {
        prevPatient = oldPatient;
    }
    
    
    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
                // At the end of the list set previousPatient to the patient at
                // the end of the list.
                newPatient.setPrevious(this);
                // Then add the new patient to the end.
                this.nextPatient = newPatient;
                // Finally set end of the list to the new patient.
                patientManager.patientListEnd = newPatient;
                System.out.println(newPatient.name+" has been added.");
            } else {
                this.nextPatient.addPatient(newPatient);
                
            }
    }
    

    public void deletePatient() {
        // Check to see if patient is at the end or start of the list.
        // Could have checked if next or previous was void but used reference
        // to manager instead.
        if (this.equals(patientManager.patientListStart)) {
            patientManager.patientListStart = this.nextPatient;
            this.nextPatient.prevPatient = this.prevPatient;
        } else if (this.equals(patientManager.patientListEnd)) {
            patientManager.patientListEnd = this.prevPatient;
            this.prevPatient.nextPatient = this.nextPatient;
        } else {
            // Removes self from the list by connecting the previous and
            // next patients to each other.
            this.nextPatient.prevPatient = this.prevPatient;
            this.prevPatient.nextPatient = this.nextPatient;
        }
        System.out.println(this.name+" has been removed.");
    }
    
    public void printPatient() {
        System.out.println(name+"\t"+age+"\t"+illness);
    }
    
    public void forwardPrint() {
        // Prints patient details and then goes forward in the list
        // printing the next patient details recursively.
        this.printPatient();
        if (this.nextPatient == null) {    
            System.out.println("End of patient list.");            
        } else {
            this.nextPatient.forwardPrint();
        }
    }
    
    
    public void backPrint() {
        // Prints patient details and then goes backward in the list
        // printing the previous patient details recursively.
        this.printPatient();
        if (this.prevPatient == null) {    
            System.out.println("Start of patient list.");            
        } else {
            this.prevPatient.backPrint();
        }
    }
    
    
}
