public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ================================
        // 1. char = 정수형이다.
        // 2. 각각의 데이터 타입의 형태로 출력됨.
        // * int 형 타입에 문자로 초기화를 진행 하더라도
        // 출력할 때에는 정수를 출력하고, char 타입에
        // 정수로 초기화를 하더라도 출력할 때에는 문자가 출력됨.
        // ================================

        char c1 = 'A';

        int i1 = c1;

        char c2 = 66;

        int i2 = c1 + i1;

        System.out.println(c1);
        System.out.println(i1);
        System.out.println(c2);
        System.out.println(i2);


        // ================================
        // 1. float  = 실수 값의 마지막에 f 붙혀준다.
        // 2. double = 실수 값의 마지막에 d 붙혀준다.
        // * double = 실수 값의 마지막에 d가 없더라도 double 타입으로 판단.
        // ================================

        float f = 3.141592653589793f;

        double d = 3.141592653589793d;
        double d2 = 3.141592653589793;

        System.out.println(f);
        System.out.println(d);
        System.out.println(d2);


        // ================================
        //  [상수와 리터럴]
        // ** final = 상수 선언에 사용되는 키워드
        // * 선언시에 최초 한번만 초기화 가능.
        // ================================

        final double PI = 3.141592;

        // ** 상수로 선언 해놓고 값을 다시 변경하려고 할 때 . . .
        // PI = 3.141592653589793; Error


        // ================================
        // [\n] = 줄바꿈
        // [\t] = 탭
        // [\\] = \
        // [\'] = '
        // [\"] = "
        // ================================

        System.out.println("문자열\n출력");
        System.out.println("문자열\t출력");
        System.out.println("문자열\\출력");
        System.out.println("\'문\' \'자\' \'열\'");
        System.out.println("\"문자열\" \"출력\"");


        // ================================
        // [변수의 범위]
        // 1. 특정 영역에서 생성된 변수는 해당 영역을 빠져나가면
        // 더이상 사용할 수 없다.
        //
        // 2. 영역이 다르다면 변수명을 동일하게 지을수 있음.
        //
        // 3. A라는 영역 내부에서 또 다른 B라는 영역을 포함 한다면
        // B 영역은 A 영역의 일부이다.
        // ================================

        int Number1 = 10;

        {
            int Number2 = 1000;
            Number1 = 100;
        }

        {
            int Number2 = 10000;
            Number1 = 1000;
        }


        System.out.println("Number1 : " + Number1);
        // System.out.println("Number2 : " + Number2); Err

















    }
}