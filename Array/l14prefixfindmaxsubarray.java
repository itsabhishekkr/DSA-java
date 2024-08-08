
public class l14prefixfindmaxsubarray {
    public static void prefix(int array[]){
        int prearray[]=new int[array.length];
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        prearray[0]=array[0];
        for(int i=1;i<prearray.length;i++){
            prearray[i]=prearray[i-1]+array[i];
        }
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                currsum=(i==0)?prearray[j]:prearray[j]-prearray[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        prefix(array);

    }
}
