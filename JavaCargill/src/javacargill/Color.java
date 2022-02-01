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
public class Color {
    private int ColorID;
    private String Color;

    //constructor for the ones readed from the xlsx

    public Color(int ColorID, String Color) {
        this.ColorID = ColorID;
        this.Color = Color;
    }

    public Color() {
    }
    
    //constructor for new ones
    public Color(String Color) {
        //this.ColorID = ColorID;   incremental int, method set will receive the last id added +1
        this.Color = Color;
    }

    public int getColorID() {
        return ColorID;
    }

    //model must send the last id +1
    public void setColorID(int ColorID) {
        this.ColorID = ColorID;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
}
