public class AireAcondicionado
{
    private double temperatura;

    public AireAcondicionado()
    {
        temperatura = 15.0 ;
    }
    
    public void subirTemperatura(){
        temperatura = temperatura + 5;
    }
    
    public void bajarTemperatura(){
        temperatura = temperatura - 5;
    }
    
    public double getTemperatura(){
        return temperatura ;
    }
}
