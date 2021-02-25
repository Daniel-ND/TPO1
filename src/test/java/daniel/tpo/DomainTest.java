package daniel.tpo;

import daniel.tpo.Domain.Coordinates;
import daniel.tpo.Domain.DrawableObject;
import daniel.tpo.Domain.Screen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DomainTest {
    DrawableObject star;
    DrawableObject binaryStars;
    DrawableObject moon;
    Screen screen;

    @BeforeEach
    void setup() {
        screen = new Screen(40, 20);
        star = new DrawableObject("Звезда", 1, 1, new Coordinates(0, 0));
        binaryStars = new DrawableObject("Бинарное скопление звёзд", 2, 3, new Coordinates(-5, -5));
        moon = new DrawableObject("Полумесяц", 1, 2, new Coordinates(5, 10));
    }

    @AfterEach
    void clean() {
        screen = null;
        star = null;
        binaryStars = null;
        moon = null;
    }

    @Test
    void test(){
        screen.addObject(star);
        screen.addObject(binaryStars);
        screen.addObject(moon);

        assertEquals(3, screen.getAmountOfObjects());

        ArrayList<DrawableObject> visible = screen.getVisibleScreenObjects();
        assertEquals(2, visible.size());
        binaryStars.move(10, 12);
        visible = screen.getVisibleScreenObjects();
        assertEquals(3, visible.size());
    }

}
