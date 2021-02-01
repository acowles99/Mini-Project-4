import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //scanner used to collect information about the movie theater

    System.out.println("You have $20 to spend on the movie ticket and concessions");
    System.out.println("\n");
    
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    
    System.out.println("What movie are you watching? ($7)");
    String movieName = scan.next();

    System.out.println("What time will you be watching the movie? (don't include a colon)");
    int movieTime = scan.nextInt();

    System.out.println("Will you be buying any food? ($5) True or False:");
    boolean food = scan.nextBoolean();

    int totalMoney = 20;
    int movieCost = 7;
    int foodCost = 5;
    int money2 = totalMoney - movieCost;

    //line to separate the chunks
    System.out.println("\n");


    //returns for all the methods
    System.out.println(greeting(name));
    System.out.println(movie1(movieName));

    System.out.println("Your movie will begin at " + movieTime);

    boolean food1 = concessions(food);
    System.out.println("Food: " + food1);

    System.out.print("Your change is $");
    System.out.println(money(foodCost, money2, food));
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


  //method for food
  static boolean concessions(boolean food)
  {
    boolean snacks = food;
    return snacks; 
  }

  //method for concessions money
  
  static int money(int foodCost, int money2, boolean food)
  {
    boolean snacks = food;
    if(snacks)
    {
      money2 = money2 - foodCost;
    }
    return money2;
  }

  //method for goodbye
  static String goodbye(String name)
  {
    String bye = "We hope you enjoy your movie " + name;
    return bye;
  }
}