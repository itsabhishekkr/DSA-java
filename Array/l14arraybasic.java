package Array;
import java.util.*;
public class l14arraybasic {
    public static void main(String args[]){
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phy="+marks[0]);
        System.out.println("che="+marks[1]);
        System.out.println("math="+marks[2]);
        int average=((marks[0]+marks[1]+marks[2])/3);
        System.out.println(average);
        System.out.println("length of array="+marks.length);
        marks[2]=30;
        System.out.println("math marks="+marks[2]);
        marks[2]=marks[2]+5;
        System.out.println("marks="+marks[2]);
    }
    
}
