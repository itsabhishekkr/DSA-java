public class l14mamreverse {
    public static void rev(int number[]){
        int first=0;
        int last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[]={4,6,5,7,8,9};
        rev(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
    }
    
}
