public class Rectangle {
    public int width;
    public int height;
    public Point origin;

    public Rectangle() {
        Point origin = new Point(0,0);
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int width, int height) {
        this.origin = new Point(0,0);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point p,int width,int height) {
        this.origin = p;
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y) {
        this.origin.x = x;
        this.origin.y = y;
    }

    public int getArea() {
        return this.width * this.height;
    }
}
