public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        
        }
        

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
      
      System.out.println("Hello, I am " + firstName + " " + lastName + ",and I am " + age + " years old.");

      System.out.println("                           ");
// extra bc why not :)

      System.out.println(" Let's do some fun questions!");
      
        // Print out whether age is even
      
System.out.println(" True or False, my age is odd?! Answer: ");
  boolean years = 15%2 == 1;
      System.out.println(years);
      
        // Print out whether firstName equals lastName

      System.out.println(" True or False, my first name is NOT equal to my last name?! " + firstName.equals(lastName));
      
        // Print out whether age is greater than 0

    System.out.println("True or False, my age is greater than zero?! ");
      boolean duh = 15>0;
      System.out.println(duh);
    System.out.print("duh silly!");
    }
}
