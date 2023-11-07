public class Country {
    private String name;

    private Integer population;

    private Double area;

    private Double populationDensity;

    public Country(String name, Integer population, Double area){
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName(){
        return name;
    }

    public Integer getPopulation(){
        return population;
    }

    public Double getArea(){
        return area;
    }

    public Double getPopulationDensity(){
        return  population / area;
    }
}
