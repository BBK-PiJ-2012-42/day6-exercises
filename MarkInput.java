/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author tom
 */
public class MarkInput {
    
    
    private void addMarks() {
        
        int mark = 0,
            count = 0,
            distinctions = 0,
            passes = 0,
            fails = 0,
            invalid = 0;
        //String markString = "0";
        do {
            System.out.print("Input a mark: ");
            String markString = System.console().readLine();
            mark = Integer.parseInt(markString);
            count++;
            if (mark > 69 && mark < 101) {
                distinctions++;
            } else if (mark > 49) {
                passes++;
            } else if (mark > 0) {
                fails++;
            } else {
                invalid++;
            }
        } while (mark != -1);
        System.out.println("There are "+count+" students: "+distinctions+" distinctions, "+passes+" pass, "+fails+" fails (plus "+invalid+" invalid).");
    }


    public static void main(String[] args) {
     
        
        MarkInput runEx = new MarkInput();
        runEx.addMarks();
        //new d6ex02().addMarks();
        
    }
    
    
}
