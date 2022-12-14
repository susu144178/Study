public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //===================================
        // [형변환]
        // 묵시적: 자동 형변환.
        // 명시적: 강제 형변환.
        //===================================

        // 묵시적 형변환.
        {
            int i = 10;
            long l = i;

            System.out.println(l);
            System.out.println(i);

        }

        // 명시적 형변환.
        {
            //double d = 3.141592d;
            double d = 3;

            int i = (int)d;

            System.out.println(i);

        }


            //===============================
            // [연산자]
            //===============================
        {
            //** 산술 연산자
            // [+], [-], [*], [/], [%]

            // ** 대입 연산자
            // [=]

            int a = 4 + 3;
            int b = 4 - 3;
            int c = 4 * 3;
            int d = 4 / 3;
            int e = 4 % 3;

            // ** 산술 & 대입 연산자의 결합 사용

            // * 산술연산자 결합
            // [+=], [-=], [*=], [/=], [%=]

            // * 비트연산자 결합
            // [&=], [|=], [^=], [<<=], [>>=], [>>>=]


            // ** 증감연산자 (단항 연산자)
            // 1씩 증가 하거나, 1씩 감소하는 연산자.

            // ** 전위연산
            {
                int i = 0;
                System.out.println("전위연산 : " + (++i));
            }

            // ** 후위연산
            {
                int i = 0;
                System.out.println("후위연산 : " + (i++));
                System.out.println("후위연산 : " + i);
            }


            // ** 비교 연산자
            // [>], [<], [>=], [<=], [==], [!=]

            /*
            * a [>] b : a가 b보다 큰가
            * a [<] b : a가 b보다 작은가
            * a [>=] b : a가 b보다 크거나 같은가
            * a [<=] b : a가 b보다 작거나 같은가
            * a [==] b : a가 b와 같은가
            * a [!=] b : a가 b와 같지 않은가
            */


            // ** 논리 연산자
            // [&&], [||], [!], [&], [|]


            /* [&&] AND : 그리고 (A 그리고 B)
             * A와 B가 둘 다 true 인 경우에만 성립됨.
             * 예) (10 <= 20) && (10 >= 5) = true

             * [||] = OR : 또는 (A 또는 B)
             * A와 B중에 하나만 true 인 경우에도 성립이 된다.
             * 예) (10 <= 20) || (10 < 5) = true

             * [!] = NOT : 아니다 (!변수)
             * (!A) = A가 아니다.
             * (!B) = B가 아니다.
             * 예) !(10 < 5)

              ** 비트연산에 대한 논리적 개념
             * [&] : 그리고
             *   00011101 = 29
             * & 00000111 = 7
             * ------------
             *   00000101 = 5
             */


             /* [|] : 또는
             *   00011101 = 29
             * | 00000111 = 7
             * ------------
             *   00011111 = 31
             */



            // ** 비트 연산자
            //[&], [|], [~], [^], [<<], [>>], [>>>]

            // [&] = 그리고 (AND 연산자)
            // [|] = 또는 (OR 연산자)
            // [~] = 반전 연산자 (NOT 연산자)
            {
                int number = -10;
                System.out.println(~number + 1);
            }
            // [^] = 비트가 서로 다른 상태 일때 true (XOR 연산자)
            {
                int number1 = 1;
                int number2 = 3;

                /*
                int temp = number1;
                number1 = number2;
                number2 = temp;
                */

                // ** 변수를 새롭게 생성하지 않고 값을 스왑.
                number1 = number1 ^ number2;
                number2 = number1 ^ number2;
                number1 = number1 ^ number2;

                System.out.println("number1 : " + number1);
                System.out.println("number2 : " + number2);

            }
            // [<<], [>>], [>>>]
            {
                // 예1)
                // 2 - 1 =1
                // 2 + (-1) = 1;

                // 예2)
                // 5 - 10 = (-5)
                // 5 + (-10) = (-5)

                // image size
                // 만약 어떤 값에 절반에 해당하는 값으로 초기화를 해야 하는 경우
                //int x = 10/2;

                // 나누기 연산자를 사용하는 것보다 곱하기 연산자를 사용하는것이 효율적
                // int x = 10 * 0.5f;

                // 곱하기 연산자를 사용하는 것보다 쉬프트 연산자를 사용하는 것이 효율적
                int x = 10>>1;

                // ** [<<] = *2
                // ** [>>] = /2

                // [>>>] = 부호 변경 용도.
            }

            // ** 삼항 연산자
            {
                // 조건식 ? true : false

                int x = 1000;

                x = 100 < x ? 100 : x;
                System.out.println("x : " + x);
            }



            // ** 문자열 연산자  +
            System.out.println("문자열" + "출력");




        }
    }
}