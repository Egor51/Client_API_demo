
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class Product {


 @JsonProperty
 String lastChangeDate;
 @JsonProperty
 static
 String supplierArticle;
 @JsonProperty
 String techSize;
 @JsonProperty
 String barcode;
 @JsonProperty
 int totalPrice;
 @JsonProperty
 int discountPercent;
 @JsonProperty
 String warehouseName;
 @JsonProperty
 String oblast;
 @JsonProperty
 int incomeID;
 @JsonProperty
 long odid;
 @JsonProperty
 int nmId;
 @JsonProperty
 String subject;
 @JsonProperty
 String category;
 @JsonProperty
 String brand;
 @JsonProperty
 String isCancel;
 @JsonProperty
 String cancel_dt;
 @JsonProperty
 String gNumber;
 @JsonProperty
 String sticker;
 @JsonProperty
 String srid;
 @JsonProperty
 String date;

}