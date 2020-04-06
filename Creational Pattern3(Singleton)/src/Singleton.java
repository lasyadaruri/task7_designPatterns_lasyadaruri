public class Singleton {
   private static Singleton s = new Singleton();
   private Singleton(){}
   public static Singleton getInstance(){
      return s;
   }

   public void show(){
      System.out.println("It's a singleton pattern type");
   }
}
