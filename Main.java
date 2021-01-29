import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //scanner used to collect information about the movie theater
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    
    System.out.println("What movie are you watching?");
    String movieName = scan.next();

    System.out.println("What time will you be watching the movie? (don't include a colon)");
    int movieTime = scan.nextInt();

    System.out.println("Will you be buying any food? True or False:");
    boolean food = scan.nextBoolean();

    System.out.println("Will you be buying any drinks? True or False:");
    boolean drink = scan.nextBoolean();

    //line to separate the chunks
    System.out.println("\n");


    //returns for all the methods
    System.out.println(greeting(name));
    System.out.println(movie1(movieName));

    int timing = time(movieTime);
    System.out.println("Your movie will begin at " + timing);

    boolean food1 = concessions(food);
    System.out.println("Food: " + food1);

    boolean drink1 = concessions2(drink);
    System.out.println("Beverages: " + drink1);

    System.out.println(goodbye(name));

  }

  //method for their name and greeting
  static String greeting(String name)
  {
    String hello = "Hello, and welcome to Highwoods 20 " + name;
    return hello;
  }

  //method for the movie name
  static String movie1(String movieName)
  {
    String movie = "The movie you are seeing is: " + movieName;
    return movie;
  }

  //method for the movie time
  static int time(int movieTime)
  {
    int timing = movieTime;
    return timing;
  }

  //method for food
  static boolean concessions(boolean food)
  {
    boolean snacks = food;
    return snacks; 
  }
  
  //method for drinks
  static boolean concessions2(boolean drink)
  {
    boolean drinks = drink;
    return drinks; 
  }

  //method for goodbye
  static String goodbye(String name)
  {
    String bye = "We hope you enjoy your movie " + name;
    return bye;
  }
}