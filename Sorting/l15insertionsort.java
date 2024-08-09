public class l15insertionsort {
    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){//select one by one element and insert
            int temp=array[i];
            int j=i-1;
            while(j>=0&&array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        insertionsort(array);
        printarray(array); 
    }
}