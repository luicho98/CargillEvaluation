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
public class Country {
    private int CountryID;
    private String CountryName;
    private String CountryISOCode;

    //constructor for the ones readed from the xlsx
    public Country(int CountryID, String CountryName, String CountryISOCode) {
        this.CountryID = CountryID;
        this.CountryName = CountryName;
        this.CountryISOCode = CountryISOCode;
    }
    
    //constructor for new ones
    public Country(String CountryName, String CountryISOCode) {
        //CountryID should be an incremental int
        this.CountryName = CountryName;
        this.CountryISOCode = CountryISOCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryISOCode() {
        return CountryISOCode;
    }

    public void setCountryISOCode(String CountryISOCode) {
        this.CountryISOCode = CountryISOCode;
    }

    public int getCountryID() {
        return CountryID;
    }

    //setCountryID should be getting the lastCountryID added +1
    public void setCountryID(int CountryID) {
        this.CountryID = CountryID;
    }
    
    
}
