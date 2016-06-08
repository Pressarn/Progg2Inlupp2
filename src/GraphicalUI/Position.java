package GraphicalUI;

/**
 * Created by Aaron on 2016-04-19.
 */
public class Position {

    private int xpos;
    private int ypos;


    public  Position (int xpos, int ypos){
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public int getX (){ return xpos; }
    public int getY () { return ypos; }

    public String toString(){
        return "X = " + xpos + " Y = " + ypos;
    }
}
