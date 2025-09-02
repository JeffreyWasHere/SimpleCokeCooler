public class CokeCooler {
    private int numCoke;
    
    //constructer
    public CokeCooler(){
        numCoke = 1;
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
