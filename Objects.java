class calculator{

    int val1;
    int val2;

    public calculator(int num1,int num2){
        val1=num1;
        val2=num2;
    }

    public int add(){

        return val1+val2;
    }
}
public class Objects {
    public static void main(String args[]) {

        calculator obj1=new calculator(1,4);

        System.out.println(obj1.add());
    }
}
