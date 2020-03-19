
/*
 * Grommet java bean 
 */
public class Grommet {
    String color;
    String symbol;

    public Grommet() {
    }

    public Grommet(String color, String type) {
        this.color = color;
        this.symbol = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String type) {
        this.symbol = type;
    }
    
}
