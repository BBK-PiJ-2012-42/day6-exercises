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
    private String name;
    private int age;
    private String illness;
    private Patient prevPatient;
    private Patient nextPatient;
    
    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.prevPatient = null;
        this.nextPatient = null;
    }
    
    
    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
                this.nextPatient = newPatient;
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
    
}
