public class AireAcondicionado{
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int contadorTemp1;
    private int contadorTemp2;
    private double temperaturaSub;
    private double temperaturaBaj;
    

    public AireAcondicionado(double temperaturaMin, double temperaturaMax)
    {
        temperatura = 15.0 ;
        min = temperaturaMin;
        max = temperaturaMax;
        incremento = 5.0;
        contadorTemp1 = 0;
        contadorTemp2 = 0;
        temperaturaSub = temperatura;
        temperaturaBaj = temperatura;
    }
  
    public void subirTemperatura(){
        if(temperatura + incremento <= max){
            temperatura = temperatura + incremento;
            contadorTemp1 = contadorTemp1 + 1;
            if(temperatura > temperaturaSub){
                temperaturaSub = temperatura;
            }
        }
    }
 
    public void bajarTemperatura(){
        if(temperatura - incremento >= min){
            temperatura= temperatura - incremento;
            contadorTemp2 = contadorTemp2 + 1;
            if(temperatura < temperaturaBaj){
                temperaturaBaj = temperatura;
            }
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
    
    public void mostrarEstadisticas(){
        int tempCambiada = contadorTemp1 + contadorTemp2;
        
        System.out.println(" Temperatura actual: " + temperatura + " - Temp. maxima posible: " + max + 
                           " - Temp. minima posible: " + min + " - Temp. minima seleccionada: " +  temperaturaBaj +
                           " - Temp. max seleccionada: " + temperaturaSub + " - Temperatura cambiada " + tempCambiada + " veces");
    }
    
    public String getDetalles(){
        int tempCambiada = contadorTemp1 + contadorTemp2;
        
        return " Temperatura actual: " + temperatura + " - Temp. maxima posible: " + max + 
                           " - Temp. minima posible: " + min + " - Temp. minima seleccionada: " +  temperaturaBaj +
                           " - Temp. max seleccionada: " + temperaturaSub + " - Temperatura cambiada " + tempCambiada + " veces";
    }
}
