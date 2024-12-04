//EnsureCapacity Method
//The ensureCapacity method ensures that the StringBuffer has a minimum capacity.
public class sb_ensurecapacity{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
         System.out.println(sb.capacity());

    }
}