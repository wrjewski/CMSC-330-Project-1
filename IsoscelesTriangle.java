import java.awt.*;

class IsoscelesTriangle extends SolidPolygon {
    public IsoscelesTriangle(Color color, Point topVertex, int height, int width) {
        super(color, 3);
        int[] x_points = { topVertex.x, topVertex.x - (width / 2), topVertex.x + (width / 2) };
        int[] y_points = { topVertex.y, topVertex.y + height, topVertex.y + height };
        createPolygon(x_points, y_points);
    }
}