public class Main {
    public static void main(String[] args) {
    fighter F1 =new fighter("naim",50,80,100,60);
    fighter F2 = new fighter("tobiash",40,70,87,10);
    Match match=new Match(F1,F2,85,100);
    match.posibility();
    match.run();


    }
}