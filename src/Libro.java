public class Libro {
    protected String titulo;
    protected String autor;
    protected double precio;
    protected int stock;
    protected String codigo;

    public Libro(String titulo, String autor, double precio, int stock, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double mostrarLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Código: " + codigo);
        return 0;
    }
}
