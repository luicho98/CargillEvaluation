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
public class Client {

    private int ClientID;
    private String ClientName;
    private String Address1;
    private String Address2;
    private String Town;
    private String County;
    private String PostCode;
    private String Region;
    private String OuterPostode;
    private Country CountryID;
    private String ClientType;
    private String ClientSize;
    private String ClientSince;
    private boolean IsCreditWorthy;
    private boolean IsDealer;

    public Client(String ClientName, String Address1, String Address2, String Town, String County, String PostCode, String Region, String OuterPostode, Country CountryID, String ClientType, String ClientSize, String ClientSince, boolean IsCreditWorthy, boolean IsDealer) {
        //this.ClientID = ClientID; increments, use set when you have the last id
        this.ClientName = ClientName;
        this.Address1 = Address1;
        this.Address2 = Address2;
        this.Town = Town;
        this.County = County;
        this.PostCode = PostCode;
        this.Region = Region;
        this.OuterPostode = OuterPostode;
        this.CountryID = CountryID;
        this.ClientType = ClientType;
        this.ClientSize = ClientSize;
        this.ClientSince = ClientSince;
        this.IsCreditWorthy = IsCreditWorthy;
        this.IsDealer = IsDealer;
    }

    public void setClientID(int ClientID) {
        this.ClientID = ClientID;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public void setCounty(String County) {
        this.County = County;
    }

    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public void setOuterPostode(String OuterPostode) {
        this.OuterPostode = OuterPostode;
    }

    public void setCountryID(Country CountryID) {
        this.CountryID = CountryID;
    }

    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    public void setClientSize(String ClientSize) {
        this.ClientSize = ClientSize;
    }

    public void setClientSince(String ClientSince) {
        this.ClientSince = ClientSince;
    }

    public void setIsCreditWorthy(boolean IsCreditWorthy) {
        this.IsCreditWorthy = IsCreditWorthy;
    }

    public void setIsDealer(boolean IsDealer) {
        this.IsDealer = IsDealer;
    }

    public int getClientID() {
        return ClientID;
    }

    public String getClientName() {
        return ClientName;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public String getTown() {
        return Town;
    }

    public String getCounty() {
        return County;
    }

    public String getPostCode() {
        return PostCode;
    }

    public String getRegion() {
        return Region;
    }

    public String getOuterPostode() {
        return OuterPostode;
    }

    public Country getCountryID() {
        return CountryID;
    }

    public String getClientType() {
        return ClientType;
    }

    public String getClientSize() {
        return ClientSize;
    }

    public String getClientSince() {
        return ClientSince;
    }

    public boolean isIsCreditWorthy() {
        return IsCreditWorthy;
    }

    public boolean isIsDealer() {
        return IsDealer;
    }
    
    
}
