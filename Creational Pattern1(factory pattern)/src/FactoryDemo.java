public class FactoryDemo {

   public static void main(String[] args) {
      ShapeDemo sd = new ShapeDemo();
      Shape shape1 = sd.getShape("CIRCLE");
      shape1.draw();
      Shape shape2 = sd.getShape("RECTANGLE");
      shape2.draw();
   }
}
