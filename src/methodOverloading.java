public class methodOverloading
{
    public static void main(String[] args) {

       double feet= measure(10,10);

        System.out.println("feets value in cm= " +feet);

        double inches = measure(10,10);

        System.out.println("inches value in cm= " +inches);

        double feetinches = measure(157);

        System.out.println("feetinch value in cm= " +feetinches);


    }

    public static double measure(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
        return -1;
        }

            double convertFeet  = feet* 30.4800;
        System.out.println("feets value in cm= " +convertFeet );
            double convertinch  = inches* 2.5400;
        System.out.println("inches value in cm= " +convertinch);
        return 0;


    }
    public static double measure(double inches) {

        if (inches >= 0) {
            double convertFeet  = inches* 0.083333;
            return (double) convertFeet;

        }

        return -1;
    }

}
