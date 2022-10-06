public class Main {
    public static void main(String[] args) {
        {
        int[] numbers = new int[10];

        int index = 0;

        while(true)
        {
            boolean Check = true;

            int num = (int)((Math.random()) * 100 + 1);

            for(int i =0; i < numbers.length; ++i)
                if(numbers[i] == num)
                {
                    Check = false; break;
                }

            if(Check == true)
            {
                numbers[index] = num;
                ++index;
            }

            if(index == 10) break;
        }


        /*
        for(int i =0; i < numbers.length; ++i)
            System.out.println(numbers[i]);

         */


        //===============================================[버블]

            /*
            for(int i = 0; i < numbers.length + 1; ++i)
            {
                for(int j = (i + 1); j < numbers.length; ++j)
                {
                    if(numbers[i] > numbers[j])
                    {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }

            for(int element : numbers)
                System.out.println(element);

             */

            //====================================[선택]

            for(int i = 0; i < numbers.length; i++)
            {
                for(int j = (i + 1); j < numbers.length; j++)
                {
                    if(numbers[i] < numbers[j])
                    {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            for(int element : numbers)
                System.out.println(element);


        }






    }
}