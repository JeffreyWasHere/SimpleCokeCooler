public class CokeCooler {
    private int numCoke;
    
    //constructer
    public CokeCooler(int nc){
        numCoke = nc;
    }

    //drink method
    public void drinkCoke(){
        numCoke -= 1;
    }
    
    //refill method
    public void refillCoke(){
        numCoke += 1;
    }
    //getter
    public int getCount(){
        return numCoke;
    }
}
