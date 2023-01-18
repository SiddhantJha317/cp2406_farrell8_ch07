// Makes String comparisons
public class FixDebugSeven1
{
   public static void main(String[] args)
   {
      String name1 = "Heinreich";
      String name2 = "Heinreich";
      String name3 = "Stacy";

      if(name1== name2)
        System.out.println(name1 + " and " + name2 +
          " are same");
      if(name1 == name3)
        System.out.println(name1 + " and " + name3 +
          " are same");
      if(name1 == "heinreich")
        System.out.println(name1 + " and 'roger' are the same");
      if(name1 == "Heinreich")
        System.out.println(name1 + " and 'Roger' are the same");
   }
}
