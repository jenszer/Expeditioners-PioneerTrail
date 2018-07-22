/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.model.Inventory;
import pioneertrail.model.Location;
import pioneertrail.model.Map;
import pioneertrail.model.Question;
import pioneertrail.model.Scene;
import pioneertrail.model.SceneType;

/**
 *
 * @author Jacob Enszer & Ariel George
 */
public class MapControl {

     public static Location[][] createLocations(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            return null;
        }
        Location[][] locations = new Location[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Location location = new Location();
                location.setRow(row);
                location.setColumn(column);
                location.setVisited(true);
                locations[row][column] = location;
                }
        }
        return locations;
    }

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[7];

        scenes[SceneType.Nauvoo.ordinal()] = new Scene();
        scene1.setName("Nauvoo");
        scene1.setDescription("As the Latter-day Saints fled Missouri"
                + "during the winter of 1838–1839, having been threatened"
                + " by the governor of that state with extermination,"
                + " they crossed into Illinois and settled in a swampy "
                + "area along the Mississippi River that they named Nauvoo.");
        scene1.setSceneSymbol("NV");
        question.setQuestion("Which river did the Saints follow?");
        question.setAnswerOne("Nile River");
        question.setAnswerTwo("Mississippi River");
        question.setAnswerThree("Spanish River");
        question.setAnswerFour("Mini River");
        question.setConrrectAnswer(2);
        

        scenes[SceneType.SugarCreek.ordinal()] = new Scene();
        scene2.setName("Sugar Creek");
        scene2.setDescription("This first major campsite in Iowa, about"
                + " seven miles inland from the Mississippi River, served"
                + " an estimated 2,000 people in February 1846, including "
                + "most of the Church leadership. It was known as the "
                + "'Camp of Israel.'");
        scene2.setSceneSymbol("SC");
        question.setQuestion("What was the name of the first major campsite that the Saints were at in Iowa?");
        question.setAnswerOne("Hong Kong");
        question.setAnswerTwo("Utah");
        question.setAnswerThree("Sugar Creek");
        question.setAnswerFour("San Diego");
        question.setConrrectAnswer(3);
        

        scenes[SceneType.Richardsons.ordinal()] = new Scene();
        scene3.setName("Richardson's Point");
        scene3.setDescription("Suffering through ten days of downpour, the"
                + " Camp of Israel stalled here while awaiting improved "
                + "weather. ");
        scene3.setSceneSymbol("NV");
        question.setQuestion("When the word 'downpour' is used, what is the weather?");
        question.setAnswerOne("Rain");
        question.setAnswerTwo("Sunny");
        question.setAnswerThree("Partly Cloudy");
        question.setAnswerFour("Cloudy");
        question.setConrrectAnswer();

        scenes[SceneType.CharitonRiver.ordinal()] = new Scene();
        scene4.setName("Chariton River Crossing");
        scene4.setDescription("The main body of the pioneers chose to remain"
                + " at Chariton to wait out some of the worst weather of the "
                + "Iowa crossing.");
        scene4.setSceneSymbol("CR");
        question.setQuestion("Which of the following is NOT a type of bread?");
        question.setAnswerOne("Rye");
        question.setAnswerTwo("White");
        question.setAnswerThree("Sourdough");
        question.setAnswerFour("Water");
        question.setConrrectAnswer(4);
        

        scenes[SceneType.LocustCreek.ordinal()] = new Scene();
        scene5.setName("Locust Creek");
        scene5.setDescription("At or near this campsite William Clayton "
                + "reportedly penned the words to the song 'All is Well',"
                + " after receiving word that his wife, Diantha, still in"
                + " Nauvoo, had given birth to a healthy baby boy.");
        scene5.setSceneSymbol("LC");
        question.setQuestion("What was the song written at this campsite?");
        question.setAnswerOne("Sweet Home Alabama");
        question.setAnswerTwo("Tounge-Tied");
        question.setAnswerThree("I am a Child of God");
        question.setAnswerFour("All is Well");
        question.setConrrectAnswer(4);

        
        scenes[SceneType.GardenGrove.ordinal()] = new Scene();
        scene6.setName("Garden Grove");
        scene6.setDescription("Church leaders decided to create a substantial"
                + " camp at this site, a sort of temporary settlement to serve"
                + " the thousands of weary and destitute pilgrims who would "
                + "yet come this way.");
        scene6.setSceneSymbol("GG");
        question.setQuestion("What is another important Grove in Church History?");
        question.setAnswerOne("The Sacred Grove");
        question.setAnswerTwo("The Russian Grove");
        question.setAnswerThree("The Silent Grove");
        question.setAnswerFour("The Spanish Grove");
        question.setConrrectAnswer(1);
        

        scenes[SceneType.NishnabotnaRiver.ordinal()] = new Scene();
        scene7.setName("Nishnabotna River Crossing");
        scene7.setDescription("The crossing of the Nishnabotna marks the "
                + "meeting of two refugee peoples, the Latter-day Saints "
                + "and the Pottawattamie Indians.");
        scene7.setSceneSymbol("NR");
        question.setQuestion("How many refugees did the Saints find at this location?");
        question.setAnswerOne("1,000");
        question.setAnswerTwo("2");
        question.setAnswerThree("77");
        question.setAnswerFour("none, there were no refugees");
        question.setConrrectAnswer(2);
        
        
        scenes[SceneType.GrandEncampment.ordinal()] = new Scene();
        scene8.setName("Grand Encampment");
        scene8.setDescription("This place was probably quite nice.");
        scene8.setSceneSymbol("GE");
        question.setQuestion("What is a popular Canyon in the United States?");
        question.setAnswerOne("Austrailian Canyon");
        question.setAnswerTwo("Blue Canyon");
        question.setAnswerThree("The Grand Canyon");
        question.setAnswerFour("Pickle Canyon");
        question.setConrrectAnswer(3);
        
        
        scenes[SceneType.CouncilBluffs.ordinal()] = new Scene();
        scene9.setName("Council Bluffs");
        scene9.setDescription("Council Bluffs is a place the Saints were at.");
        scene9.setSceneSymbol("CB");
        question.setQuestion("What is one thing the Saints did NOT have on their trek?");
        question.setAnswerOne("Air Conditioning");
        question.setAnswerTwo("Trials");
        question.setAnswerThree("Tears");
        question.setAnswerFour("Hope");
        question.setConrrectAnswer(1);
        
        
        scenes[SceneType.WinterQuarters.ordinal()] = new Scene();
        scene10.setName("Winter Quarters");
        scene10.setDescription("Winter Quaters was extrememly cold.");
        scene10.setSceneSymbol("WQ");
        question.setQuestion("What is something used to keep you warm?");
        question.setAnswerOne("An Eraser");
        question.setAnswerTwo("A Blanket");
        question.setAnswerThree("The State of Wyoming");
        question.setAnswerFour("Flip-Flops");
        question.setConrrectAnswer(2);
        
        
        scenes[SceneType.ElkhornRiver.ordinal()] = new Scene();
        scene11.setName("Elkhorn River");
        scene11.setDescription("Rivers are quite nice in the summer months.");
        scene11.setSceneSymbol("ER");
        question.setQuestion("Which of the following is a kind of Melon?");
        question.setAnswerOne("Honey Dew");
        question.setAnswerTwo("Rice");
        question.setAnswerThree("Pizza");
        question.setAnswerFour("Russia");
        question.setConrrectAnswer(1);
        
        
        scenes[SceneType.PlatteRiver.ordinal()] = new Scene();
        scene12.setName("Platte River");
        scene12.setDescription("The crossing of the Platte River was important.");
        scene12.setSceneSymbol("PR");
        question.setQuestion("Which chess piece can only move diagonally?");
        question.setAnswerOne("King");
        question.setAnswerTwo("Pawn");
        question.setAnswerThree("Queen");
        question.setAnswerFour("A bishop");
        question.setConrrectAnswer(4);
        
        
        scenes[SceneType.FortKearney.ordinal()] = new Scene();
        scene13.setName("Fort Kearney");
        scene13.setDescription("When painting, knowing the colors is important.");
        scene13.setSceneSymbol("FK");
        question.setQuestion("Which of the following is NOT one of "
                + "the three primary colours?");
        question.setAnswerOne("Red");
        question.setAnswerTwo("Green");
        question.setAnswerThree("Yellow");
        question.setAnswerFour("Blue");
        question.setConrrectAnswer(2);
        
        
        scenes[SceneType.ConfluencePoint.ordinal()] = new Scene();
        scene14.setName("Confluence Point");
        scene14.setDescription("99% of all colorblind people are not really "
                + "color blind but color deficient; the term color blindness "
                + "is misleading.");
        scene14.setSceneSymbol("CP");
        question.setQuestion("What sweet food made by bees using nectar from flowers?");
        question.setAnswerOne("Celery");
        question.setAnswerTwo("Rice");
        question.setAnswerThree("Honey");
        question.setAnswerFour("Cake");
        question.setConrrectAnswer(3);
        
        
        scenes[SceneType.AshHollow.ordinal()] = new Scene();
        scene15.setName("Ash Hollow");
        scene15.setDescription("About 8% of all men are suffering from color "
                + "blindness.");
        scene15.setSceneSymbol("AH");
        question.setQuestion("What colour are Smurfs?");
        question.setAnswerOne("Yellow");
        question.setAnswerTwo("Green");
        question.setAnswerThree("Blue");
        question.setAnswerFour("Orange");
        question.setConrrectAnswer(3);
        
        
        scenes[SceneType.ChimneyRock.ordinal()] = new Scene();
        scene16.setName("Chimney Rock");
        scene16.setDescription("The colors of the Rainbow can be listed in an "
                + "acroynm ROYGBIV");
        scene16.setSceneSymbol("CR");        
        question.setQuestion("According to ROYGBIV many colours are in a rainbow?");
        question.setAnswerOne("13");
        question.setAnswerTwo("7");
        question.setAnswerThree("56");
        question.setAnswerFour("9");
        question.setConrrectAnswer(2);
        
        
        scenes[SceneType.ScottsBluff.ordinal()] = new Scene();
        scene17.setName("Scotts Bluff");
        scene17.setDescription("The distance around a circle called the "
                + "Circumference");
        scene17.setSceneSymbol("SB");        
        question.setQuestion("What is the distance around a circle called?");
        question.setAnswerOne("Tears");
        question.setAnswerTwo("Volume");
        question.setAnswerThree("Area");
        question.setAnswerFour("Circumference");
        question.setConrrectAnswer(4);
        
                
        scenes[SceneType.FortLaramie.ordinal()] = new Scene();
        scene18.setName("Fort Laramie");
        scene18.setDescription("There are 30 days in the month of June.");
        scene18.setSceneSymbol("FL");        
        question.setQuestion("How many days are there in June?");
        question.setAnswerOne("30");
        question.setAnswerTwo("31");
        question.setAnswerThree("36");
        question.setAnswerFour("52");
        question.setConrrectAnswer(1);
        
                
        scenes[SceneType.SweetwaterRiver.ordinal()] = new Scene();
        scene19.setName("Sweetwater River");
        scene19.setDescription("There are 52 weeks in a year.");
        scene19.setSceneSymbol("SR");        
        question.setQuestion("How many weeks are in a calendar year?");
        question.setAnswerOne("365");
        question.setAnswerTwo("12");
        question.setAnswerThree("52");
        question.setAnswerFour("Russia");
        question.setConrrectAnswer(3);
        
                
        scenes[SceneType.IndependenceRock.ordinal()] = new Scene();
        scene20.setName("Independence Rock");
        scene20.setDescription("Leap years happen every 4 years.");
        scene20.setSceneSymbol("IR");        
        question.setQuestion("How many days are in a year that isn't a leap"
                + "year?");
        question.setAnswerOne("60");
        question.setAnswerTwo("365");
        question.setAnswerThree("724");
        question.setAnswerFour("18");
        question.setConrrectAnswer(2);
        
                
        scenes[SceneType.FortBridger.ordinal()] = new Scene();
        scene21.setName("Fort Bridger");
        scene21.setDescription("An estimated 12% of the English vocabulary has "
                + "Greek origin. According to one estimate, more than 150,000 "
                + "words of English are derived from Greek words. Greek has "
                + "contributed to English in several ways, including direct "
                + "borrowings from Greek and indirectly through other languages"
                + "(mainly Latin or French).");
        scene21.setSceneSymbol("FB");        
        question.setQuestion("How many legs does a centipede have?");
        question.setAnswerOne("13");
        question.setAnswerTwo("100");
        question.setAnswerThree("59");
        question.setAnswerFour("8");
        question.setConrrectAnswer(2);
        
                
        scenes[SceneType.EchoCanyon.ordinal()]= new Scene();
        scene22.setName("Echo Canyon ");
        scene22.setDescription("The word \"Baptism\" is a transliteration of "
                + "the Greek word BAPTIZO which means to immerse.");
        scene22.setSceneSymbol("EC");        
        question.setQuestion("Who was baptized despite being perfect?");
        question.setAnswerOne("James");
        question.setAnswerTwo("Saul");
        question.setAnswerThree("Paul");
        question.setAnswerFour("Jesus");
        question.setConrrectAnswer(4);
        
                
        scenes[SceneType.GoldenPassRoad.ordinal()] = new Scene();
        scene23.setName("Golden Pass Road ");
        scene23.setDescription("Jesus had 12 apostles.");
        scene23.setSceneSymbol("GPR");        
        question.setQuestion("Which of the following was NOT one of the "
                + "first 12 apostles?");
        question.setAnswerOne("Peter");
        question.setAnswerTwo("Arthur");
        question.setAnswerThree("James");
        question.setAnswerFour("John");
        question.setConrrectAnswer(2);
        
                
        scenes[SceneType.EmigrationCanyon.ordinal()] = new Scene();
        scene24.setName("Emigration Canyon");
        scene24.setDescription("Leonardo da Vinci was a very famous artist who"
                + "painted the Mona Lisa.");
        scene24.setSceneSymbol("EMC");
        question.setQuestion("Who painted the Mona Lisa?");
        question.setAnswerOne("Russia");
        question.setAnswerTwo("The Man in Blue");
        question.setAnswerThree("Leonardo da Vinci");
        question.setAnswerFour("Leonardo DiCaprio");
        question.setConrrectAnswer(3);
             
        
        scenes[SceneType.Zion.ordinal()] = new Scene();
        scene25.setName("Zion");
        scene25.setDescription("You have arrived to Zion!");
        scene25.setSceneSymbol("Z");
        question.setQuestion("How does it feel?");
        question.setAnswerOne("Russia");
        question.setAnswerTwo("Russia");
        question.setAnswerThree("Russia");
        question.setAnswerFour("Russia");
        question.setConrrectAnswer();
        

        return scenes;
    }

    public static Question[] createQuestions() {
        System.out.println("Print Questions");
         return null;
    }

    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        System.out.println("Assign Questions To Scenestub");
    }

    public static void assignScenesToLocation(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.Nauvoo.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.SugarCreek.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.Richardsons.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.CharitonRiver.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.LocustCreek.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.GardenGrove.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.NishnabotnaRiver.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.GrandEncampment.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.CouncilBluffs.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.WinterQuarters.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.ElkhornRiver.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.PlatteRiver.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.FortKearney.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.ConfluencePoint.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.AshHollow.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.ChimneyRock.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.ScottsBluff.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.FortLaramie.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.SweetwaterRiver.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.IndependenceRock.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.FortBridger.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.EchoCanyon.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.GoldenPassRoad.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.EmigrationCanyon.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.Zion.ordinal()]);
      
    }

    public static void movePlayerToStartingLocation(Map map) {
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int Row, int Column) {
        map.setLocations(map.getLocations());
        map.getCurrentRow();
        map.getCurrentColumn();
        map.setVisited(true);
    }

}