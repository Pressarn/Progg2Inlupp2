package Marker;

import GraphicalUI.LocationInfo;
import Location.Category;

/**
 * Created by Aaron on 2016-04-20.
 */
public class DescribedMarker extends Marker {
    public DescribedMarker(int x, int y, Category category, LocationInfo locationInfo, boolean marked) {
        super(x, y, category, locationInfo, marked);
    }
}
