package Marker;

import Location.Category;
import GraphicalUI.LocationInfo;

/**
 * Created by Aaron on 2016-04-20.
 */
public class NamedMarker extends Marker {
    public NamedMarker(int x, int y, Category category, LocationInfo locationInfo, boolean marked) {
        super(x, y, category, locationInfo, marked);
    }
}
