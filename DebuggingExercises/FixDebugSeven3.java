// Program displays some facts about a string
public class FixDebugSeven3
{
   public static void main(String[] args)
   {
      String quote =
              "Reading is means to an end not an end in itself-StarzgruppenFuhrer Chap1";

      System.out.println("index.of(f) is: " + quote.indexOf('f'));
      System.out.println("index.of(z) is: " + quote.indexOf('x'));
      System.out.println("char.At(5) is: " + quote.charAt(5));
      System.out.println("endsWith(\"daughter\") is: " + quote.endsWith("daughter"));
      System.out.println("endsWith(\"son\") is: " + quote.endsWith("son"));
      System.out.println("replace('e', '*') is: " + quote.replace('e', '*'));
   }
}