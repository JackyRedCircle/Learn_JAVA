// sout(print, println)


public class Day1 {
    public static void main(String[] args) {
        System.out.println(3*12); //println 사용 예
        int A = 5; //변수 저장 예
        System.out.println(A);// A 출력
        double pi = 3.14; // 실수 변수 저장
        final int B = 1; //상수처리 예
        char ch = 'A'; // 변수: ch, 리터럴: A
        String str = "abc";
        boolean value = true;//boolean 타입 예
        byte b = 127;// byte는 -128~127 까지
        String X = "Hello, ";
        String Y = "World.";
        String XY = X+Y;
        System.out.println(XY);//문자열의 더하기
        String Z = "";
        System.out.println(7+7+Z);
        System.out.println(Z+7+7);//정수 7을 문자열로 변환함.
        System.out.printf("%.3f",10d/3);//소숫점 3째자리 지시자. (d는 double 접미사)
        int age = 19;
        String sex = "남성";
        System.out.printf("안녕하세요./n 저는 OOO이고 나이는 %d살 이고,%n 저는 %s입니다.", age, sex); //순서대로 정수, 문자열지시자
//        참고로 println에서는 지시자 사용 불가능

    }
}
