//refer exception hierarchy

public class ExceptionDemo {
    
    public static void main(String[] args) {
        
        int i=0;
        int j=0;

        int arr[]=new int[5];

        try{
            j=18/i;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indexing out of bounds");
        }
        catch(Exception e){
            System.out.println("Something Went wrong "+e);
        }

        System.out.println(j);

    }
}
