
package day6;

/**
 *
 * @author tom
 */
public class CirHospitalManager {
    // Make List End and List Start public so it can be accessed by Patient objects.
    public CirPatient patientListStart = null;
    
    public void launch() {
        CirPatient one = new CirPatient("John", 33, "Tuberculosis", this);
        CirPatient two = new CirPatient("Bill", 33, "Tuberculosis", this);
        CirPatient three = new CirPatient("Jim", 23, "Tuberculosis", this);
        CirPatient four = new CirPatient("Kim", 13, "Meningitis", this);
        CirPatient five = new CirPatient("Sally", 27, "Tuberculosis", this);
        CirPatient six = new CirPatient("Luke", 54, "Tuberculosis", this);
        CirPatient seven = new CirPatient("Sue", 34, "Tuberculosis", this);
        CirPatient eight = new CirPatient("Ralph", 33, "Meningitis", this);
        CirPatient nine = new CirPatient("Ruby", 21, "Tuberculosis", this);
        CirPatient ten = new CirPatient("Alice", 19, "Tuberculosis", this); 
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
    }
    
    public static void main(String[] args) {
//        HospitalManager myManager = new HospitalManager();
//        myManager.launch();
        new CirHospitalManager().launch();
    }
}
