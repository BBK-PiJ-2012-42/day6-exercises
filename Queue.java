package day6;

/**
 *
 * @author tnealo01
 */
public class Queue {
    private Item front = null;
    private Item back = null;
    private int count = 0; 
    
    public void insert(Item newItem) {
        if (front == null && back == null) {
            front = newItem;
            back = newItem;
            newItem.next = null;
        } else {
            back.next = newItem;
            back = newItem;
        }
        count++;
        System.out.println("Inserting request " + newItem.value);
    }
    
    public void retrieve() {
        front = front.next; 
        count--;
        System.out.println("Retrieving request " + front.value + " ... done.");
        //return front;
    }
    
    public void size() {
        System.out.println("There are " + count + " requests in the queue");
    }
    
    public void launch() {
        this.size();
        this.insert(new Item(900));
        this.insert(new Item(12));
        this.insert(new Item(6));
        this.insert(new Item(2));
        this.insert(new Item(14));
        this.insert(new Item(16));
        this.size();
        this.retrieve();
        this.retrieve();
        this.size();
        this.insert(new Item(77));
        this.retrieve();
    }
    
    public static void main(String[] args) {
        new Queue().launch();
    }
    
    
    
}
