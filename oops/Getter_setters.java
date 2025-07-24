public class Getter_setters {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Red");
        pen.setTip(0.7f);
        
        System.out.println("Pen Color: " + pen.getColor());
        System.out.println("Pen Tip: " + pen.getTip());
    }
}
class Pen {
    private String color;
    private float tip;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public float getTip() {
        return tip;
    }
}
