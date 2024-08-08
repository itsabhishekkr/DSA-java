public class l14sumofsubarray {
    public static void sumarray(int array[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int x=i;x<=j;x++){
                    sum+=array[x];
                    // System.out.print(array[x]); 
                }
                System.out.println();
                System.out.println("sum="+sum);
                if(max<sum){
                    max=sum;
                }
                sum=0;

            }
        }
        System.out.println("max sum = "+max);
    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10};
        sumarray(array);
    }
}
