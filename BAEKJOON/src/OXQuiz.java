import java.util.Arrays;
import java.util.Scanner;

public class OXQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz input number of test ox cases");
    int testCase = 5;
        int randomSample1 = (int) (Math.random() * 10);
        int randomSample2 = (int) (Math.random() * 10);
        int randomSample3 = (int) (Math.random() * 10);
        int randomSample4 = (int) (Math.random() * 10);
        int randomSample5 = (int) (Math.random() * 10);

        String[] ox1 = new String[randomSample1];
        for(int j = 0; j<randomSample1; j++ ){
            int OorX = (int) (Math.random() * 2);
            if(OorX==0){
                ox1[j]= "O";
            }
            else if(OorX==1){
                ox1[j]= "X";
            }
        }
        System.out.println(Arrays.toString(ox1));

        String[] ox2 = new String[randomSample2];
        for(int k = 0; k<randomSample2; k++ ){
            int OorX = (int) (Math.random() * 2);
            if(OorX==0){
                ox2[k]= "O";
            }
            else if(OorX==1){
                ox2[k]= "X";
            }
        }
        System.out.println(Arrays.toString(ox2));
       // System.out.println((int) (Math.random() * 2)); -- 0~1 정수

        int score1=0;
        int score2 = 0;
        int consecutive=1;
        for(int i = 0; i< ox1.length; i++){

            if(ox1[i]=="O"){
               score1+= consecutive;

               consecutive++;



            }else{
                consecutive= 1;
            }

        }

        System.out.println(score1);
    }



    }

