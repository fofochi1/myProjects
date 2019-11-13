public class DemoCandles {

   public static void main(String[] args) {
       Candle candle1 = new Candle();
       candle1.setColor("brown");
       candle1.setHeight(2);
       System.out.println("Color of Candle: " + candle1.getColor());
       System.out.println("Height of Candle: " + candle1.getHeight() + " Inches");
       System.out.println("Price of Candle: " + "$" + candle1.getPrice());
       System.out.println();

       ScentedCandle candle2 = new ScentedCandle();
       candle2.setScent("Strawberry");
       candle2.setColor("Brown");
       candle2.setHeight(3);
       System.out.println("Scent of Candle: " + candle2.getScent());
       System.out.println("Color of Candle: " + candle2.getColor());
       System.out.println("Height of Candle: " + candle2.getHeight() + " Inches");
       System.out.println("Price of Candle: " + "$" + candle2.getPrice());
   }
}
