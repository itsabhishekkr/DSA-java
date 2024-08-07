import java.util.*;
public class l14trappedrainwater {
    public static void trappedwater(int height[]){
        //left max boundary-array
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //right max boundary-array
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int waterlevel[]=new int[height.length];
        int totaltrapped=0;
        for(int i=0;i<height.length;i++){
              //waterlevel=min(leftbound,right bound)
            waterlevel[i]=Math.min(leftmax[i],rightmax[i]);
             //trapped water=waterlevel-height[i]
            totaltrapped+=waterlevel[i]-height[i];
        }
        System.out.println("total trappedrain water = "+totaltrapped);
    }

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height);
    }  
}
