package src;

import java.util.ArrayList;
import java.util.Collections;

public class Cities {

    private ArrayList<City> listOfCities = new ArrayList<>();

    public void addCity (City city)
    {
        listOfCities.add(city);
    }

    public String getBiggestCity()
    {
        City biggestCity = listOfCities.get(0);

        for (City city : listOfCities)
        {
            if (city.getPopulation() > biggestCity.getPopulation())
            {
                biggestCity = city; //Updates the city everytime the new city is bigger.
            }
        }
        return biggestCity.getName();
    }

    public int getTotalPopulation()
    {
        int totalPopulation = 0;

        for (City city : listOfCities)
        {
           totalPopulation += city.getPopulation();
        }

        return totalPopulation;
    }

    public int getAveragePopulation()
    {
        return getTotalPopulation() / listOfCities.size();
    }
}
