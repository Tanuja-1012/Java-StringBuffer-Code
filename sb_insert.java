//insert(int offset, String str): Inserts a string at the specified index.
public class sb_insert{

    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("hello ");
        sb.insert(6,"Tanuja");
        System.out.println("After insert opertion:"+sb);
    }
}