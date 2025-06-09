package poly.cafe.dto;

public class CategoryDrinkDTO {
    private int DrinkId;
    private String DrinkName;
    private double DrinkUnitPrice;
    private double DrinkDiscount;
    private int CategoryId;

    public CategoryDrinkDTO() {
    }

    public CategoryDrinkDTO(int DrinkId, String DrinkName, double DrinkUnitPrice, double DrinkDiscount, int CategoryId) {
        this.DrinkId = DrinkId;
        this.DrinkName = DrinkName;
        this.DrinkUnitPrice = DrinkUnitPrice;
        this.DrinkDiscount = DrinkDiscount;
        this.CategoryId = CategoryId;
    }

    public int getDrinkId() {
        return DrinkId;
    }

    public void setDrinkId(int DrinkId) {
        this.DrinkId = DrinkId;
    }

    public String getDrinkName() {
        return DrinkName;
    }

    public void setDrinkName(String DrinkName) {
        this.DrinkName = DrinkName;
    }

    public double getDrinkUnitPrice() {
        return DrinkUnitPrice;
    }

    public void setDrinkUnitPrice(double DrinkUnitPrice) {
        this.DrinkUnitPrice = DrinkUnitPrice;
    }

    public double getDrinkDiscount() {
        return DrinkDiscount;
    }

    public void setDrinkDiscount(double DrinkDiscount) {
        this.DrinkDiscount = DrinkDiscount;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }
    
    
}
