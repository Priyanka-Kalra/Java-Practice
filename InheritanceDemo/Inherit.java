package InheritanceDemo;

public class Inherit {
    
    public static void main(String args[]){

        AdvCal obj=new AdvCal(18, 4);

        System.out.println(obj.add()+" "+obj.diff()+" "+obj.prod()+" "+obj.div());
    }
}
