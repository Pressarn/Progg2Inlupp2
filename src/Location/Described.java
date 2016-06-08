package Location;

import GraphicalUI.Position;
import Marker.Marker;

/**
 * Created by Aaron on 2016-04-14.
 */
public class Described extends Location {

    public final String description;

    public Described(String name, Position position, Marker marker, Category typ, String description) {
        super(name, position, marker, typ);
        this.description = description;
    }
}