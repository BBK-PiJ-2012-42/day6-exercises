/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author tom
 */
public class HospitalManager {
    private Patient patientListStart = null;
    // Make patientListEnd public so it can be accessed by Patient objects.
    public Patient patientListEnd = null;
    
    public void launch() {
        // Patinets are added directly to the data structure without names
        // because we only access them through the list methods.
        patientListStart = new Patient("John", 33, "Tuberculosis", this);
        patientListStart.addPatient(new Patient("Bill", 33, "Tuberculosis", this));
        patientListStart.addPatient(new Patient("Jim", 23, "Tuberculosis", this));
        patientListStart.addPatient(new Patient("Kim", 13, "Meningitis", this));
        patientListStart.addPatient(new Patient("Sally", 27, "Tuberculosis", this));
        patientListStart.addPatient(new Patient("Luke", 54, "Tuberculosis", this));
        patientListStart.addPatient(new Patient("Sue", 34, "Tuberculosis", this));
        patientListStart.addPatient(new Patient("Ralph", 33, "Meningitis", this));
        patientListStart.addPatient(new Patient("Ruby", 21, "Tuberculosis", this));
        patientListStart.addPatient(new Patient("Alice", 19, "Tuberculosis", this));
        
        patientListStart.forwardPrint();
        
        patientListEnd.backPrint();
    }
    
    public static void main(String[] args) {
//        HospitalManager myManager = new HospitalManager();
//        myManager.launch();
        new HospitalManager().launch();
    }
}
