public class byteConvert {


    public static void main (String[] args) {

        megaBytecovert(15004443);

    }
    public static void megaBytecovert(int kiloByte) {

        if(kiloByte > 0){
            int calculate = kiloByte / 1000;
            double kk = kiloByte % 1000;

            System.out.println("no of kilobyte"+kiloByte +"mb = " +calculate +"MB" +kk +"KB");
        }
        else {
            System.out.println("value is zero");
        }

    }


}

