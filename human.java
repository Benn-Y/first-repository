
public class Human
{
    private String eyes;
    private String legs;
    private String hands;
    private String ears;
    private String hair;
    private String nose;
    private String name;
    
    // Constructor for objects of class Human
     
    public Human()
    {
        
        eyes = "blue";
        legs = "long";
        hands = "short";
        ears = "big";
        hair = "black";
        nose = "big";
        name = "Bismark";
    }

    public String walk(int steps, int minutes){
        int distance = steps * minutes;
        return "I have walked for " + distance / 100 + "meters.";
    }
    public String run(int minutes, int speed){
        int distance = speed * minutes;
        return "I have ran for " + distance / 100 + "meters";
    }
    public String sleep(int howLong, int currentTime, String timeOfDay){
        return "I am going to bed now. I will wake up at " + (currentTime + howLong) + timeOfDay;
    }
    public void eat(String whatFood){
        System.out.println("I will eat " + whatFood + ". You are invited:)");
    }
    public void describe(){
        // the bot will describe itself when this method is called.
        System.out.println("Hi there! My name is " + name + ".\nI have " + eyes + " eyes, " + nose + " nose and " + ears + " ears.");
        System.out.println("I have " + hair + " hair, " + hands + " hands and " + legs + " legs.");
        System.out.println("You can call my methods and see what I can do");
    }
}
