
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;


@Data

public class Product {


@JsonProperty("lastChangeDate")
 String lastChangeDate;
@JsonProperty("supplierArticle")
String supplierArticle;
@JsonProperty ("techSize")
 String techSize;
@JsonProperty ("barcode")
 String barcode;
@JsonProperty("totalPrice")
 int totalPrice;
@JsonProperty ("discountPercent")
 int discountPercent;
@JsonProperty ("warehouseName")
 String warehouseName;
@JsonProperty ("oblast")
 String oblast;
@JsonProperty("incomeID")
 int incomeID;
@JsonProperty("odid")
 long odid;
@JsonProperty("nmId")
 int nmId;
@JsonProperty("subject")
 String subject;
@JsonProperty ("category")
 String category;
@JsonProperty("brand")
 String brand;
@JsonProperty("isCancel")
 String isCancel;
@JsonProperty("cancel_dt")
 String cancel_dt;
@JsonProperty("gNumber")
 String gNumber;
@JsonProperty("sticker")
 String sticker;
@JsonProperty("srid")
 String srid;
@JsonProperty ("date")
 String date;

 @Override
 public String toString() {
  return "Product:" +"\n"+
          "lastChangeDate='" + lastChangeDate + '\'' + "\n"+
          ", supplierArticle='" + supplierArticle + '\'' + "\n"+
          "barcode='" + barcode + '\'' +"\n"+
          "totalPrice=" + totalPrice + "\n"+
          "discountPercent=" + discountPercent + "\n"+
          "warehouseName='" + warehouseName + '\'' + "\n"+
          "oblast='" + oblast + '\'' + "\n"+
          "subject='" + subject + '\'' + "\n"+
          "category='" + category + '\'' + "\n"+
          "brand='" + brand + '\'' + "\n"+
          "date='" + date + '\'' +
          ':';
 }
}