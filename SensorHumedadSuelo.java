public class SensorHumedadSuelo extends Sensor{

private double humedadPct;
public SensorHumedadSuelo(String id, String ubicacion,boolean activo,double humedadPct){
super(id,ubicacion,activo);
this.humedadPct=humedadPct;
}
@Override
public double tomarLectura() {
    humedadPct =Math.random()*100;
        return humedadPct;
}

public double getHumedadPct(){return humedadPct;}
 public void sethumedadPct(double humedadPct){
    this.humedadPct=humedadPct;
 }

 @Override
 public boolean identificarSensor(){
    return this.humedadPct<20;

 }
}