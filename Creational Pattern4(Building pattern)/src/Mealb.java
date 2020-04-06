public class Mealb{
	public Meal VegMeal(){
      Meal m = new Meal();
      m.addItem(new Vegburger());
      m.addItem(new Thumsup());
      return m;
   }   
}
