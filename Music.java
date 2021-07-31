import java.io.Console;
public class Music {
  public static void main(String[] args) {
    myMusic("classical");


    myMusic("pops");

  }
  public static void myMusic(String song) {
    Console myConsole = System.console();

    System.out.println("Give your best song in " + song );
    String yourSong = myConsole.readLine();
    System.out.println("You truly like " + yourSong + " song in " + song + " music");
  }
  
}
