import java.util.*;
public class l14pair {
    public static void pair(int array[]){
        int tpair=0;
         for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+ array[i] +"," + array[j] + ")");
                tpair++;
            }
            System.out.println();
         }
         System.out.println("total pair = "+tpair);
    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10};
        pair(array);
    }
    
}
