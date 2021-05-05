public class Hotel {

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate,double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double finalPrice = listedMealPrice + tip +tax;
        return finalPrice;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(50, 0.10, 0.12);
        System.out.println("Your total meal price is " + groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println("Each person pays: "+ individualMealPrice);
    }
}
