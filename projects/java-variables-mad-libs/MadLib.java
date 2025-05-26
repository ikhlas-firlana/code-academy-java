public class MadLibs {
    /*
      This program generates a mad libbed story.
      Author: Ikhlas
      Date: 05/26/2049
    */
    public static void main(String[] args){

        String name1 =  "Luso";
        String name2 =  "Mando";
        String noun1 =  "sword";
        String noun2 =  "axe";
        String noun3 =  "javelin";
        String noun4 =  "pickaxe";
        String noun5 =  "dagger";
        String noun6 =  "bow";
        String verb1 =  "run";
        String adjective1 =  "cold";
        String adjective2 =  "blue";
        String adjective3 =  "sad";
        String place1 =  "Ivalice";
        int number =  10;


        //The template for the story
        String story = "This morning " + name1 + " woke up feeling "+ adjective1 + ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
