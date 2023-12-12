package src;

public class Main {

    public static void main(String[] args) {
        Cities cities = new Cities();

        City berlin = new City("Berlin", 3645000);
        City copenhagen = new City("Copenhagen", 602481);
        City paris = new City("Paris", 2161000);
        City london = new City("London", 8982000);
        City barcelona = new City("Barcelona", 1620000);

        cities.addCity(berlin);
        cities.addCity(copenhagen);
        cities.addCity(paris);
        cities.addCity(london);
        cities.addCity(barcelona);

        System.out.println(cities.getBiggestCity());
        System.out.println(cities.getTotalPopulation());
        System.out.println(cities.getAveragePopulation());
    }
}
