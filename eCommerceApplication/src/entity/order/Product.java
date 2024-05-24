package entity.order;

import java.time.LocalDate;

public class Product {
    private Integer id;
    private String category;
    private String productName;
    private Integer unitPrice;
    private Integer discount;
    private String description;
    private Integer sellingCount;
    private boolean isReturnable;


    public Product(Integer id, String category, String productName, Integer unitPrice, Integer discount, String description, Integer sellingCount, boolean isReturnable) {
        this.id = id;
        this.category = category;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.description = description;
        this.sellingCount = sellingCount;
        this.isReturnable = isReturnable;
    }

    public Product(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSellingCount() {
        return sellingCount;
    }

    public void setSellingCount(Integer sellingCount) {
        this.sellingCount = sellingCount;
    }

    public boolean isReturnable() {
        return isReturnable;
    }

    public void setReturnable(boolean returnable) {
        isReturnable = returnable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
