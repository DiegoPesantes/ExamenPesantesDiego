public class CanalTelemetria {

    private int idCanal;
    private String nombre;
    private static double ultimoValor = -1.0;
    private static int contadorCanales = 0;


    private String verificarMedicion(double ultimoValor){
        if (ultimoValor >=0 && ultimoValor<=100);
            else{
                return "valor incorrecto";
        }
    }

    public CanalTelemetria(int idCanal, String nombre, double ultimoValor){
        setNombre(nombre);

    }

    public int getIdCanal(){
        return idCanal;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    private int verificarID(){
        if(idCanal<0)
            return verificarID();
        return 0;
    }

    private String getNombre(){
        if (nombre == null || nombre.isBlank())
            return "Error";
        return "";
    }

    private void registrarMedicion(double valor){

    }






}
