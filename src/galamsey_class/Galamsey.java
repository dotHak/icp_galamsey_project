package galamsey_class;

public class Galamsey {
    private Position position;
    private int galamseyYear;
    private int colourValue;
    private vegColour vegetationColour;

    protected enum vegColour{
        green, yellow, brown
    }

    public Galamsey(Position position, int galamseyYear, vegColour colour) {
        this.position = position;
        this.galamseyYear = galamseyYear;
        this.colourValue = colour.ordinal()+1;
        this.vegetationColour = colour;
    }

    public Galamsey(double longitude, double latitude, int galamseyYear, vegColour colour) {
        this.position = new Position(longitude, latitude);
        this.galamseyYear = galamseyYear;
        this.colourValue = colour.ordinal()+1;
        this.vegetationColour = colour;
    }

    public static int getColourOrdinal(vegColour colour){
        switch (colour){
            case green:
                return 1;
            case yellow:
                return 2;
            case brown:
                return 3;
            default:
                return 0;
        }
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setPosition(double longitude, double latitude) {
        this.position = new Position(longitude, latitude);
    }

    public int getGalamseyYear() {
        return galamseyYear;
    }

    public void setGalamseyYear(int galamseyYear) {
        this.galamseyYear = galamseyYear;
    }

    public vegColour getVegetationColour() {
        return vegetationColour;
    }

    public void setVegetationColour(vegColour vegetationColour) {
        this.vegetationColour = vegetationColour;
    }

    public int getColourValue(){
        return this.colourValue;
    }

    @Override
    public String toString() {
        return "Galamsey {" +
                 position.toString() +
                ", galamseyYear = " + galamseyYear +
                ", colourValue = " + colourValue +
                ", vegetationColour = " + vegetationColour +
                '}';
    }

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

   public static void main(String[] args){
        Galamsey gal = new Galamsey(20, 60, 2018, vegColour.brown);
        System.out.println(gal.toString());
   }

}
