public class l14subarray {
    public static void subarray(int array[]){
        int sub=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int x=i;x<=j;x++){
                    System.out.print(array[x]);
                }
                sub++;
                System.out.println();
            }
        }
        System.out.println("total subarraya= "+sub);

    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10};
        subarray(array);
    }
    
}
