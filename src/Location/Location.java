package Location;

/**
 * Created by Aaron on 2016-04-11.
 */
public abstract class Location {

    private String name;
    private double x;
    private double y;

    public Location (String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
