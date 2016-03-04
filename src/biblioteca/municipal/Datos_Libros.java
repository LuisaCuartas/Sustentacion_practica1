/*
Práctica_1 programando en java (sustentación)
 */
package biblioteca.municipal;

class Datos_libros {
    
     public void setLibros_prestados(String libros_prestados) {
        this.libros_prestados = libros_prestados;
    }
    private String codigo;
    private String cantidad;
    private String area;
    private String cedula_prestante;
    private String prestar_libro;

    public Datos_libros(String cedula_prestante, String prestar_libro, String devolver_libro, String libros_prestados) {
        this.cedula_prestante = cedula_prestante;
        this.prestar_libro = prestar_libro;
        this.devolver_libro = devolver_libro;
        this.libros_prestados = libros_prestados;
    }
    private String devolver_libro;
    private String libros_prestados;
            
    public Datos_libros(String nombre, String autor, String año_de_publicacion, String codigo, String cantidad, String area) {
        this.nombre = nombre;
        this.autor = autor;
        this.año_de_publicacion = año_de_publicacion;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.area = area;
    }
    private String nombre;
    private String autor;
    private String año_de_publicacion;

    public String getCedula_prestante() {
        return cedula_prestante;
    }

    public void setCedula_prestante(String cedula_prestante) {
        this.cedula_prestante = cedula_prestante;
    }

    public String getPrestar_libro() {
        return prestar_libro;
    }

    public void setPrestar_libro(String prestar_libro) {
        this.prestar_libro = prestar_libro;
    }

    public String getDevolver_libro() {
        return devolver_libro;
    }

    public void setDevolver_libro(String devolver_libro) {
        this.devolver_libro = devolver_libro;
    }

    public String getLibros_prestados() {
        return libros_prestados;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño_de_publicacion() {
        return año_de_publicacion;
    }
    
    public void setAño_de_publicacion(String año_de_publicacion) {
        this.año_de_publicacion = año_de_publicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    Datos_libros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDeolver_libro(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}