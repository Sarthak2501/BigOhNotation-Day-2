import java.util.Arrays;

public class Qthree2 {
    public static void main(String[] args) {
//        for (int i = 0 ; i <= 7 ; i++){
//            System.out.print("\\");
//            for (int j = 0 ; j <= 7 ; j++){
//                System.out.print("*");
//            }
//            System.out.println("/");
//        }
//        System.out.println();


        char[] arr = new char[7];
        arr = new char[]{'\\', '*', '*', '*','*', '*', '*', '/'};
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        System.out.println(arr);
        while (left < right){
            swap(arr,left,left + 1);
            swap(arr,right,right - 1);
            System.out.println(arr);
            left++;
            right--;
//            System.out.println(left);
//            System.out.println(right);
        }

        while(right != 0){
            swap(arr,right,right - 1);
            swap(arr,left,left + 1);
            System.out.println(arr);
            left++;
            right--;
        }
//        System.out.println("---------");
//        System.out.println(arr);
//        System.out.println("----------");

//        int beechright = n / 2 ;
//        int beechleft = beechright - 1;
//        swap(arr,beechleft,beechright);
//        while(beechright != 0 ){
//            swap(arr,beechleft,beechleft + 1);
//            swap(arr,beechright,beechright - 1);
//            System.out.println(arr);
//            beechright--;
//        }




//        for (int i = 0; i < arr.length - 1 ; i++){
//            swap(arr , i , i+1);
//            swap(arr, n - 1 , n - 1 - i);
//            System.out.println(arr);
//        }
    }
    public static void swap(char [] arr , int a , int b){
         char temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
}
