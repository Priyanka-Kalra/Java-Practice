public class StringBufferDemo {
    
    public static void main(String args[]){

        //StringBuffer takes extra 16 spaces as buffer
        StringBuffer sb=new StringBuffer("Sammy");
        System.out.println(sb+ " " + sb.capacity());
        System.out.println();

        sb.append("Kalra");
        System.out.print(sb+ " " + sb.capacity());
        System.out.println();

        sb.deleteCharAt(9);
        System.out.println(sb + " " + sb.capacity());
    }
    
}
