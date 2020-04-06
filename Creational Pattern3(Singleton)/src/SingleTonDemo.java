public class SingleTonDemo{
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      Singleton obj = Singleton.getInstance();
      obj.show();
   }
}
