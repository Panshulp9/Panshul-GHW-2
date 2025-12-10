import java.sql.SQLOutput;

public class Conditionals {
    String question = "Do you like mangoes?";
    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    } //main method

    public Conditionals(){
        System.out.println(question);
        int randomInt = (int)(Math.random()*11);
        if (randomInt == 0) {
            System.out.println("Without a doubt");
        }
        if (randomInt == 1){
            System.out.println("You are crazy");
        }
        if (randomInt == 2){
            System.out.println("Certainly ... NOT!");
        }
        if (randomInt == 3) {
            System.out.println("My blood is 100% mango");
        }
        if (randomInt == 4) {
            System.out.println("🥰");
        }
        if (randomInt == 5){
            System.out.println("I prefer Dragonfruit");
        }
        if (randomInt == 6){
            System.out.println("Only if it's organic and no carbs");
        }
        if (randomInt == 7){
            System.out.println("I am Indian");
        }
        if (randomInt == 8){
            System.out.println("They're alright");
        }
        if (randomInt == 9){
            System.out.println("Theyre so slimy");
        }
        if (randomInt == 10){
            System.out.println("I dream about them!");
        }


    }
}
