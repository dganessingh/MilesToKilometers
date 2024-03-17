public class MilesToKilometers {
    public static void main(String[] args) throws Exception {
        double miles;
        
        for (miles = 1; miles < 11; miles++) {
            double kilometers = miles * 1.609;
            System.out.println(miles + " Miles = " + kilometers + " Kilometers");

        }


    }
}
