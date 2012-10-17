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
    // Make List End and List Start public so it can be accessed by Patient objects.
    public Patient patientListStart = null;
    public Patient patientListEnd = null;
    
    public void launch() {
        Patient one = new Patient("John", 33, "Tuberculosis", this);
        Patient two = new Patient("Bill", 33, "Tuberculosis", this);
        Patient three = new Patient("Jim", 23, "Tuberculosis", this);
        Patient four = new Patient("Kim", 13, "Meningitis", this);
        Patient five = new Patient("Sally", 27, "Tuberculosis", this);
        Patient six = new Patient("Luke", 54, "Tuberculosis", this);
        Patient seven = new Patient("Sue", 34, "Tuberculosis", this);
        Patient eight = new Patient("Ralph", 33, "Meningitis", this);
        Patient nine = new Patient("Ruby", 21, "Tuberculosis", this);
        Patient ten = new Patient("Alice", 19, "Tuberculosis", this); 
        patientListStart = one; 
        patientListStart.addPatient(two);
        patientListStart.addPatient(three);
        patientListStart.addPatient(four);
        patientListStart.addPatient(five);
        patientListStart.addPatient(six);
        patientListStart.addPatient(seven);
        patientListStart.addPatient(eight);
        patientListStart.addPatient(nine);
        patientListStart.addPatient(ten);
        
        patientListStart.forwardPrint();
        
        patientListEnd.backPrint();
        
        five.deletePatient();
        one.deletePatient();
        ten.deletePatient();
        patientListStart.forwardPrint();
        patientListEnd.backPrint();
    }
    
    public static void main(String[] args) {
//        HospitalManager myManager = new HospitalManager();
//        myManager.launch();
        new HospitalManager().launch();
    }
}
