public class LamdaPrac {
    public static void main(String[] args) {
        //lamda(반환 자료형이 없는경우)
        Sample01Function f = () -> System.out.println("Sample01 test ");
                            //매개변수 -> 내용
        f.test();

        //lamda (반환 자료형, 매개변수가 있는경우)
        Sample02Function f2 = ( a) -> a;
        System.out.println(f2.test("Sample02 test "));

// dup class( long way)
        Sample01Function f1 = new Sample01Function() {
            @Override
            public void test() {
                System.out.println("Sample01 test ");
            }

    };
        f1.test();
}

}
@FunctionalInterface
interface Sample01Function{
    //interface 의 method들은 모두 추상 메서드
    public  void test();


}

@FunctionalInterface
interface Sample02Function{
    //interface 의 method들은 모두 추상 메서드
    public  String test(String a);// 매개변수, 반환타입이 String 일때


}