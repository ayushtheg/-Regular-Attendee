import java.util.*;
public class RegularAttendee{
     public static void main(String []args){
        int arr[] = {2,2}; 
        int len = arr.length;
        freq(arr, len);
     }
     public static void freq(int nums[], int size) {
         Arrays.sort(nums);
         int maxcounter = 1;
         int newcounter = 1;
         int result = 0;
         for (int i = 1; i < size; i++) {
             if(nums[i] == nums[i-1]) {
                 newcounter++;
             }else {
                 if(newcounter > maxcounter) {
                     maxcounter = newcounter;
                     result = nums[i-1];
                 }
                 newcounter = 1;
             }
                if (newcounter > maxcounter) { 
                     maxcounter = newcounter;
                     result = nums[i-1];
                } 
         }
         System.out.println(result);
     }
}