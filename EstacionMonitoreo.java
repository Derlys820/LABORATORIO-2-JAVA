import java.util.ArrayList;
import java.util.List;

public class EstacionMonitoreo {
    private List<Sensor> sensores;
    public EstacionMonitoreo(){
        sensores= new ArrayList<>();
    }
    public void agregarSensor( Sensor sensor){
        sensores.add(sensor);
    }
    public void procesarLecturas(){
     for (int i = 0; i < sensores.size(); i++) {
      Sensor  d = sensores.get(i);
      d.tomarLectura();
    }
}
     public List<Sensor> identificarSensor(){
        List<Sensor> critica = new ArrayList<>();
        for (int i = 0; i < sensores.size(); i++) {
            Sensor s = sensores.get(i);
            if (s.identificarSensor()) {  
                critica.add(s);
            }
        }
        return critica;
    }
    };
