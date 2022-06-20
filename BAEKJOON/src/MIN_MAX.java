import java.util.Scanner;

public class MIN_MAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz input number of ints u want to compare :  " );

        int n  = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("input numbers");
    for(int i = 0; i<n; i++){
    arr[i]= sc.nextInt();
        System.out.println(i);
    }

        int maxo=0;
        int mino= 100000;
        for(int i : arr){
            if(i== arr[0]) {
                maxo = i;
                mino = i;
            }
            else{
               maxo= Math.max(maxo,i);
                mino= Math.min(mino,i);
            }

        }

        System.out.println("max: "+maxo+"  min: "+ mino);


    }






    }

