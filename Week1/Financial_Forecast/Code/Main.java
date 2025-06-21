public class Main {

  
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }

       
        return calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;  
        double annualGrowthRate = 0.08; 
        int years = 5;                  

        double futureValue = calculateFutureValue(initialValue, annualGrowthRate, years);

        System.out.printf("Future Value after %d years: INR %.2f\n", years, futureValue);
    }
}
