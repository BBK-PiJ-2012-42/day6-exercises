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
            } else {
                this.nextPatient.addPatient(newPatient);
            }
    }

    public boolean deletePatient(Patient patient) {
        if (this.nextPatient == null) {
            return false;
        } else if (this.nextPatient.name.equals(patient.name)) {
            this.nextPatient = nextPatient.nextPatient;
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }
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
            System.out.println("Begining of patient list.");            
        } else {
            this.prevPatient.backPrint();
        }
    }
    
}
