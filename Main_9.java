package OB_9;

public class Main_9 {

    public static void main(String[] args) {

        // 3. Crear el objeto de clase Cliente
        Cliente cliente = new Cliente();

        cliente.setEdad(29);
        cliente.setNombre("Guaripolo");
        cliente.setTelefono(987654321);
        cliente.setCredito(4000);

        System.out.println("Datos del cliente:");
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        // 4.2. Crear el objeto de clase Trabajador
        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(30);
        trabajador.setNombre("Sopapiglobo");
        trabajador.setTelefono(123456789);
        trabajador.setSalario(2000);

        System.out.println(" ");
        System.out.println("Datos del empleado:");
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}

// 1. Crear la clase Persona con las variables edad, nombre y teléfono
abstract class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
}

// 2. Crear la clase Cliente que herede de Persona, incluyendo la variable crédito
class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }
}

// 4.1. Crear la clase Trabajador que herede de Persona, incluyendo la variable salario
class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}