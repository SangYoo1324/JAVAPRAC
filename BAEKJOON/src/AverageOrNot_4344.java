import java.util.Arrays;

public class AverageOrNot_4344 {
    public static void main(String[] args) {
    int studentCount = (int)(Math.random()*11);// 0~10
        double sum = 0;

        int []  scores = new int [studentCount];
        for(int i = 0; i<studentCount;i++){
            scores[i]= (int)(Math.random()*101);
            sum+= scores[i];
        }


        System.out.println(studentCount+"\t"+ Arrays.toString(scores));
        double avg = sum/studentCount;
        System.out.println(String.format("%.3f", avg)+"%");



    }
}
