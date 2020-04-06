public class AbstractFactoryDemo {
   public static void main(String[] args) {
      AbstractFactoryPattern shapeFactory = Producer.getFactory(false);
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      shape1.draw();
      Shape shape2 = shapeFactory.getShape("SQUARE");
      shape2.draw();
      AbstractFactoryPattern shapeFactory1 = Producer.getFactory(true);
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      shape3.draw();
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      shape4.draw();
      
   }
}
