import java.util.function.Function;

public class LamdaPrac2 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("익명 내부 클래스 실행");
        };
                //매개변수 , 반환형
        Function<Integer, String> r1 = (t) ->{
            String result = "";
            for (int i = 0; i<t ; i++){
            result += "hurray\n";
            }
            return result;
        };
        System.out.println(r1.apply(3));
    }

}

// already provided interface
interface Sample05Function {
    public String apply(int t);

}