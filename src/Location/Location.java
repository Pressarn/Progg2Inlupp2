package Location;

import GraphicalUI.Position;
import Marker.Marker;
import GraphicalUI.LocationInfo;

public abstract class Location {

    public final String name;
    public final Position position;
    public final Marker marker;
    public final Category category;
    public final LocationInfo locationInfo;

    public Location (String name, Position position, Marker marker, Category category, LocationInfo locationInfo){
        this.name = name;
        this.position = position;
        this.marker = marker;
        this.category = category;
        this.locationInfo = locationInfo;
    }
    public String toString(){
        return name + position + category;
    }
}