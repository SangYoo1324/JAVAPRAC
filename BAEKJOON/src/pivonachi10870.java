public class pivonachi10870 {
    public static void main(String[] args) {
        int n = 6;
        // 0 1 1 2 3 5
        System.out.println(Fibonacci(6));


    }
    public static int Fibonacci(int n){
        if(n== 0)return 0;
        if(n==1)return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
