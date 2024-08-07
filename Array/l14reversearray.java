import java.util.*;
public class l14reversearray {
    public static void reverse(int arr[]){
        int temp=0;
        int start=0;
        int last=arr.length-1;
        while(start<=last){
            temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;last--;
        }
    }
    public static void main(String args[]){
        int marks[]={2,3,4,5,6,7};
        reverse(marks);
        // print reverse TC=O(n) and SC=O(1)
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
