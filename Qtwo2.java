import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Qtwo2 {
//    public static int [][] tripletSum(int [] arr , int targetsum){
//        int n = arr.length;
//        int[][] ans = new int[0][0];
//
//        int pehlaNum = 0;
//        int DusraNum = 0;
//        int thisraNum = 0;
//        for(int i = 0 ; i < n - 2 ; i++) {
//            pehlaNum = arr[i];
//
//            for (int j = i + 1; j < n - 1; j++) {
//                DusraNum = arr[j];
//
//                for (int k = j + 1; k < n; k++) {
//                    thisraNum = arr[k];
//                }
//            }
//        }
//        //int[] ans;
//        if (pehlaNum + DusraNum + thisraNum  == targetsum){
//          ans = new int[][]{{pehlaNum, DusraNum, thisraNum}};
//        }
//        return ans;
//    }

    public static ArrayList<Integer> tripletSumOptimised(ArrayList arr, int targetSum){
        int n = arr.size();
        Collections.sort(arr);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0 ; i < n - 2 ; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currentSum = (int)arr.get(i) + (int)arr.get(left) + (int)arr.get(right);
                if (currentSum > targetSum) {
                    right = right - 1;
                } else if (currentSum < targetSum) {
                    left = left + 1;
                } else {
                    ans.add((int)arr.get(i));
                    ans.add((int)arr.get(left));
                    ans.add((int)arr.get(right));

                    left = left + 1;
                    right = right - 1;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(4);
        arr.add(7);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(4);
        arr.add(6);
        arr.add(11);
//        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
//        System.out.println();
        System.out.println(tripletSumOptimised(arr,21));
    }
}
