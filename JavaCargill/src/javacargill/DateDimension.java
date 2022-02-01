/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacargill;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author luisv
 */
public class DateDimension {

    private String DateKey;
    private int Year;
    private int MonthNum;
    private String MonthFull;
    private String MonthAbbr;
    private int QuarterNum;
    private String QuarterFull;
    private String QuarterAbbr;
    private int YearAndQuarterNum;
    private String QuarterAbbrAndYear;
    private String MonthAbbrAndYear;
    private String MonthAndYear;
    private String MonthName;
    private String MonthNameAbbr;
    private String QuarterAndYear;
    private String QuarterAndYearAbbr2;
    private int YearAndMonthNum;

    //old ones could get all info back from the xlsx
    public DateDimension(String DateKey, int Year, int MonthNum, String MonthFull, String MonthAbbr, int QuarterNum, String QuarterFull, String QuarterAbbr, int YearAndQuarterNum, String QuarterAbbrAndYear, String MonthAbbrAndYear, String MonthAndYear, String MonthName, String MonthNameAbbr, String QuarterAndYear, String QuarterAndYearAbbr2, int YearAndMonthNum) {
        this.DateKey = DateKey;
        this.Year = Year;
        this.MonthNum = MonthNum;
        this.MonthFull = MonthFull;
        this.MonthAbbr = MonthAbbr;
        this.QuarterNum = QuarterNum;
        this.QuarterFull = QuarterFull;
        this.QuarterAbbr = QuarterAbbr;
        this.YearAndQuarterNum = YearAndQuarterNum;
        this.QuarterAbbrAndYear = QuarterAbbrAndYear;
        this.MonthAbbrAndYear = MonthAbbrAndYear;
        this.MonthAndYear = MonthAndYear;
        this.MonthName = MonthName;
        this.MonthNameAbbr = MonthNameAbbr;
        this.QuarterAndYear = QuarterAndYear;
        this.QuarterAndYearAbbr2 = QuarterAndYearAbbr2;
        this.YearAndMonthNum = YearAndMonthNum;
    }
    //separate the new one with the restored one
    public DateDimension(int nothing) {}
    
    
    //new ones could be get from a timestamp
    public DateDimension() {
        
        LocalDateTime now = LocalDateTime.now(); 
        //complete day
        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter m = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter y = DateTimeFormatter.ofPattern("yyyy");
        //this formaters are to avoid splitting the String
        
        String timestamp=dmy.format(now);
        
        int year,month;
        year=Integer.parseInt(y.format(now));
        month=Integer.parseInt(m.format(now));
        
        this.DateKey = timestamp;
        
        this.Year = year;
        
        this.MonthNum = month;
        
        String[] months = {"January", "February", "March", "April","May","June", "July", "August", "September","October","November","December"};
        this.MonthFull = months[month];
        
        String[] monthsAbb = {"Jan", "Feb", "Mar", "Apr","May","Jun", "Jul", "Aug", "Sep","Oct","Nov","Dec"};
        this.MonthAbbr = monthsAbb[month];
        
        Map map=new HashMap(); //map that gives the quarter when you give the month
        map.put(1,1);  
        map.put(2,1);
        map.put(3,1);
        map.put(4,2);
        map.put(5,2);
        map.put(6,2);
        map.put(7,3);
        map.put(8,3);
        map.put(9,3);
        map.put(10,4);
        map.put(11,4);
        map.put(12,4);
        
        this.QuarterNum = (int)map.get(month);
        
        this.QuarterFull = "Quarter "+(int)map.get(month);
        
        this.QuarterAbbr = "Q"+(int)map.get(month);
        
        this.YearAndQuarterNum = (year*10)+1; //*10 moves the number to the left and add a 0, the best way to concatenate numbers of an specific large
        
        this.QuarterAbbrAndYear = QuarterAbbr+" "+year;
        
        this.MonthAbbrAndYear = MonthAbbr+" "+year;
        
        this.MonthAndYear = MonthFull+year;
        
        this.MonthName = MonthFull;
        
        this.MonthNameAbbr = MonthAbbr;
        
        this.QuarterAndYear = QuarterFull+" "+year;
        
        this.QuarterAndYearAbbr2 = "Qtr "+QuarterNum+" "+year;
        
        if(month<10){this.YearAndMonthNum = (year*10)+month;}
        else{this.YearAndMonthNum = (year*100)+month;}
        
        
    }

    public void setDateKey(String DateKey) {
        this.DateKey = DateKey;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setMonthNum(int MonthNum) {
        this.MonthNum = MonthNum;
    }

    public void setMonthFull(String MonthFull) {
        this.MonthFull = MonthFull;
    }

    public void setMonthAbbr(String MonthAbbr) {
        this.MonthAbbr = MonthAbbr;
    }

    public void setQuarterNum(int QuarterNum) {
        this.QuarterNum = QuarterNum;
    }

    public void setQuarterFull(String QuarterFull) {
        this.QuarterFull = QuarterFull;
    }

    public void setQuarterAbbr(String QuarterAbbr) {
        this.QuarterAbbr = QuarterAbbr;
    }

    public void setYearAndQuarterNum(int YearAndQuarterNum) {
        this.YearAndQuarterNum = YearAndQuarterNum;
    }

    public void setQuarterAbbrAndYear(String QuarterAbbrAndYear) {
        this.QuarterAbbrAndYear = QuarterAbbrAndYear;
    }

    public void setMonthAbbrAndYear(String MonthAbbrAndYear) {
        this.MonthAbbrAndYear = MonthAbbrAndYear;
    }

    public void setMonthAndYear(String MonthAndYear) {
        this.MonthAndYear = MonthAndYear;
    }

    public void setMonthName(String MonthName) {
        this.MonthName = MonthName;
    }

    public void setMonthNameAbbr(String MonthNameAbbr) {
        this.MonthNameAbbr = MonthNameAbbr;
    }

    public void setQuarterAndYear(String QuarterAndYear) {
        this.QuarterAndYear = QuarterAndYear;
    }

    public void setQuarterAndYearAbbr2(String QuarterAndYearAbbr2) {
        this.QuarterAndYearAbbr2 = QuarterAndYearAbbr2;
    }

    public void setYearAndMonthNum(int YearAndMonthNum) {
        this.YearAndMonthNum = YearAndMonthNum;
    }

  
    
    public String getDateKey() {
        return DateKey;
    }

    public int getYear() {
        return Year;
    }

    public int getMonthNum() {
        return MonthNum;
    }

    public String getMonthFull() {
        return MonthFull;
    }

    public String getMonthAbbr() {
        return MonthAbbr;
    }

    public int getQuarterNum() {
        return QuarterNum;
    }

    public String getQuarterFull() {
        return QuarterFull;
    }

    public String getQuarterAbbr() {
        return QuarterAbbr;
    }

    public int getYearAndQuarterNum() {
        return YearAndQuarterNum;
    }

    public String getQuarterAbbrAndYear() {
        return QuarterAbbrAndYear;
    }

    public String getMonthAbbrAndYear() {
        return MonthAbbrAndYear;
    }

    public String getMonthAndYear() {
        return MonthAndYear;
    }

    public String getMonthName() {
        return MonthName;
    }

    public String getMonthNameAbbr() {
        return MonthNameAbbr;
    }

    public String getQuarterAndYear() {
        return QuarterAndYear;
    }

    public String getQuarterAndYearAbbr2() {
        return QuarterAndYearAbbr2;
    }

    public int getYearAndMonthNum() {
        return YearAndMonthNum;
    }
    

}


