import java.util.List;

public class main {
    public static void main (String[] args) {
        EstacionMonitoreo es1 = new EstacionMonitoreo();
        SensorHumedadSuelo shumedad = new SensorHumedadSuelo("1", "Cumaral", true, 15.2);
        SensorTemperatura sTemperatura = new SensorTemperatura("2", "Villavicencio", false, 12.3);
        es1.agregarSensor(shumedad);
        es1.agregarSensor(sTemperatura);
        es1.procesarLecturas(); 


         List<Sensor> alerta = es1.identificarSensor();
         if (alerta.size() == 0) {
        System.out.println(" No hay sensores en estado crítico");
        } else {
        System.out.println(" Hay " + alerta.size() + " sensor(es) en estado crítico:");
        for (int i = 0; i < alerta.size(); i++) {
            Sensor d = alerta.get(i);
            System.out.println( d.getid() + " - " + d.getubicacion());
        }
    }
   
    
}

}
