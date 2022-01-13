import processing.core.PApplet;
class Circle  {
    private int speed ;
    public int HEIGHT ;
    PApplet p;
    public static final int DIAMETER = 10;
    public Circle(PApplet p, int circleheight) {

        this.HEIGHT=circleheight;
        this.p=p;
    }

    public void drawCircle(int x) {

        p.ellipse(speed, HEIGHT, DIAMETER, DIAMETER);
        speed=speed+x;

    }
}
