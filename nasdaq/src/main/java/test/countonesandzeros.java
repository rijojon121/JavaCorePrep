package test;

public class countonesandzeros {
    
    public static void seprateZerosandOnes(int[] arr) {

        int left = 0;
        int right = arr.length - 1 ;
        
        while(left < right){
            //move pointer to the left 

            while( left < arr.length && arr[left] == 0 ){
                left++;
            }

            //Move pointer to the right

            while ( right >= 0 && arr[right] ==1 ){
                right--;
            }

            //Swap if left is less than right

            if(left < right){

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;

            }
        }

    }

    //utility to print the array 

    public static void printArray (int[] arr){
        for( int num : arr){
            System.out.println( num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int a[] = {1,0,1,1,0,0,1,1,0,1,0};

         System.out.println("Original Array is ");
         printArray(a);

         seprateZerosandOnes(a);

         System.out.println("After seperating 0s and 1s :");
         printArray(a);
    }
}
