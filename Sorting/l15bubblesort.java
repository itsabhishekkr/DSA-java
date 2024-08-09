public class l15bubblesort {
    public static void bubblesort(int array[]){
        int temp=0;
        for(int turn=0;turn<array.length-1;turn++){//loop for pick element(n-1)  
            for(int j=0;j<array.length-1-turn;j++){//how many times swap loop
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];  
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        bubblesort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    
}