package galamsey_class;

import java.util.ArrayList;
import java.util.Objects;

public class Observatory {
    private String observatoryName;
    private String countryName;
    private int yearStarted;
    private double areaCovered;
    private ArrayList<Galamsey> galamseyList;



    public String getObservatoryName() {
        return observatoryName;
    }

    public void setObservatoryName(String observatoryName) {
        this.observatoryName = observatoryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public double getAreaCovered() {
        return areaCovered;
    }

    public void setAreaCovered(double areaCovered) {
        this.areaCovered = areaCovered;
    }

    public ArrayList<Galamsey> getGalamseyList() {
        return galamseyList;
    }

    public void setGalamseyList(ArrayList<Galamsey> galamseyList) {
        this.galamseyList = galamseyList;
    }


    public int largestColourValue(){
        int largestColourValue = 1;
        for(Galamsey galamsey: galamseyList){
            if(galamsey.getColourValue() > largestColourValue){
                largestColourValue = galamsey.getColourValue();
            }
        }
        return largestColourValue;
    }


    public double averageColourValue(){
        double average = 0;
        int number = 0;
        for(Galamsey galamsey: galamseyList){
           average += galamsey.getColourValue();
           number++;
        }
        return  average/number;
    }

    public void listGalamseys(int number){
        for(Galamsey galamsey: galamseyList){
            if(galamsey.getColourValue() > number){
                System.out.println(galamsey.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Observatory {" +
                "observatoryName = '" + observatoryName + '\'' +
                ", countryName = '" + countryName + '\'' +
                ", yearStarted = " + yearStarted +
                ", areaCovered = " + areaCovered + " \u33A2" +
                '}';
    }

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




    public static void main(String[] args){
        Observatory obs = new Observatory();
        System.out.println(obs.toString());
    }
}
