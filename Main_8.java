package OB_8;

public class Main_8 {

    public static void main(String[] args) {
        // 4. Creación del objeto persona
        Persona persona = new Persona();

        // 5.1. Uso de los sets
        persona.setEdad(28);
        persona.setNombre("Pierinna");
        persona.setTelefono(986936011);

        // 5.2. Uso de los gets
        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        // 5.3. Mostrar en la consola
        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(telefono);
    }
}

// 1. Creación de la clase Persona
class Persona {

    // 2. Creación de las variables privadas edad, nombre y teléfono
    private int edad;
    private String nombre;
    private int telefono;

    // 3.1. Creación de sets
    public void setEdad(int valor){
        this.edad = valor;
    }
    public void setNombre(String valor){
        this.nombre = valor;
    }
    public void setTelefono(int valor){
        this.telefono = valor;
    }

    // 3.2. Creación de gets
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
}