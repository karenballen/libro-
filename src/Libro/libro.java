package Libro;

public class libro {
protected String  Titulo;
protected String Autor;
protected double Precio;
protected int cantidadejemplares;

public libro(String Titulo,String Autor, double Precio){
    this.Titulo=Titulo;
    this.Autor=Autor;
    this.Precio=Precio;
}
     public String getTitulo() {
    return Titulo;
     }
     public void mostrarlibro(){
    System.out.println("Titulo:"+Titulo);
    System.out.println("Autor:"+Autor);
    System.out.println("Precio:"+ Precio);
    }
}
