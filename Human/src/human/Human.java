package human;



public class Human {
   
    private final String skin_color = "White";
    private final String eye_color ="Blue";
    private final String gender = "Male";
    private final int height = 185;
    private final int weight = 75;
    private final int age = 20;
    private final String race = "American";
    private final String name = "Bert";
   
   
   
   
    public static void main(String[] agrs)
    {
       
        Human b =  new Human ();
        System.out.println(b.skin_color);
        System.out.println(b.eye_color);
        System.out.println(b.gender);
        System.out.println(b.height);
        System.out.println(b.weight);
        System.out.println(b.age);
        System.out.println(b.race);
        System.out.println(b.name);
        //run child
        Child a =  new Child();
        System.out.println(a.intelligence_rating);
        System.out.println(a.mood_rating);
        System.out.println(a.genetic_diseases[0]);
        System.out.println(a.wealth_rating);
       
       
    }
}  