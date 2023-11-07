import java.util.ArrayList;
import  java.util.Collections;
public class Country_Main {
    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("USA", 473, 38568.55));
        countries.add(new Country("Nigeria", 65753, 14358.5));
        countries.add(new Country("Ghana", 30560, 5123.99));

        Country largestAreaCountry = Collections.max(countries, (c1, c2) -> Double.compare(c1.getArea(), c2.getArea()) );
        Country largestPopulationCountry = Collections.max(countries, (c1, c2) -> Integer.compare(c1.getPopulation(), c2.getPopulation()) );
        Country largestPopulationDensity = Collections.max(countries, (c1,c2) -> Double.compare(c1.getPopulationDensity(), c2.getPopulationDensity()));

        System.out.println("Largest country is: " + largestAreaCountry.getName());
        System.out.println("The country with the largest population is: " + largestPopulationCountry.getName());
        System.out.println("The country with the largest population density is: " + largestPopulationDensity.getName());
    }
}