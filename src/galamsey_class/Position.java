package galamsey_class;

public class Position {
    private double longitude;
    private double latitude;

    public Position(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Position position = (Position) object;
        return Double.compare(position.longitude, longitude) == 0 &&
                Double.compare(position.latitude, latitude) == 0;
    }

    @Override
    public String toString() {
        return "Position {" +
                "longitude=" + longitude + '\u00B0' +
                ", latitude=" + latitude + '\u00B0' +
                '}';
    }

    public static void main(String[] args){
        Position pos = new Position(20, 60);
        System.out.println(pos.toString());
    }
}
