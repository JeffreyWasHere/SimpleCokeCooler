public class CokeCooler {
    private double numCoke;
    private double drinkTime;
    private double totalDrink;
    
    // constructor
    public CokeCooler(double numCoke){
        this.numCoke = numCoke;
        this.drinkTime = 0.0;
        this.totalDrink = 0.0;
    }

    // decrease method
    public void drinkCoke(double amount){
        numCoke -= amount;
        drinkTime ++;
        totalDrink += amount;
    }
    
    // increase method
    public void refillCoke(double amount){
        numCoke += amount;
    }
    // getter
    public double getCurrentCoke(){
        return numCoke;
    }

    // get avarage
    public double getAverageCokeDrunk(){
        return totalDrink / drinkTime;
    }
}
