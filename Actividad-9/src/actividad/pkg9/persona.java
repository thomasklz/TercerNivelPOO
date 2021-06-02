
package actividad.pkg9;

import java.util.Scanner;

public class persona {
    Scanner entrada = new Scanner(System.in);
    private String nombre,apellido,cedula,sexo;
    private int edad;
    private float peso,altura;

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void ingresarPersona(){
        System.out.println("Ingrese el nombre");      
        setNombre(entrada.nextLine());
        System.out.println("Ingrese el apellido");
        setApellido(entrada.nextLine());
        System.out.println("Ingrese el cedula");
        setCedula(entrada.nextLine());
        System.out.println("Ingrese el sexo");
        setSexo(entrada.nextLine());
        System.out.println("Ingrese el edad");
        setEdad(entrada.nextInt());
        System.out.println("Ingrese el peso");
        setPeso(entrada.nextFloat());
        System.out.println("Ingrese el altura");
        setAltura(entrada.nextFloat());
    }
    
    
    public boolean esMayorDeEdad(){
        if(getEdad()>=18){
            return true;
        }else{
            return false;
        }
    }
    
    public void calcularIMC(){
        float imc;
        imc=(getPeso()/getAltura());
        System.out.println("El índice de masa corporal es: "+ imc%.2f);
    }
    
    public void buscarPersona(){
        entrada.nextLine();
        System.out.println("Ingrese el número de cédula");
        String ced= entrada.nextLine();
        
        if(getCedula().equals(ced)){
            System.out.println("El nombre: "+ getNombre()+ " apellido+"+getApellido());   
        }else{
            System.out.println("Usuario no encontrado");
        }
    }
        
}
