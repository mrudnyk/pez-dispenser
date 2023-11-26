package lv.acodemy;

public class PezDispenser {

    private String name;

    private String color;

    private String seriesName;

    private int pezCapacity;

    private int realNumber;

    @Override
    public String toString() {
        return "PezDispenser{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", seriesName='" + seriesName + '\'' +
                ", pezCapacity=" + pezCapacity +
                ", realNumber=" + realNumber +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(int realNumber) {
        this.realNumber = realNumber;
    }

    public PezDispenser(int realNumber) {
        this.name = "Mickey Mouse";
        this.color = "red";
        this.seriesName = "Disney";
        this.pezCapacity = 6;
        this.realNumber = realNumber;
    }

    public int getPezCapacity() {
        return pezCapacity;
    }

    public void setPezCapacity(int pezCapacity) {
        this.pezCapacity = pezCapacity;
    }

    public void giveCandies(int numberOfCandies) {
        if (getRealNumber() == 0) {
            System.out.println("Pez can't give you any candy.. Please charge me!");
        } else if (numberOfCandies > getRealNumber()) {
            System.out.println("I have only " + getRealNumber() + " candies!");
            System.out.println("I give you " + getRealNumber() + " candies. Now I have 0 candies!");
            setRealNumber(0);
        } else {
            System.out.println("I give you " + numberOfCandies + " candies!");
            setRealNumber(getRealNumber() - numberOfCandies);
            System.out.println("Now I have " + getRealNumber() + " candies!");
        }
    }

    public void chargeCandies(int candiesNumber) {
        if (candiesNumber >= getPezCapacity() || getRealNumber() + candiesNumber > getPezCapacity()) {
            int diff = getPezCapacity() - getRealNumber();
            System.out.println("Maximum capacity = " + getPezCapacity() + ". I will charge " + diff + " candies!");
            setRealNumber(getPezCapacity());
            System.out.println("Now I am full!");
        } else if (getRealNumber() == getPezCapacity()) {
            System.out.println("I am full! You can't charge any candy!");
        } else {
            System.out.println("I charge " + candiesNumber + " candies!");
            setRealNumber(getRealNumber() + candiesNumber);
            System.out.println("Now i have " + getRealNumber() + " candies!");
        }
    }


}





