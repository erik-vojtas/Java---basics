public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (this.width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        } if (this.length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }


    }

//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width * this.length;
    }



}
