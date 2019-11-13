public class ItemSold {
    private int invoiceNumber;
    private String description;
    private int price;

    public void setInvoiceNumber(int number){
        this.invoiceNumber = number;
    }
    public int getInvoiceNumber(){
        return invoiceNumber;
    }

    public void setDescription(String type){
        this.description = type;
    }
    public String getDescription(){
        return description;
    }

    public void setPrice(int amount){
        this.price = amount;
    }
    public int getPrice(){
        return price;
    }


}
