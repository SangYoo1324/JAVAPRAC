import java.util.*;
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

        //빵형 예제
        List listo  = Arrays.asList(1,2,3,4,5,5);
        List<Integer> listo2 = new ArrayList<>(new HashSet<Integer>(listo));

        listo2.forEach(System.out::println);
        System.out.println("==================");
        listo.stream().distinct().forEach(System.out::println);


        //1.배열
        String [] strArr = new String[]{"bbang", "Thanos", "Sangdo"};
        Integer [] intArr = new Integer[]{3,6,9};
        Double [] douArr = new Double[]{3.1, 3.2, 3.8};
        //2. 스트림 생성
    Stream <String> strStm = Arrays.stream(strArr);
        Stream<Integer> intStm =Arrays.stream(intArr);
        Stream<Double> douStm =Arrays.stream(douArr);
//3. 출력
        strStm.forEach(System.out::println);
        intStm.forEach(System.out::println);
        douStm.forEach(System.out::println);

        //DataObj 사용한 스트림 prac
        DataObj[] data=  {
                new DataObj(1, "shibal"),
                new DataObj(2, "Thanos"),
                new DataObj(3, "yalala"),
        };

//long way
        Stream<DataObj> stm1 = Arrays.stream(data);
        stm1.forEach(System.out::println);
    //shortcut(스트림 생성 후 바로 출력)
    Arrays.stream(data).forEach(System.out::println);


    //중간연산자로 배열 합치기기(of)
       String[] str1 = {"ehh", "wooon", "yikes"};
        String[] str2 = {"gaesae", "Ang", "ing"};
        Stream<String[]> ofstream = Stream.of(str1, str2);

        //출력까지                     (람다식 문법:  매개변수 목록 -> 실행문)
       Stream.of(str1, str2).forEach(x->System.out.println(Arrays.deepToString(x)));
       //중간연산자로 배열 한개로 통합하기(flatMap)
    ofstream.flatMap(Arrays::stream).forEach(System.out::println);

    //스트림의 이해3


    }




}

class DataObj{
    int no;
    String name;
    public DataObj(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
