public class MadLib {
public String classmate= "James";
public String city = "New Delhi";
public String noun = "tooth";
public String adjective = "strong";
public String pluralNoun = "Them";
public String pluralAnimal = "Cobras";
public String trueOrFalse = "False";
public double decimalBiggerThan1 = 9.9;
public int number1 = 7;
public int number2 = 3;
public int wholeNumberBetween1And4 = 2;
public String miltonTeacher = "Mrs. Anderson";
public String miltonDean = "Mrs. Sugrue";
public String letterGrade = "E";
public String season = "autumn";

    public static void main(String[] args) {
        System.out.println("Hello world!");
        MadLib myStory = new MadLib();
    } // main method

    public MadLib() {
        //constructor method
//define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";
//now print story to the dos window
        System.out.println(story);

        //define a string called story for mad lib


    }

}
