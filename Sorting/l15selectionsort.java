import java.util.*;
public class l15selectionsort {
    public static void selectionsort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minpo=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minpo]>array[j]){
                    minpo=j;
                }
            }
            //swap
            int temp=array[minpo];
            array[minpo]=array[i];
            array[i]=temp;
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        selectionsort(array);
        printarray(array);
    }
}