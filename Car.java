public class Car {
    private boolean isDriving;
    private Double fuelEfficiency;

    private Double fuel;

    private Double initialFuelLevel;

    private Double distance;

    private Double gasLevel;

    public Car (Double fuelEfficiency, Double initialFuelLevel, Boolean isDriving){
        this.fuelEfficiency = fuelEfficiency;
        this.initialFuelLevel = 0.00;
        this.isDriving = false;
        this.gasLevel = gasLevel;
    }

    public Double drive (Double distance){
        distance = 4.3;
        if (isDriving  == false){
            gasLevel = initialFuelLevel;
            return  gasLevel;
        }
        else {
            fuel = distance / fuelEfficiency;
           return  gasLevel = initialFuelLevel - fuel;
        }
    }

    public Double getGasLevel(){

        return gasLevel;
    }

    public Double addGas (Double gasLevel, Double gasToAdd){
        return gasLevel += gasToAdd;
    }
}
