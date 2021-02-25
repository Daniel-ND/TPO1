package daniel.tpo.Domain;

import java.util.ArrayList;

public class Screen {
    private int height;
    private int width;

    ArrayList<DrawableObject> screenObjects;


    public Screen(int width, int height) {
        this.height = height;
        this.width = width;
        screenObjects = new ArrayList<>();
    }

    public int getAmountOfObjects() {
        return screenObjects.size();
    }

    public void addObject(DrawableObject object) {
        screenObjects.add(object);
    }

    public ArrayList<DrawableObject> getScreenObjects() {
        return screenObjects;
    }

    public ArrayList<DrawableObject> getVisibleScreenObjects() {
        var visibleScreenObjects = new ArrayList<DrawableObject>();
        for (int i = 0; i < screenObjects.size(); i++) {
            DrawableObject curObject = screenObjects.get(i);
            if (curObject.getCoordinates().getX() + curObject.getWidth() >= 0
                    && curObject.getCoordinates().getY() + curObject.getHeight() >= 0
                    && curObject.getCoordinates().getX() < this.width
                    && curObject.getCoordinates().getY() < this.width)
                visibleScreenObjects.add(curObject);
        }
        return visibleScreenObjects;
    }
}
