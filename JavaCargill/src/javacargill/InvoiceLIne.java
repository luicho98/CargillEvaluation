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
public class InvoiceLIne {

    private int InvoiceLineID;
    private Invoice InvoiceID;
    private Stock StockID;
    private int SalePrice;
    private int LineItem;

    public InvoiceLIne(Invoice InvoiceID, Stock StockID, int SalePrice, int LineItem) {
        this.InvoiceID = InvoiceID;
        this.StockID = StockID;
        this.SalePrice = SalePrice;
        this.LineItem = LineItem;
    }

    public int getInvoiceLineID() {
        return InvoiceLineID;
    }

    public void setInvoiceLineID(int InvoiceLineID) {
        this.InvoiceLineID = InvoiceLineID;
    }

    public Invoice getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(Invoice InvoiceID) {
        this.InvoiceID = InvoiceID;
    }

    public Stock getStockID() {
        return StockID;
    }

    public void setStockID(Stock StockID) {
        this.StockID = StockID;
    }

    public int getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(int SalePrice) {
        this.SalePrice = SalePrice;
    }

    public int getLineItem() {
        return LineItem;
    }

    public void setLineItem(int LineItem) {
        this.LineItem = LineItem;
    }
    
    
}
