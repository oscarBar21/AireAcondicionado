public class AireAcondicionado{
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int contadorSubirTemperatura;
    private int contadorBajarTemperatura;
    private double temperaturaMaxSelec;
    private double temperaturaMinSelec;
    

    public AireAcondicionado(double temperaturaMin, double temperaturaMax)
    {
        temperatura = 15.0 ;
        min = temperaturaMin;
        max = temperaturaMax;
        incremento = 5.0;
        contadorSubirTemperatura = 0;
        contadorBajarTemperatura = 0;
        temperaturaMaxSelec = temperatura;
        temperaturaMinSelec = temperatura;
    }
  
    public void subirTemperatura(){
        if(temperatura + incremento <= max){
            temperatura = temperatura + incremento;
            contadorSubirTemperatura = contadorSubirTemperatura + 1;
            if(temperatura > temperaturaMaxSelec){
                temperaturaMaxSelec = temperatura;
            }
        }
    }
 
    public void bajarTemperatura(){
        if(temperatura - incremento >= min){
            temperatura= temperatura - incremento;
            contadorBajarTemperatura = contadorBajarTemperatura + 1;
            if(temperatura < temperaturaMinSelec){
                temperaturaMinSelec = temperatura;
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
        int tempCambiada = contadorSubirTemperatura + contadorBajarTemperatura;
        
        System.out.println(" Temperatura actual: " + temperatura + " - Temp. maxima posible: " + max + 
                           " - Temp. minima posible: " + min + " - Temp. minima seleccionada: " +  temperaturaMinSelec +
                           " - Temp. max seleccionada: " + temperaturaMaxSelec + " - Temperatura cambiada " + tempCambiada + " veces");
    }
    
    public String getDetalles(){
        int tempCambiada = contadorSubirTemperatura + contadorBajarTemperatura;
        
        return " Temperatura actual: " + temperatura + " - Temp. maxima posible: " + max + 
                           " - Temp. minima posible: " + min + " - Temp. minima seleccionada: " +  temperaturaMinSelec +
                           " - Temp. max seleccionada: " + temperaturaMaxSelec + " - Temperatura cambiada " + tempCambiada + " veces";
    }
}
