/*
Práctica_1 programando en java (sustentación)
 */
package biblioteca.municipal;

import java.util.Scanner;

public class BibliotecaMunicipal {

    private static Object nombre;

public static void main(String[] args) {
    
    Datos_libros libros[] = new Datos_libros[100];
    Scanner lector = new Scanner (System.in);
    int contUs = 0; 
    int opc=0;
    int band=0;
    
    do{
    System.out.println("MENU PRINCIPAL");
    System.out.println("1. Ingresar libro");
    System.out.println("2. Actualizar libro");
    System.out.println("3. Eliminar libro");
    System.out.println("4. Buscar libro");
    System.out.println("5. salir");
    System.out.println("Seleccione una opcion:");
    opc = lector.nextInt();
   
    switch (opc){
        
        case 1:
            if (contUs<99){
            libros[contUs] = new Datos_libros();    
            System.out.println("INGRESO DE LIBROS");
            System.out.println("Digite el nombre del libro");
            libros[contUs].setNombre(lector.next());
            System.out.println("Digite el autor del libro");
            libros[contUs].setAutor(lector.next());
            System.out.println("Digite el año de publicacion del libro");
            libros[contUs].setAño_de_publicacion(lector.next());
            System.out.println("Digite el codigo del libro");
            libros[contUs].setCodigo(lector.next());
            System.out.println("Digite la cantidad de libros");
            libros[contUs].setCantidad(lector.next());
            System.out.println("digite area de preferencia: Química, Física, Tecnología,  Cálculo o Programación");
            libros[contUs].setArea(lector.next());
            contUs++;
            }
            else {
                System.out.println("NO HAY MAS MEMORIA PARA LIBROS");
    }
            break;
        case 2:
            System.out.println("ACTUALIZAR DATOS");
            System.out.println("Digite el nombre a actualizar");
            String name = lector.next();
            for (int i=0; i<contUs; i++){
            if (name.equals(libros[i].getNombre())) {
                band=1;
            System.out.println("Digite el codigo del libro");
            libros[i].setCodigo(lector.next());
            System.out.println("Digite la cantidad");
            libros[i].setCantidad(lector.next());
            System.out.println("digite area de preferencia: Química, Física, Tecnología,  Cálculo o Programación");
            libros[i].setArea(lector.next());
            }}
            if(band==0) {
                System.out.println("LIBRO NO ENCONTRADO");
             } else {
                band=0;
            }break;
        case 3:  
          
            break; 
        case 4:
            System.out.println("ingrese el libro que desea buscar");
            libros[contUs].setNombre(lector.next());
             for (int i=0; i<contUs; i++){
            if(band==0) {
                System.out.println("LIBRO NO ENCONTRADO");
             } else {
                band=0;
            }break;
             }
        case 5:
            System.out.println("GRACIAS POR EL UTILIZAR LOS SERVICIOS DE LA BIBLIOTECA, HASTA LUEGO");
            System.exit (0);
            break;        
    }
    }while (opc!=5);
    
    

}
       
    }