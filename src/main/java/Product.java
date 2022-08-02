
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.List;


@Data
public class Product {


 @JsonProperty("lastChangeDate")
 String lastChangeDate;
 @JsonProperty("supplierArticle")
 String supplierArticle;
 @JsonProperty("techSize")
 String techSize;
 @JsonProperty("barcode")
 String barcode;
 @JsonProperty("countryName")
 String countryName;
 @JsonProperty("totalPrice")
 int totalPrice;
 @JsonProperty("discountPercent")
 int discountPercent;
 @JsonProperty("warehouseName")
 String warehouseName;
 @JsonProperty("oblast")
 String oblast;
 @JsonProperty("incomeID")
 int incomeID;
 @JsonProperty("odid")
 long odid;
 @JsonProperty("nmId")
 int nmId;
 @JsonProperty("subject")
 String subject;
 @JsonProperty("category")
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
 @JsonProperty("date")
 String date;
 @JsonProperty("isSupply")
 String isSupply;
 @JsonProperty("oblastOkrugName")
 String oblastOkrugName;
 @JsonProperty("isRealization")
 String isRealization;
 @JsonProperty("regionName")
 String regionName;
 @JsonProperty("saleID")
 String saleID;
 @JsonProperty("spp")
 int spp;
 @JsonProperty("forPay")
 String forPay;
 @JsonProperty("promoCodeDiscount")
 String promoCodeDiscount;
 @JsonProperty("finishedPrice")
 String finishedPrice;
 @JsonProperty("priceWithDisc")
 String priceWithDisc;
 @JsonProperty("IsStorno")
 String IsStorno;

 }
