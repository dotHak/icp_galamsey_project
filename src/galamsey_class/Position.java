// Package Name
package galamsey_class;

/**
 * Definition of the <strong>Position</strong> class
 * @author Hubert Apana
 * @version  1.0.0
 */
public class Position {
    // Instant variables
    private double longitude; //The longitude of the position
    private double latitude;  // The latitude of the position

    /**
     * Overloaded Constructor for the position class
     * @param longitude the position longitude
     * @param latitude the position latitude
     */
    public Position(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Accessor method for the longitude
     * @return the longitude of the position
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Mutator method for the longitude
     * @param longitude the new longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Accessor method for the latitude
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Mutator method for the latitude
     * @param latitude the latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * equals method
     * @param object the object to compare
     * @return boolean
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Position position = (Position) object;
        return Double.compare(position.longitude, longitude) == 0 &&
                Double.compare(position.latitude, latitude) == 0;
    }

    /**
     * toString method
     * @return the position in string format
     */
    @Override
    public String toString() {
        return "Position {" +
                "longitude=" + longitude + '\u00B0' +
                ", latitude=" + latitude + '\u00B0' +
                '}';
    }

    /**
     * Main method to facilitate the code execution
     * @param args
     */
    public static void main(String[] args){
        Position pos = new Position(20, 60);
        System.out.println(pos.toString());
    }
}
