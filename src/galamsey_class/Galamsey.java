// The package name
package galamsey_class;

/**
 * Definition of the <strong>Galamasey</strong> class
 */
public class Galamsey {
    // Instate variables
    private Position position;
    private int galamseyYear;
    private int colourValue;
    private vegColour vegetationColour;

    /**
     * enum object for the vegetation colour
     */
    protected enum vegColour{
        green, yellow, brown
    }

    /**
     *  Overloaded method using the position object
     * @param position the position object of the galamsey
     * @param galamseyYear the year the galamsy happened
     * @param colour the colour of the vegetation
     */
    public Galamsey(Position position, int galamseyYear, vegColour colour) {
        this.position = position;
        this.galamseyYear = galamseyYear;
        this.colourValue = colour.ordinal()+1;
        this.vegetationColour = colour;
    }

    /**
     * Overloaded constructor using the longitudes and latitudes
     * @param longitude the longitude of the galamsey
     * @param latitude the latitude of the galamsey
     * @param galamseyYear the year the galamsey happened
     * @param colour the colour of the vegetation
     */
    public Galamsey(double longitude, double latitude, int galamseyYear, vegColour colour) {
        this.position = new Position(longitude, latitude);
        this.galamseyYear = galamseyYear;
        this.colourValue = colour.ordinal()+1;
        this.vegetationColour = colour;
    }

    /**
     * Accessor method for the position
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Mutator method for the position using the position object
     * @param position the new position
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Mutator method for the position using longitude and latitude
     * @param longitude the new longitude
     * @param latitude the new latitude
     */
    public void setPosition(double longitude, double latitude) {
        this.position = new Position(longitude, latitude);
    }

    /**
     * Accessor method for the year of galamsey
     * @return the year of galamsey
     */
    public int getGalamseyYear() {
        return galamseyYear;
    }

    /**
     * Mutator method for the year of galamsey
     * @param galamseyYear the new year of galamsey
     */
    public void setGalamseyYear(int galamseyYear) {
        this.galamseyYear = galamseyYear;
    }

    /**
     * Accessor method for the colour of the vegetation
     * @return the colour of the vegetation
     */
    public vegColour getVegetationColour() {
        return vegetationColour;
    }

    /**
     * Mutator method for the colour of vegetation
     * @param vegetationColour the new colour of vegetation
     */
    public void setVegetationColour(vegColour vegetationColour) {
        this.vegetationColour = vegetationColour;
        this.colourValue = vegetationColour.ordinal() + 1;
    }

    /**
     * Accessor method for the value of the colour
     * @return the value of the colour
     */
    public int getColourValue(){
        return this.colourValue;
    }

    /**
     * toString method for the galamsey class
     * @return the galamsey in string format
     */
    @Override
    public String toString() {
        return "Galamsey {" +
                 position.toString() +
                ", galamseyYear = " + galamseyYear +
                ", colourValue = " + colourValue +
                ", vegetationColour = " + vegetationColour +
                '}';
    }

    /**
     * equals method for the galamsey class
     * @param object the object to compare
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Galamsey galamsey = (Galamsey) object;
        return galamseyYear == galamsey.galamseyYear &&
                colourValue == galamsey.colourValue &&
                position.equals(galamsey.position) &&
                vegetationColour == galamsey.vegetationColour;
    }

    /**
     * Main method to facilitate code running
     * @param args
     */
   public static void main(String[] args){
        Galamsey gal = new Galamsey(20, 60, 2018, vegColour.brown);
        System.out.println(gal.toString());
   }

}
