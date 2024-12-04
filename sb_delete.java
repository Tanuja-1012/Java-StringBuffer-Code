//The delete method removes characters from the StringBuffer between specified start and end indexes.
public class sb_delete{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello tanuuja");
        sb.delete(6,8);
        System.out.println(sb);
        }
}