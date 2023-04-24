public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"adorable", "adventurous", "aggressive",
                "amused", "angry", "annoyed",
                "annoying",	"anxious", "ashamed", "attractive"};
        String[] nouns = {"feet", "bananas", "hats", "classes",
                "stories", "lives", "men", "bongo", "chinchilla", "team"};

        System.out.println(nameGen(adjectives, nouns));
    }

    public static String nameGen(String[] adArry, String[] nArry){
        int randomAdj = (int) (Math.random() * 9);
        int randomNoun = (int) (Math.random() * 9);
        String ranAdj = adArry[randomAdj];
        String ranNoun = nArry[randomNoun];

        return "Here is your server name: " + ranAdj + "-" + ranNoun;
    }
}