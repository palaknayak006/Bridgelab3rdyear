public class Ques10 {
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature 
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Ques10 obj = new Ques10();
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            
            System.out.print("Enter temperature (in Fahrenheit): ");
            double temperature = sc.nextDouble();

            System.out.print("Enter wind speed (in mph): ");
            double windSpeed = sc.nextDouble();
            double windChill = obj.calculateWindChill(temperature, windSpeed);
            System.out.println("The Wind Chill Temperature is: " + windChill);
        }
    }
}
