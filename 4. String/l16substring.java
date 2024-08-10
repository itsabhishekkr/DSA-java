public class l16substring {
    public static String substring(String str,int ie,int fi){
        String substr="";
        for(int i=ie;i<fi;i++){
            substr+=str.charAt(i);
        }
        return(substr);

    }
    public static void main(String args[]){
        String str="helloworld"; 
        System.out.println(substring(str,0,4));
    }
    
}
