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
    
    public void launch() {
//        Patient firstPatient = new Patient("John", 33, "Tuberculosis");
//        patientListStart = firstPatient;
        patientListStart = new Patient("John", 33, "Tuberculosis");
        patientListStart.addPatient(new Patient("Bill", 33, "Tuberculosis"));
        patientListStart.addPatient(new Patient("Jim", 23, "Tuberculosis"));
        patientListStart.addPatient(new Patient("Kim", 13, "Meningitis"));
        patientListStart.addPatient(new Patient("Sally", 27, "Tuberculosis"));
        patientListStart.addPatient(new Patient("Luke", 54, "Tuberculosis"));
        patientListStart.addPatient(new Patient("Sue", 34, "Tuberculosis"));
        patientListStart.addPatient(new Patient("Ralph", 33, "Meningitis"));
        patientListStart.addPatient(new Patient("Ruby", 21, "Tuberculosis"));
        patientListStart.addPatient(new Patient("Alice", 19, "Tuberculosis"));
    }
    
    public static void main(String[] args) {
//        HospitalManager myManager = new HospitalManager();
//        myManager.launch();
        new HospitalManager().launch();
    }
}
