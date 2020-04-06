public class BuilderDemo {
   public static void main(String[] args) {
   
      Mealb m = new Mealb();

      Meal vegMeal = m.VegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

}
}
