
public class Main {
    public static int Fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int num =5;
        System.out.println("the factorial of num " + num +"is" + Fact(num));
    }
}
