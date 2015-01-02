public class CarsAlgorithm {

  public static void main(String args[]) {
    // car 1
    double cost_1 = 15000.0;
    double mpg_1 = 10.0;
    
    // car 2
    double cost_2 = 30000.0;
    double mpg_2 = 50.0;

    double car_1_cost = cost_1 + gas_cost(mpg_1);
    double car_2_cost = cost_2 + gas_cost(mpg_2);
    
    System.out.println(car_1_cost);
    System.out.println(car_2_cost);
  }

  public static double gas_cost(double mpg) {
    double driving_distance = 50000;
    double gas_price = 4.0;
    return (driving_distance / mpg) * gas_price;
  }

}
