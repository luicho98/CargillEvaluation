/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacargill;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author luisv
 */
public class JavaCargill {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    //this main will save colors, datedimension and stock info to use it
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        //list of Colors ans Stocks
        List<Color> lcol = new ArrayList<>();
        List<DateDimension> ldat = new ArrayList<>();
        List<Stock> lsto = new ArrayList<>();

        boolean flag = false;
        FileInputStream fins = new FileInputStream(new File("../CarSalesDataForReports.xlsx"));

        XSSFWorkbook wb = new XSSFWorkbook(fins);

        //Color sheet read
        XSSFSheet sheet = wb.getSheetAt(1);
        //number of the sheet to read

        FormulaEvaluator fmEval = wb.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet) {
            Color c = new Color();
            if (flag) {
                for (Cell cell : row) {
                    switch (fmEval.evaluateInCell(cell).getCellTypeEnum()) {
                        case NUMERIC:
                            c.setColorID((int) cell.getNumericCellValue());
                            
                            break;
                        case STRING:
                            c.setColor(cell.getStringCellValue());
                            
                            break;
                    }
                }
                lcol.add(c);
            } else {
                //avoid the first row, column names
                flag = true;
            }
            
        }

        flag = false;
        //DateDimension sheet read
        sheet = wb.getSheetAt(6);
        //number of the sheet to read
        int typeIn = 0;
        fmEval = wb.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet) {
            DateDimension dd = new DateDimension(0);
            if (flag) {
                for (Cell cell : row) {
                    switch (typeIn) {
                        case 0:
                            dd.setDateKey(String.valueOf(cell.getNumericCellValue()));
                            break;
                        case 1:
                            dd.setYear((int) cell.getNumericCellValue());
                            break;
                        case 2:
                            dd.setMonthNum((int) cell.getNumericCellValue());
                            break;
                        case 3:
                            dd.setMonthFull(cell.getStringCellValue());
                            break;
                        case 4:
                            dd.setMonthAbbr(cell.getStringCellValue());
                            break;
                        case 5:
                            dd.setQuarterNum((int) cell.getNumericCellValue());
                            break;
                        case 6:
                            dd.setQuarterFull(cell.getStringCellValue());
                            break;
                        case 7:
                            dd.setQuarterAbbr(cell.getStringCellValue());
                            break;
                        case 8:
                            dd.setYearAndQuarterNum((int) cell.getNumericCellValue());
                            break;
                        case 9:
                            dd.setQuarterAbbrAndYear(cell.getStringCellValue());
                            break;
                        case 10:
                            dd.setMonthAbbrAndYear(cell.getStringCellValue());
                            break;
                        case 11:
                            dd.setMonthAndYear(cell.getStringCellValue());
                            break;
                        case 12:
                            dd.setMonthName(cell.getStringCellValue());
                            break;
                        case 13:
                            dd.setMonthNameAbbr(cell.getStringCellValue());
                            break;
                        case 14:
                            dd.setQuarterAndYear(cell.getStringCellValue());
                            break;
                        case 15:
                            dd.setQuarterAndYearAbbr2(cell.getStringCellValue());
                            break;
                        case 16:
                            dd.setYearAndMonthNum((int) cell.getNumericCellValue());
                            break;
                    }

                    typeIn++;
                }
                typeIn = 0;
                ldat.add(dd);
            } else {
                //avoid the first row, column names
                flag = true;
            }
        }
        typeIn = 0;
        flag = false;
        //Stocks sheet read
        sheet = wb.getSheetAt(3);
        //number of the sheet to read

        fmEval = wb.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet) {
            Stock ss = new Stock();
            if (flag) {
                for (Cell cell : row) {
                    switch (typeIn) {
                        case 0:
                            ss.setStockID((int) cell.getNumericCellValue());
                            break;
                        case 1:
                            ss.setMake(cell.getStringCellValue());
                            break;
                        case 2:
                            ss.setModel(cell.getStringCellValue());
                            break;
                        case 3:
                            ss.setColorID(lcol.get((int) cell.getNumericCellValue()));
                            break;
                        case 4:
                            ss.setVehicleType(cell.getStringCellValue());
                            break;
                        case 5:
                            ss.setCostPrice((int) cell.getNumericCellValue());
                            break;
                        case 6:
                            ss.setSpareParts((int) cell.getNumericCellValue());
                            break;
                        case 7:
                            ss.setLaborCost((int) cell.getNumericCellValue());
                            break;
                        case 8:
                            ss.setRegistration_Date(String.valueOf(cell.getNumericCellValue()));
                            break;
                        case 9:
                            ss.setMileage((int) cell.getNumericCellValue());
                            break;
                        case 10:

                            for (int i = 0; i < ldat.size(); i++) {
                                if (ldat.get(i).getDateKey().equals(String.valueOf(cell.getNumericCellValue()))) {
                                    ss.setPurchaseDate(ldat.get(i));
                                    i = ldat.size();
                                }
                            }
                            break;
                        case 11:
                            ss.setVehicleAgeInYears((int) cell.getNumericCellValue());
                            break;
                    }
                    typeIn++;
                }
                typeIn = 0;
                lsto.add(ss);
            } else {
                //avoid the first row, column names
                flag = true;
            }

        }
        Map map = new HashMap();
        Map map1 = new HashMap();

        //O(n)
        //map for top3brands
        //map1 fro top3colors
        for (int i = 0; i < lsto.size(); i++) {
            String makee = lsto.get(i).getMake();
            if (map.get(makee) != null) {
                
                map.replace(makee, ((int) map.get(makee) + 1));
                
            } else {
                map.put(makee, 1);
            }

            String colorr = lsto.get(i).getColorID().getColor();
            if (map1.get(colorr) != null) {
                map1.replace(colorr, (int) map1.get(colorr) + 1);
            } else {
                map1.put(colorr, 1);
            }
        }
        System.out.println("Summarize");
        System.out.println(map.toString());
        System.out.println(map1.toString());
        System.out.println("--------------");

        String[] top3 = {"","",""};
        int[] ctop3 = {0,0,0};
        //O(k)
        //K = maps size
        map.forEach((k, v) -> {
            int temp = (int) v;
            int ttemp;
            String tempT = (String)k;
            String ttempT;
            int i = 0;
            //O(3)
            while (i < 3) {
                if(ctop3[i] == 0){ctop3[i]=temp;top3[i] = tempT;}
                if (ctop3[i] < temp) {
                    ttemp = ctop3[i];
                    ctop3[i] = temp;
                    temp = ttemp;
                    ttempT = top3[i];
                    top3[i] = tempT;
                    tempT = ttempT;
                }
                i++;
            }

        });
        //
        System.out.println("Top 3 brands");
        for(int h=0;h<3;h++){
            System.out.println(top3[h]);
        }
        System.out.println("--------------");
        
        String[] ttop3 = {"","",""};
        int[] cttop3 = {0,0,0};
        //O(k)
        //K = maps size
        map1.forEach((k, v) -> {
            int temp = (int) v;
            int ttemp;
            String tempT = (String)k;
            String ttempT;
            int i = 0;
            //O(3)
            while (i < 3) {
                if(cttop3[i] == 0){cttop3[i]=temp;ttop3[i] = tempT;}
                if (cttop3[i] < temp) {
                    ttemp = cttop3[i];
                    cttop3[i] = temp;
                    temp = ttemp;
                    ttempT = ttop3[i];
                    ttop3[i] = tempT;
                    tempT = ttempT;
                }
                i++;
            }

        });
        //
        System.out.println("Top 3 colors");
        for(int h=0;h<3;h++){
            System.out.println(ttop3[h]);  
        }
        
        
        
    }

}
