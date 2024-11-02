public class Array {
    
    public static void main(String args[]){

        // int nums[]={1,2,3,4};

        // for(int i=0;i<4;i++)System.out.println(nums[i]);

        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++){
            for(int j=0;j<4;j++)nums[i][j]=i+1;
        }

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[i].length; j++)System.out.print(nums[i][j]+ " ");

        //     System.out.println();
        // }

        // for(int n[]:nums){
        //     for(int m:n)System.out.print(m + " ");
        //     System.out.println();
        // }
            
    }
}
