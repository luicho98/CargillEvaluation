/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacargill;

/**
 *
 * @author luisv
 */
public class Stock {
    //Date were changed to string, it can be used on both ways but it is easier to manage a string

    private int StockID;
    private String Make;
    private String Model;
    private Color ColorID;
    private String VehicleType;
    private int CostPrice;
    private int SpareParts;
    private int LaborCost;
    private String Registration_Date;
    private int Mileage;
    private DateDimension PurchaseDate;
    private int VehicleAgeInYears;

    public Stock(String Make, String Model, Color ColorID, String VehicleType, int CostPrice, int SpareParts, int LaborCost, String Registration_Date, int Mileage, DateDimension PurchaseDate, int VehicleAgeInYears) {
        this.Make = Make;
        this.Model = Model;
        this.ColorID = ColorID;
        this.VehicleType = VehicleType;
        this.CostPrice = CostPrice;
        this.SpareParts = SpareParts;
        this.LaborCost = LaborCost;
        this.Registration_Date = Registration_Date;
        this.Mileage = Mileage;
        this.PurchaseDate = PurchaseDate;
        this.VehicleAgeInYears = VehicleAgeInYears;
    }

    public Stock() {
    }

    public int getStockID() {
        return StockID;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public Color getColorID() {
        return ColorID;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public int getCostPrice() {
        return CostPrice;
    }

    public int getSpareParts() {
        return SpareParts;
    }

    public int getLaborCost() {
        return LaborCost;
    }

    public String getRegistration_Date() {
        return Registration_Date;
    }

    public int getMileage() {
        return Mileage;
    }

    public DateDimension getPurchaseDate() {
        return PurchaseDate;
    }

    public int getVehicleAgeInYears() {
        return VehicleAgeInYears;
    }

    public void setStockID(int StockID) {
        this.StockID = StockID;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setColorID(Color ColorID) {
        this.ColorID = ColorID;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public void setCostPrice(int CostPrice) {
        this.CostPrice = CostPrice;
    }

    public void setSpareParts(int SpareParts) {
        this.SpareParts = SpareParts;
    }

    public void setLaborCost(int LaborCost) {
        this.LaborCost = LaborCost;
    }

    public void setRegistration_Date(String Registration_Date) {
        this.Registration_Date = Registration_Date;
    }

    public void setMileage(int Mileage) {
        this.Mileage = Mileage;
    }

    public void setPurchaseDate(DateDimension PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    public void setVehicleAgeInYears(int VehicleAgeInYears) {
        this.VehicleAgeInYears = VehicleAgeInYears;
    }
    
    
}
