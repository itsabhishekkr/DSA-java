import java.util.*;
public class l15inbuiltsort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void printb(Integer b[]){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,8,1};
        int a[]={5,4,6,8,9,8};
        Integer b[]={2,9,5,7,10,9};
        Arrays.sort(arr);
        Arrays.sort(a,0,4);
        Arrays.sort(b,Collections.reverseOrder());
        printArr(arr);
        System.out.println();
        printArr(a);
        System.out.println();
        printb(b);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
    }
}
