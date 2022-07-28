
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;




public class Product {


@JsonProperty("lastChangeDate")
 String lastChangeDate;
@JsonProperty("supplierArticle")
String supplierArticle;
@JsonProperty ("techSize")
 String techSize;
@JsonProperty ("barcode")
 String barcode;
 @JsonProperty ("countryName")
 String countryName;
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
@JsonProperty ("isSupply")
String isSupply;
 @JsonProperty ("oblastOkrugName")
 String oblastOkrugName;
 @JsonProperty ("isRealization")
 String isRealization;
 @JsonProperty ("regionName")
 String regionName;
 @JsonProperty ("saleID")
 String saleID;
 @JsonProperty ("spp")
 String spp;
 @JsonProperty ("forPay")
 String forPay;
 @JsonProperty ("promoCodeDiscount")
 String promoCodeDiscount;
 @JsonProperty ("finishedPrice")
 String finishedPrice;
 @JsonProperty ("priceWithDisc")
 String priceWithDisc;
 @JsonProperty ("IsStorno")
 String IsStorno;

 public Product(){};

 public Product(String lastChangeDate, String supplierArticle, String techSize, String barcode, String countryName, int totalPrice, int discountPercent, String warehouseName, String oblast, int incomeID, long odid, int nmId, String subject, String category, String brand, String isCancel, String cancel_dt, String gNumber, String sticker, String srid, String date, String isSupply, String oblastOkrugName, String isRealization, String regionName, String saleID, String spp, String forPay, String promoCodeDiscount, String finishedPrice, String priceWithDisc, String isStorno) {
  this.lastChangeDate = lastChangeDate;
  this.supplierArticle = supplierArticle;
  this.techSize = techSize;
  this.barcode = barcode;
  this.countryName = countryName;
  this.totalPrice = totalPrice;
  this.discountPercent = discountPercent;
  this.warehouseName = warehouseName;
  this.oblast = oblast;
  this.incomeID = incomeID;
  this.odid = odid;
  this.nmId = nmId;
  this.subject = subject;
  this.category = category;
  this.brand = brand;
  this.isCancel = isCancel;
  this.cancel_dt = cancel_dt;
  this.gNumber = gNumber;
  this.sticker = sticker;
  this.srid = srid;
  this.date = date;
  this.isSupply = isSupply;
  this.oblastOkrugName = oblastOkrugName;
  this.isRealization = isRealization;
  this.regionName = regionName;
  this.saleID = saleID;
  this.spp = spp;
  this.forPay = forPay;
  this.promoCodeDiscount = promoCodeDiscount;
  this.finishedPrice = finishedPrice;
  this.priceWithDisc = priceWithDisc;
  IsStorno = isStorno;
 }

 public String getLastChangeDate() {
  return lastChangeDate;
 }

 public void setLastChangeDate(String lastChangeDate) {
  this.lastChangeDate = lastChangeDate;
 }

 public String getSupplierArticle() {
  return supplierArticle;
 }

 public void setSupplierArticle(String supplierArticle) {
  this.supplierArticle = supplierArticle;
 }

 public String getTechSize() {
  return techSize;
 }

 public void setTechSize(String techSize) {
  this.techSize = techSize;
 }

 public String getBarcode() {
  return barcode;
 }

 public void setBarcode(String barcode) {
  this.barcode = barcode;
 }

 public String getCountryName() {
  return countryName;
 }

 public void setCountryName(String countryName) {
  this.countryName = countryName;
 }

 public int getTotalPrice() {
  return totalPrice;
 }

 public void setTotalPrice(int totalPrice) {
  this.totalPrice = totalPrice;
 }

 public int getDiscountPercent() {
  return discountPercent;
 }

 public void setDiscountPercent(int discountPercent) {
  this.discountPercent = discountPercent;
 }

 public String getWarehouseName() {
  return warehouseName;
 }

 public void setWarehouseName(String warehouseName) {
  this.warehouseName = warehouseName;
 }

 public String getOblast() {
  return oblast;
 }

 public void setOblast(String oblast) {
  this.oblast = oblast;
 }

 public int getIncomeID() {
  return incomeID;
 }

 public void setIncomeID(int incomeID) {
  this.incomeID = incomeID;
 }

 public long getOdid() {
  return odid;
 }

 public void setOdid(long odid) {
  this.odid = odid;
 }

 public int getNmId() {
  return nmId;
 }

 public void setNmId(int nmId) {
  this.nmId = nmId;
 }

 public String getSubject() {
  return subject;
 }

 public void setSubject(String subject) {
  this.subject = subject;
 }

 public String getCategory() {
  return category;
 }

 public void setCategory(String category) {
  this.category = category;
 }

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public String getIsCancel() {
  return isCancel;
 }

 public void setIsCancel(String isCancel) {
  this.isCancel = isCancel;
 }

 public String getCancel_dt() {
  return cancel_dt;
 }

 public void setCancel_dt(String cancel_dt) {
  this.cancel_dt = cancel_dt;
 }

 public String getgNumber() {
  return gNumber;
 }

 public void setgNumber(String gNumber) {
  this.gNumber = gNumber;
 }

 public String getSticker() {
  return sticker;
 }

 public void setSticker(String sticker) {
  this.sticker = sticker;
 }

 public String getSrid() {
  return srid;
 }

 public void setSrid(String srid) {
  this.srid = srid;
 }

 public String getDate() {
  return date;
 }

 public void setDate(String date) {
  this.date = date;
 }

 public String getIsSupply() {
  return isSupply;
 }

 public void setIsSupply(String isSupply) {
  this.isSupply = isSupply;
 }

 public String getOblastOkrugName() {
  return oblastOkrugName;
 }

 public void setOblastOkrugName(String oblastOkrugName) {
  this.oblastOkrugName = oblastOkrugName;
 }

 public String getIsRealization() {
  return isRealization;
 }

 public void setIsRealization(String isRealization) {
  this.isRealization = isRealization;
 }

 public String getRegionName() {
  return regionName;
 }

 public void setRegionName(String regionName) {
  this.regionName = regionName;
 }

 public String getSaleID() {
  return saleID;
 }

 public void setSaleID(String saleID) {
  this.saleID = saleID;
 }

 public String getSpp() {
  return spp;
 }

 public void setSpp(String spp) {
  this.spp = spp;
 }

 public String getForPay() {
  return forPay;
 }

 public void setForPay(String forPay) {
  this.forPay = forPay;
 }

 public String getPromoCodeDiscount() {
  return promoCodeDiscount;
 }

 public void setPromoCodeDiscount(String promoCodeDiscount) {
  this.promoCodeDiscount = promoCodeDiscount;
 }

 public String getFinishedPrice() {
  return finishedPrice;
 }

 public void setFinishedPrice(String finishedPrice) {
  this.finishedPrice = finishedPrice;
 }

 public String getPriceWithDisc() {
  return priceWithDisc;
 }

 public void setPriceWithDisc(String priceWithDisc) {
  this.priceWithDisc = priceWithDisc;
 }

 public String getIsStorno() {
  return IsStorno;
 }

 public void setIsStorno(String isStorno) {
  IsStorno = isStorno;
 }

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