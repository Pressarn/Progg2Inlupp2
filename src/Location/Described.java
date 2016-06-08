package Location;

import GraphicalUI.LocationInfo;
import GraphicalUI.Position;
import Marker.Marker;

/**
 * Created by Aaron on 2016-04-14.
 */
public class Described extends Location {

    public final String description;

    public Described(String name, Position position, Marker marker, Category typ, String description, LocationInfo locationInfo) {
        super(name, position, marker, typ, locationInfo);
        this.description = description;
    }

    public String toString(){
        return name + " " + position + " " + category + " " + description;
    }
}