
    import java.io.Console;

    public class Meals {
      public static void main(String[] args) {
        Console myConsole = System.console();
        askWhatYouAteFor("breakfast");
        String yourBreakfast = myConsole.readLine();
        System.out.println("You had " + yourBreakfast + " for breakfast.");

        askWhatYouAteFor("lunch");
        String yourLunch = myConsole.readLine();
        System.out.println("You had " + yourLunch + " for lunch.");

        askWhatYouAteFor("dinner");
        String yourDinner = myConsole.readLine();
        System.out.println("You had " + yourDinner + " for dinner.");
      }

      public static void askWhatYouAteFor(String meal) {
        System.out.println("What did you eat for " + meal + "?");
      }


    }
  