package MianXiangDuiXiang.MianXiangDuiXiangPractice.poluMorphicExercise.Exercise2;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width+height;
    }
}
