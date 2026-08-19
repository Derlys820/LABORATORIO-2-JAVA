public abstract class Sensor {

    
    private String id;
    private String ubicacion;
    private boolean activo;
    public Sensor (){}
    public Sensor( String id, String ubicacion,boolean activo){
        this.id = id;
        this.ubicacion=ubicacion;
        this.activo=activo;
        }

     public String getid(){return id;}
     public String getubicacion(){return ubicacion;}
    public boolean getactivo(){return activo;}
    public void setId(String id){
        this.id=id;
        }
    public void setubicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
    public void setactivo(boolean activo){
        this.activo=activo;
    }
    

    public abstract double tomarLectura();
    public String evaluarEstado(){
        return "";
    };

}
