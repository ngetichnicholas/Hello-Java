import java.io.Console;
public class Music {
  public static void main(String[] args) {
    Console myConsole = System.console();
    myMusic("classical");
    String classical = myConsole.readLine();
    System.out.println("You truly like " + classical + " song in classical music");

    myMusic("pops");
    String pops = myConsole.readLine();
    System.out.println("You truly like " + pops + " song in pops in music");

  }

  public static void myMusic(String song) {
    System.out.println("Give your best song in " + song );
  }
  
}
