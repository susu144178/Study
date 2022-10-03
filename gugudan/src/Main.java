public class Main {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 2 ; i < 10 ; ++i)
        {
            System.out.println("(" + i + ") 단");

            for (int j = 1; j < 10 ; ++j)
            {
                num = i * j;
                if (num % 2 == 1)
                {
                    System.out.println(i + "*" + j + "=" + num);
                }
            }


            }
            System.out.println("\n");

        }




    }

