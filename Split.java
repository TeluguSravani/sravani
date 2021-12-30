public class Split {
    public static void main(String[] args){
        String skin = "welcome to java world";
        String[] words = skin.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
}}
