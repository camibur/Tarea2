
import java.util.Objects;

public class Usuario{
    
   String nombre;
   String c�dula;
   String contrase�a;
   int edad;
   int cantidadDeHijos;
   int saldo=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getC�dula() {
        return c�dula;
    }

    public void setC�dula(String c�dula) {
        this.c�dula = c�dula;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public Usuario (String name, String ci, String psw, int age, int cantHijos, int sal ){
        nombre= name;
        ci= c�dula;
        psw= contrase�a;
        cantHijos= cantidadDeHijos;
        sal=saldo;
        
    }

    
    @Override
    public boolean equals(Object obj) {
        
        Usuario u = (Usuario) obj;
        if (!Objects.equals(this.contrase�a, u.contrase�a)) {
            return false;
        }
        return true;
    }
    
    
    
    
}