
/**
 *To help you sort arrays
 *
 *Evan Wang
 *4/20/2022
 */
public class Array
{
   private String name;
   private int price, quantity, productNumber;
   public Array(String originalName, int originalProductNumber,
   int originalPrice, int originalQuantity)
   {
       name = originalName;
       price = originalPrice;
       quantity = originalQuantity;
       productNumber = originalProductNumber;
   }
   
   public String getName () {
       return name;
   }
   public int getPrice () {
       return price;
   }
   public int getQuantity () {
       return quantity;
   }
   public int getProductNumber () {
       return productNumber;
   }
   
   public void setName(String nameV2) {
       name = nameV2;
   }
   public void setPrice(int priceV2) {
       price = priceV2;
   }
      public void setQuantity(int quantityV2) {
       price = quantityV2;
   }
      public void setProductNumber(int productNum) {
       productNumber = productNum;
   }
   
   public String toString() {
       
       return String.format(" %-1s %-10d %-20d %-30d ", getName(), getProductNumber(), getPrice(),getQuantity());
   }
}
