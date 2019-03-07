// The package name
package galamsey_class;

// The program dependencies
import java.util.ArrayList;
import java.util.Objects;

/**
 * Definition of the <strong>Observatory</strong> class
 * @author Hubert Apana
 * @version 1.0.0
 */
public class Observatory {
    private String observatoryName;
    private String countryName;
    private int yearStarted;
    private double areaCovered;
    private ArrayList<Galamsey> galamseyList;

    /**
     * Overloaded Constructor for the observatory
     * @param observatoryName the name of the observatory
     * @param countryName the country the observatory occured
     * @param yearStarted the year the galamsey started
     * @param areaCovered the area covered in kilometers square
     */
    public Observatory(String observatoryName, String countryName, int yearStarted, double areaCovered) {
        this.observatoryName = observatoryName;
        this.countryName = countryName;
        this.yearStarted = yearStarted;
        this.areaCovered = areaCovered;
        this.galamseyList = new ArrayList<>();
    }

    /**
     * Accessor method for the observatory name
     * @return the observatory name
     */
    public String getObservatoryName() {
        return observatoryName;
    }

    /**
     * Mutator method for the observatory name
     * @param observatoryName the new observatory name
     */
    public void setObservatoryName(String observatoryName) {
        this.observatoryName = observatoryName;
    }

    /**
     * Accessor method for the name of country
     * @return the name of the country of the observatory
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Mutator method for the name of the country
     * @param countryName the new name of the country
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Accessor method for year the observatory started
     * @return the year the observatory started
     */
    public int getYearStarted() {
        return yearStarted;
    }

    /**
     * Mutator method for the year of the observatory started
     * @param yearStarted the new year of the observatory started
     */
    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    /**
     * Accessor method the area covered by the galamsey
     * @return the area covered by the galamsey
     */
    public double getAreaCovered() {
        return areaCovered;
    }

    /**
     * Mutator method for the area covered by the galamsey
     * @param areaCovered the new area covered
     */
    public void setAreaCovered(double areaCovered) {
        this.areaCovered = areaCovered;
    }

    /**
     * Accessor method for the list of galamseys in the observatory
     * @return the list of galamseys in the observatory
     */
    public ArrayList<Galamsey> getGalamseyList() {
        return galamseyList;
    }

    /**
     * Mutator method for the list of galamseys in the observatory
     * @param galamseyList the new list of galamseys
     */
    public void setGalamseyList(ArrayList<Galamsey> galamseyList) {
        this.galamseyList = galamseyList;
    }


    /**
     * Method to return the largest colour value
     * @return the largest colour value
     */
    public int largestColourValue(){
        int largestColourValue = 1;
        for(Galamsey galamsey: galamseyList){
            if(galamsey.getColourValue() > largestColourValue){
                largestColourValue = galamsey.getColourValue();
            }
        }
        return largestColourValue;
    }


    /**
     * Method to calculate the average of the colour values
     * @return the average of the colour values
     */
    public double averageColourValue(){
        double average = 0;
        int number = 0;
        for(Galamsey galamsey: galamseyList){
           average += galamsey.getColourValue();
           number++;
        }
        return  average/number;
    }

    /**
     * Method to return a list of galamseys with colour value greater than the input number
     * @param number the colour
     * @return the list of galamseys with colour value greater than the input number
     */
    public ArrayList<Galamsey> listGalamseys(int number){
        ArrayList<Galamsey> newList = new ArrayList<>();
        for(Galamsey galamsey: galamseyList){
            if(galamsey.getColourValue() > number){
                newList.add(galamsey);
            }
        }
        return newList;
    }

    /**
     * toString method for the observatory class
     * @return the observatory object in string format
     */
    @Override
    public String toString() {
        return "Observatory {" +
                "observatoryName = '" + observatoryName + '\'' +
                ", countryName = '" + countryName + '\'' +
                ", yearStarted = " + yearStarted +
                ", areaCovered = " + areaCovered + " \u33A2" +
                '}';
    }

    /**
     * equals method for the observatory class
     * @param object the object to compare
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Observatory that = (Observatory) object;
        return yearStarted == that.yearStarted &&
                Double.compare(that.areaCovered, areaCovered) == 0 &&
                Objects.equals(observatoryName, that.observatoryName) &&
                Objects.equals(countryName, that.countryName);
    }

    /**
     * Main method to facilitate code execution
     * @param args
     */
    public static void main(String[] args){
        Observatory obs = new Observatory("Test", "Ghana", 2018, 250);
        Galamsey gal1 = new Galamsey(20, 60, 2018, Galamsey.vegColour.brown);
        Galamsey gal2 = new Galamsey(20, 60, 2018, Galamsey.vegColour.green);
        Galamsey gal3 = new Galamsey(20, 60, 2018, Galamsey.vegColour.green);
        Galamsey gal4 = new Galamsey(20, 60, 2018, Galamsey.vegColour.yellow);
        Galamsey gal5 = new Galamsey(20, 60, 2018, Galamsey.vegColour.brown);

        obs.getGalamseyList().add(gal1);
        obs.getGalamseyList().add(gal2);
        obs.getGalamseyList().add(gal3);
        obs.getGalamseyList().add(gal4);
        obs.getGalamseyList().add(gal5);

        System.out.println(obs.largestColourValue());
        System.out.println(obs.averageColourValue());

        for(Galamsey gala : obs.listGalamseys(0)){
            System.out.println(gala.toString());
        }
    }
}
