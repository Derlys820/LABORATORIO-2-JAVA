public class SensorTemperatura extends Sensor {

    private double celsius;

    public SensorTemperatura(String id, String ubicacion,boolean activo,double celsius){
        super(id,ubicacion,activo);
        this.celsius=celsius;
    }
    @Override
    public double tomarLectura() {
        celsius =((15)+Math.random()*(45-15));
        return celsius;
    }
    public double getCelsius (){
        return celsius;}
    public void setCelsius(double celsius){
        this.celsius=celsius;
    }
}