/*
Práctica_1 programando en java (sustentación)
autor Luisa Fernanda Cuartas Velasquez cc 1042773933
 */
package biblioteca.municipal;

import java.util.Scanner;

public class BibliotecaMunicipal {
     
    private static Object nombre;

    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
    
    Datos_libros libros[] = new Datos_libros[100];
    Scanner lector = new Scanner (System.in);
    int contUs = 0; 
    int opc=0;
    int band=0;
    String cclec;
    Scanner autor=new Scanner(System.in);
        
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
            System.out.println("Digite el nombre del libro a actualizar");
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
            System.out.println("Ingrese el libro a eliminar");
                cclec=(String) nombre ;
                
                libros[contUs].setNombre(lector.next());
                break;
            
        case 4:
            System.out.println("Ingrese el libro que desea buscar");
                 cclec=(String) nombre ;
                libros[contUs].setNombre(lector.next());
                break;
            default: 
                System.out.println("Ingrese opcion valida");
        }
        
            System.out.println("ingrese Del libro que desea buscar");
            libros[contUs].setNombre(lector.next());
             if (contUs<99){
            libros[contUs] = new Datos_libros();    
            System.out.println("Ingrese el nombre del libro que desea prestar");
            libros[contUs].setLibros_prestados(lector.next());
            System.out.println("Ingrese el nombre del libro que desea devolver");
            libros[contUs].setDeolver_libro(lector.next());
            System.out.println("Escrba el onmbre de los libros que ha prestado");
            libros[contUs].setLibros_prestados(lector.next());
            contUs++;
            }
            else {
                System.out.println("DATOS ERRONEOS");
    }
            System.out.println("Digite su cedula para realizar el prestamo");
            libros[contUs].setCedula_prestante(lector.next());
            break;
    
        }while (opc!=5);
    
            System.out.println("GRACIAS POR EL UTILIZAR LOS SERVICIOS DE LA BIBLIOTECA, HASTA LUEGO");
            System.exit (0);        
    


}
       
}
        