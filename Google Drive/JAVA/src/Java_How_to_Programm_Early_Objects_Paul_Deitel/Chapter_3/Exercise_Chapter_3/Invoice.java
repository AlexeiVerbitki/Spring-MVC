package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.Exercise_Chapter_3;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partDescription, String partNumber, int quantity, double price){
//        this.partDescription=partDescription;
//        this.partNumber=partNumber;
//        this.quantity=quantity;
//        this.price=price;
        setPartDescription(partDescription);
        setPartNumber(partNumber);
        setPrice(price);
        setQuantity(quantity);
    } // end constructor


    public void  getInvoice (){
        double invoiceAmount = getQuantity() * getPrice();
            System.out.printf("\nThe invoice amount is: %.2f", invoiceAmount);
          }



// setters ---------------------------------------

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setPartDescription( String partDescription){
        this.partDescription = partDescription;
    }
    public void setQuantity (int quantity){
//        this.quantity= quantity;
        if (quantity > 0 ){
            this.quantity= quantity;}
        else {
            System.out.println("The requested quantity is less than 0\n");
            this.quantity = 0;
        }
    }
    public void setPrice ( double price){
//        this.price=price;
        this.price = price;
        if (price > 0 ) {
            this.price = price;}
        else {
            System.out.printf("The requested price is less than 0\n");
            this.price = 0;
        }
    }
    // getters ---------------------------------------

    public String getPartNumber (){
        return partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
}

