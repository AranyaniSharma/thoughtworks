import processing.core.PApplet;

public class BallsOOPSProcessing extends PApplet  {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    public static final int CIRCLEHEIGHT = HEIGHT/5;
    public static final int DIAMETER = 10;
    private int x=0;
    private int y=0;
    private int z=0;
    private int w=0;

    public static void main(String[] args) {
        PApplet.main("BallsOOPSProcessing",args);
    }
    @Override
    public void settings(){
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {

        ellipse(x,CIRCLEHEIGHT,DIAMETER,DIAMETER);
        x++;
        ellipse(y,2*CIRCLEHEIGHT,DIAMETER,DIAMETER);
        y=y+2;
        ellipse(z,3*CIRCLEHEIGHT,DIAMETER,DIAMETER);
        z=z+3;
        ellipse(w,4*CIRCLEHEIGHT,DIAMETER,DIAMETER);
        w=w+4;
    }

}
