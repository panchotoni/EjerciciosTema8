public class Ejercicios {
    public static void main(String[] args) {
        Persona yo = new Persona();
        yo.setNombre("Pancho");
        yo.setEdad(25);
        yo.setTelefono(1547846851);

        System.out.println(yo.getNombre());
        System.out.println(yo.getEdad());
        System.out.println(yo.getTelefono());

    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
