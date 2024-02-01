public class DiaceRoll73 {
    int DiaceRoll(){
        return (int) Math.ceil(Math.random()*6);
    }
    public static void main(String[] args) {
        DiaceRoll73 dice=new DiaceRoll73();
        System.out.println(dice.DiaceRoll());
    }
}
