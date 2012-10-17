/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package day6;

/**
 *
 * @author tom
 */
public class Test {
    public static void main(String[] args) {  
        String name;
        System.out.println("Enter the names of your friends. Finish by typing END.");
        do {
            name = System.console().readLine();
            System.out.println(name + ": friend");
        } while (!name.equals("END"));
    }
}
