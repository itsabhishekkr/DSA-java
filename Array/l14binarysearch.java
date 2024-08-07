package Array;
import java.util.*;
public class l14binarysearch {//binary search means first shorted
    public static int binarysearch(int bin[],int key){
        int end=bin.length-1;
        int first=0;
        while(first<=end){
            int mid=(first+end)/2;
            if(bin[mid]==key){
                return(mid);
            }
            if(bin[mid]<key){
                first=mid+1;
            }else{
                    end=mid-1;
            }
        }
        return(-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int key=4;
        // sorted first all array
        int bin[]={2,4,6,8,10,12};
        int index=binarysearch(bin,key); 
        System.out.println("index="+index); 
    }
}
