public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        System.out.println("Empty constructor called");
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int xValue) {
        this.x = xValue;
    }

    public void setY(int yValue) {
        this.y = yValue;
    }

    public double distance() {
        Point another = new Point(0,0);
        return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
    }

    public double distance(int xValue, int yValue) {
        Point another = new Point(xValue, yValue);
        return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
    }

    public double distance (Point another) {
        return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
    }

}
