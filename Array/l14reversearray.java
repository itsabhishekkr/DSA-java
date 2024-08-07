import java.util.*;
public class l14reversearray {
    public static void reverse(int array[]){
        Scanner sc=new Scanner(System.in);
        int arrayrev[]=new int[array.length];
        for(int j=0;j<array.length;j++){
             arrayrev[j]=array[array.length-j-1];
             System.out.print(arrayrev[j]);

        }
    }
    public static void main(String args[]){
        int array[]={1,3,4,5,6,7,8};
        reverse(array);
    }
}
