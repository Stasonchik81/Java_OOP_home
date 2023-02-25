package classes.Other;
/**
 * Это точка
 */
public class Point2D {
    private int x, y; //Координаты Х и Y
    /**
     * Это конструктор точки
     * @param valueX координата Х
     * @param valueY координата Y
     */
    public Point2D(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }
    public Point2D(int value){
        this(value, value);
    }
    public Point2D(){
        this(0);
    }
    public Integer getX(){
        return x;
    }
    public Integer getY(){
        return y;
    }
    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }

    private String getInfo(){
        return String.format("x: %d;\ny: %d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }
}
