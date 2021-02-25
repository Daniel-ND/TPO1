package daniel.tpo.Domain;

public class DrawableObject {
    private String name;
    private int height;
    private int width;
    private Coordinates coordinates;

    public DrawableObject(String name, int width, int height, Coordinates coordinates) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.coordinates = coordinates;
    }

    public void move(int xOffset, int yOffset) {
        this.coordinates.setX(coordinates.getX() + xOffset);
        this.coordinates.setY(coordinates.getY() + yOffset);
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
