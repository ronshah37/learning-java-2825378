public class Hotel {

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate,double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double finalPrice = listedMealPrice + tip +tax;
        System.out.println("Your total meal price is " + finalPrice);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(50, 0.10, 0.12);
    }
}
