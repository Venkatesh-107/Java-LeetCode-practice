
public class Main {
    public static boolean Prime (int x){
        int count=0;
        if(x<1){return false;}
        if(x==2){return true;}
        for(int i=3;i<x;i++){
            if(x%i==0){count++;}
        }
        if(count==2){return true;}
        else{return false;}
}
    public static void main(String[] args) {
        int n=10;
        if(Prime(n)==true){
          System.out.println("prime");}
        else{
          System.out.println(" not prime");}
    }
}
