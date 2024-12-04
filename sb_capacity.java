//Capacity Method
//The capacity method returns the current capacity of the StringBuffer. The capacity grows as needed to accommodate the changes.
public class sb_capacity{
    public static void main(String args[]){

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // Default capacity is 16

        sb.append("Hello World");
        System.out.println(sb.capacity()); // Output could vary based on usage

    }
}