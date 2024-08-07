import java.util.*;
public class l14arraypluse3{
    public static void update(int marks[],int a){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+5;
            a=20;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]={35,56,86};
        int a=5;
        update(marks,a);
        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println(a);
    }
}
