public class Candle {
    protected String color;
    protected int height;
    protected int price;

    public void setColor(String colorName){
        this.color = colorName;
    }
    public String getColor(){
        return color;
    }

    public double setHeight(int newHeight){
        this.height = newHeight;
        this.price = height*2;
        return price;
    }

    public int getHeight() {
        return height;
    }

    public int getPrice(){
        return price;
    }
}
