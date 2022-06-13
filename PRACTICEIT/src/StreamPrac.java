import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamPrac {
    public static void main(String[] args) {
        //Arrays 클래스의 stream method 사용
        String[] arr = new String []{"a", "b", "C"};
        Stream<String> stream = Arrays.stream(arr);
//Iterator 사용
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int num = it.next();
            System.out.println(num);

        }
        //Stream 사용
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Stream<Integer> stream2 = list.stream();
        stream.forEach((num -> System.out.println(num)));
    }

}
