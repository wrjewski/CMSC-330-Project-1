import java.awt.*;

class Text_ extends Image {

    private Point vertex;
    private String text;
    private Color color;

    public Text_(Color color, Point vertex, String text) {
        super(color);
        this.color = color;
        this.vertex = vertex;
        this.text = text;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.drawString(text, vertex.x, vertex.y);
    }
}