package day6;

/**
 *
 * @author tom
 */
public class Spy {
    
    public static int spyCount;
    public int spyID;
    
    public Spy(int spyID) {
        spyCount++;
        this.spyID = spyID;
        System.out.println("Spy created with ID: " + spyID);
        System.out.println(spyCount + " spies now exist.");
    }
    
    static void die(int spyID) {
        spyCount--;
        System.out.println("Spy " + spyID + " has been detected and elminated");
        System.out.println(spyCount + " spies now exist.");
    }
    
    public void printSpies() {
        
    }
    
    public static void main(String[] args) {
        new Spy(22);
        new Spy(7);
        new Spy(1);
        new Spy(999);
        Spy.die(22);
        Spy.die(999);
    }
    
}
