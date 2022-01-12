import processing.core.PApplet;

public class BallsProcessing extends  PApplet{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    private int x=0;
    private int y=0;
    private int z=0;
    private int w=0;

    public static void main(String[] args) {
        PApplet.main("BallsProcessing",args);
    }
    @Override
    public void settings(){
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        drawCircle1();


    }

    private void drawCircle1() {

        ellipse(x,HEIGHT/5,DIAMETER,DIAMETER);
        x++;
        ellipse(y,(2*HEIGHT)/5,DIAMETER,DIAMETER);
        y=y+2;
        ellipse(z,(3*HEIGHT)/5,DIAMETER,DIAMETER);
        z=z+3;
        ellipse(w,(4*HEIGHT)/5,DIAMETER,DIAMETER);
        w=w+4;
    }

    private void paintWhite() {
        background(255);
    }
}
