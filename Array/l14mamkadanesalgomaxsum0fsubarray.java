import java.util.*;
public class l14mamkadanesalgomaxsum0fsubarray{
    public static void  kadanes(int array[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            cursum=cursum+array[i];
            if(cursum<0){
                cursum=0;
            }
            maxsum=Math.max(cursum,maxsum);
        }
        System.out.println("maxsum="+maxsum);
    }
    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(array);
    }
}