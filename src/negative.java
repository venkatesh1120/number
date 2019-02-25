public class negative {



        public static void main(String[] args) {
            checkNumber(0);
            checkNumber(44);
        }


        public static void checkNumber(int number)  {

            if (number > 0) {

                System.out.println("positive");
            }
            else if (number < 0) {
                System.out.println("-ve");

            }
            else if (number == 0) {
                System.out.println("0");

            }

        }
    }
