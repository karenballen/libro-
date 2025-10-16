public class LibroDigital extends Libro {
    private static int serie = 1;
    private double tam;

    public LibroDigital(String t, String a, double p, int s, double tam) {
        super(t, a, p, s, "LD" + serie++);
        this.tam = tam;
    }

    public double mostrarLibro() {
        System.out.println("Libro Digital");
        super.mostrarLibro();
        System.out.println("Tamaño: " + tam + " MB");
        return 0;
    }

    public void prestar(int n) {
        if (n > 0 && stock >= n) {
            stock -= n;
            System.out.println("Prestados " + n);
        } else System.out.println("No disponible");
    }

    public void devolver(int n) {
        if (n > 0 && n <= 2) {
            stock += n;
            System.out.println("Devueltos " + n);
        } else System.out.println("Límite de devolución");
    }
}