/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author tom
 */
public class CirPatient {
    // The controlling manager.
    private CirHospitalManager patientManager;
            
    private String name;
    private int age;
    private String illness;
    private CirPatient nextPatient;
    
    public CirPatient(String name, int age, String illness, CirHospitalManager manager) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = this;
        // Link to HospitalMnager Object.
        this.patientManager = manager;
    }
    
    public void addPatient(CirPatient newPatient) {
        if (this.nextPatient.equals(patientManager.patientListStart)) {
                this.nextPatient = newPatient;
                newPatient.nextPatient = patientManager.patientListStart;
                System.out.println(newPatient.name+" has been added.");
            } else {
                this.nextPatient.addPatient(newPatient);
                
            }
    }

    public void printPatient() {
        System.out.println(name+"\t"+age+"\t"+illness+"\t"+this.nextPatient.name);
    }
    
    public void forwardPrint() {
        // Prints patient details and then goes forward in the list
        // printing the next patient details recursively.
        this.printPatient();
        if (this.nextPatient.equals(patientManager.patientListStart)) {    
            System.out.println("End of patient list.");            
        } else {
            this.nextPatient.forwardPrint();
        }
    }

    public void deletePatient(CirPatient delPatient) {
        if (this.nextPatient.equals(delPatient)) {
            this.nextPatient = nextPatient.nextPatient;
            System.out.println(delPatient.name+" has been removed.");
            if (delPatient.equals(patientManager.patientListStart)) {
                patientManager.patientListStart = this;
            }
        } else {
            this.nextPatient.deletePatient(delPatient);
        }
    }
    
}
