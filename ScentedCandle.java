public class ScentedCandle extends Candle {
    private String scent;

    public void setScent(String scentName){
        this.scent = scentName;
    }
    public String getScent(){
        return scent;
    }

    public double setHeight(int newHeight){
        this.height = newHeight;
        this.price = height*3;
        return price;
    }
}
