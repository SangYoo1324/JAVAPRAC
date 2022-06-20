import java.util.Scanner;

public class numberOfnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input A: " );
        int A = sc.nextInt();
        System.out.println("input B: " );
        int B = sc.nextInt();
        System.out.println("input C: " );
        int C = sc.nextInt();

        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;

        int resultx = A *B*C;
        System.out.println(resultx);

        int digit ;
        while(resultx!=0) {
            digit = resultx % 10;
            resultx = resultx / 10;
            if (digit == 0) {
                count0++;
            }
            if (digit == 1) {
                count1++;
            }
            if (digit == 2) {
                count2++;
            }
            if (digit == 3) {
                count3++;
            }
            if (digit == 4) {
                count4++;
            }
            if (digit == 5) {
                count5++;
            }
            if (digit == 6) {
                count6++;
            }
            if (digit == 7) {
                count7++;
            }
            if (digit == 8) {
                count8++;
            }
            if (digit == 9) {
                count9++;
            }


        }



/*    switch(digit){
        case 0:
            count0++;
           // break;
        case 1:
            count1++;
          // break;
        case 2:
            count2++;
          // break;
        case 3:
            count3++;
          //  break;
        case 4:
            count4++;
          //  break;
        case 5:
            count5++;
        //    break;
        case 6:
            count6++;
        //    break;
        case 7:
            count7++;
        //    break;
        case 8:
            count8++;
        //    break;
        case 9:
            count9++;
       //     break;
    }*/

        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);
        System.out.println(count9);


int ship = 0;

while(ship<=10){
    System.out.println(ship);
    ship++;

}

    }
}
