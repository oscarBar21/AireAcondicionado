public class AireAcondicionado
{
    private double temperatura;
    private double min;
    private double max;
    private double incremento;

    public AireAcondicionado(double temperaturaMin, double temperaturaMax)
    {
        temperatura = 15.0 ;
        min = temperaturaMin;
        max = temperaturaMax;
        incremento = 5.0;
    }
  
    public void subirTemperatura(){
        if( temperatura + incremento <= max){
            temperatura = temperatura + incremento;
        }
    }
 
    public void bajarTemperatura(){
        if(temperatura - incremento >= min){
            temperatura = temperatura - incremento;
        }
    }
    
    public double getTemperatura(){
        return temperatura ;
    }
    
    public void setIncremento(double incremento){
        if (incremento >= 0){
            this.incremento = incremento;
        }
    }
}
