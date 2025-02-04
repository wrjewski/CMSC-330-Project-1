import java.awt.*;
import java.lang.Math;

class RegularPolygon extends SolidPolygon {
    public RegularPolygon(Color color, Point center, int numSides, int radius) {
        super(color, numSides);

        // init vars
        double angle = (2 * Math.PI) / numSides;
        int[] x_points = new int[numSides + 1];
        int[] y_points = new int[numSides + 1];

        int index = 0;
        for (double currentAngle = 0; currentAngle < (2 * Math.PI); currentAngle += angle) {
            x_points[index] = (int) (radius * Math.cos(currentAngle) + center.x);
            y_points[index] = (int) (radius * Math.sin(currentAngle) + center.x);
            index += 1;
        }

        createPolygon(x_points, y_points);
    }
}