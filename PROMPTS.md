primera pregunta:
public abstract class Sensor {

    
    private string id;
    private string ubicacion;
    private boolean activo;
    public Sensor (){}
    public Sensor( string id, string ubicacion,boolean activo){
        this.id = id;
        this.ubicacion=ubicacion;
        this.activo=activo;
        }

     public string getid(){return id;}
     public string getubicacion(){return ubicacion;}
    public boolean getactivo(){return activo;}
    public void setId(string id){
        this.id=id;
        }
    public void setubicacion(string ubicacion){
        this.ubicacion=ubicacion;
    }
    public void setactivo(boolean activo){
        this.activo=activo;
    }
    

    public abstract double tomarLectura(){}
    public string evaluarEstado(){} 

}