import java.util.*;
public class l14linersearch {
    public static int lsearch(int marks[],int find){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==find){
                return(i);
            }
        }
        return(-1);
    }
    public static void main(String args[]){
        int marks[]={30,34,5,20};
        int find=5;
        int index=lsearch(marks,find);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("index="+index);
        }

    }
    
}
