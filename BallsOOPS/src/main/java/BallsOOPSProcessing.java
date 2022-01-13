import processing.core.PApplet;

public class BallsOOPSProcessing extends PApplet  {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    public static final int CIRCLEHEIGHT = HEIGHT / 5;
    public static final int DIAMETER = 10;
    private int x = 1;
    Circle c1,c2,c3,c4;

    public static void main(String[] args) {
        PApplet.main("BallsOOPSProcessing",args);
    }
    @Override
    public void settings(){
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        c1=new Circle(this,CIRCLEHEIGHT);
        c2=new Circle(this,2*CIRCLEHEIGHT);
        c3=new Circle(this,3*CIRCLEHEIGHT);
        c4=new Circle(this,4*CIRCLEHEIGHT);



    }

    @Override
    public void draw() {
        c1.drawCircle(1);
        c2.drawCircle(2);
        c3.drawCircle(3);
        c4.drawCircle(4);
    }

}
