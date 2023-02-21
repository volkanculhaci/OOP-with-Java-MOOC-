
public class Main {

  public static void main(String[] args) {
    // This is just an empty main method, where you can test your
    // Song class. You can for instance try this:

    Song garden = new Song("In The Garden", 10910);
    Song song2 = new Song("Songname 2", 123123);
    System.out.println("The song " + garden.name() + " has a length of " +
        garden.length() + " seconds.");
    System.out.println("The song " + song2.name() + " has a length of " +
        song2.length() + " seconds.");

  }
}
