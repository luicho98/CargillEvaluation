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
public class Invoice {

    private int InvoiceID;
    private String InvoiceNumber;
    private Client ClientID;
    private String InvoiceDate;
    private int TotalDiscount;
    private int DeliveryCharge;
    private int InvoiceDateKey;

    public Invoice(String InvoiceNumber, Client ClientID, String InvoiceDate, int TotalDiscount, int DeliveryCharge, int InvoiceDateKey) {
        this.InvoiceNumber = InvoiceNumber;
        this.ClientID = ClientID;
        this.InvoiceDate = InvoiceDate;
        this.TotalDiscount = TotalDiscount;
        this.DeliveryCharge = DeliveryCharge;
        this.InvoiceDateKey = InvoiceDateKey;
    }

    public int getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(int InvoiceID) {
        this.InvoiceID = InvoiceID;
    }

    public String getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(String InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public Client getClientID() {
        return ClientID;
    }

    public void setClientID(Client ClientID) {
        this.ClientID = ClientID;
    }

    public String getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(String InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public int getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(int TotalDiscount) {
        this.TotalDiscount = TotalDiscount;
    }

    public int getDeliveryCharge() {
        return DeliveryCharge;
    }

    public void setDeliveryCharge(int DeliveryCharge) {
        this.DeliveryCharge = DeliveryCharge;
    }

    public int getInvoiceDateKey() {
        return InvoiceDateKey;
    }

    public void setInvoiceDateKey(int InvoiceDateKey) {
        this.InvoiceDateKey = InvoiceDateKey;
    }
    
    
}
