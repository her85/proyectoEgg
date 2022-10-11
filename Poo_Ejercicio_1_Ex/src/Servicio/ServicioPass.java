package Servicio;

import Entidad.Pass;
import java.util.Scanner;

public class ServicioPass {

    /*
    Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
     */
    public void datosUsuario() {

        Pass pass = new Pass("", "Juan", 13234555);
    }

    /*
    Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
     */
    public String crearPass(Pass pass) {
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Contraseña a crear");
            pass.setPass(leer.nextLine());
        } while (pass.getPass().length() > 10);

        return pass.getPass();
    }

    /*
    Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
     */
    public String analizarPass(Pass pass) {
        String nivel = "bajo";
        int contadorZ = 0;
        int contadorA = 0;
        String[] contrasenia = new String[pass.getPass().length()];
        for (int i = 0; i < contrasenia.length; i++) {
            contrasenia[i] = pass.getPass().substring(i, i + 1);
        }

        for (String contrasenia1 : contrasenia) {
            if (contrasenia1.equalsIgnoreCase("z")) {
                contadorZ += 1;
            } else if (contrasenia1.equalsIgnoreCase("a")) {
                contadorA += 1;
            }
        }
        if (contadorZ == 1 && contadorA < 2) {
            nivel = "medio";
        } else if (contadorA >= 2 && contadorZ >= 1) {
            nivel = "alto";
        }

        return nivel;
    }

    /*
    C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
     */
    public void modificarContrasenia(Pass pass) {
        Scanner leer = new Scanner(System.in);
        String contrasenia, nuevaContrasenia;
        System.out.println("Ingrese contraseña");
        contrasenia = leer.nextLine();
        if (pass.getPass().equalsIgnoreCase(contrasenia)) {
            System.out.println("Nueva contraseña");
            pass.setPass(nuevaContrasenia = leer.nextLine());
        } else {
            System.out.println("Error");
        }
        System.out.println(pass.getPass());
    }

    /*
    C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
     */
    public void modificarNombre(Pass pass) {
        Scanner leer = new Scanner(System.in);
        String contrasenia, nuevaNombre;
        System.out.println("Ingrese contraseña");
        contrasenia = leer.nextLine();
        if (pass.getPass().equalsIgnoreCase(contrasenia)) {
            System.out.println("Nuevo nombre");
            pass.setNombre(nuevaNombre = leer.nextLine());
        } else {
            System.out.println("Error");
        }
        System.out.println(pass.getNombre());
    }

    /*
    D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
     */
    public void modificarDni(Pass pass) {
        Scanner leer = new Scanner(System.in);
        String contrasenia;
        int nuevoDni;
        System.out.println("Ingrese contraseña");
        contrasenia = leer.nextLine();
        if (pass.getPass().equalsIgnoreCase(contrasenia)) {
            System.out.println("Nuevo DNI");
            pass.setDni(nuevoDni = leer.nextInt());
        } else {
            System.out.println("Error");
        }
        System.out.println(pass.getDni());
    }

    /*
    menu
     */
    public void menu(Pass pass) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        System.out.println("Opcion del menu");
        System.out.print(" 1= Modificar contraseña");
        System.out.print(" 2= Modificar DNI");
        System.out.println(" 3= Modificar Nombre");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                modificarContrasenia(pass);
                break;
            case 2:
                modificarDni(pass);
                break;
            case 3:
                modificarNombre(pass);
                break;
            default:
                System.out.println("Salir");
        }

    }
}
