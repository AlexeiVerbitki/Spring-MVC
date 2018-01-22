
public class MovieTestDrive {
    public static void main (String [] args){
        Movie one = new Movie();
        one.Movienumber=1;
        one.title="Gone with the stock";
        one.genre= "Tragic";
        one.rating= -2;
        Movie two= new Movie();
        two.Movienumber=2;
        two.title="Lost in Cubicle Space";
        two.genre="Comedy";
        two.rating=5;
        Movie three= new Movie();
        three.Movienumber=3;
        three.title="Byte club";
        three.genre="Tragic but ultimately uplifting";
        three.rating=127;
        one.playIt();
        two.playIt();
        three.playIt();
    }
}
