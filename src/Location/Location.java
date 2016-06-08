package Location;

import GraphicalUI.Position;
import Marker.Marker;

public abstract class Location {

    public final String name;
    public final Position position;
    public final Marker marker;
    public final Category category;

    public Location (String name, Position position, Marker marker, Category category){
        this.name = name;
        this.position = position;
        this.marker = marker;
        this.category = category;
    }
    public String toString(){
        return name + position + category;
    }
}