package oop.equals;


public class EqualsTest {
    public static void main(String[] args) {
        Integer num1 = 128;
        Integer num2 = 128;

        String str1 = "string";
        String str2 = "string";

        /* 값을 비교하려면 == 말고 equals() 사용
        * Wrapper 클래스는 클래스이기 때문에 == 하게되면 주소값 비교가 된다.
        * Wrapper 클래스에서는 이미 equals()를 오버라이딩하고 있기때문에 값 비교로 바로 사용가능
        * */
        System.out.println(num1.equals(num2));
        System.out.println(str1.equals(str2));
    }


}
