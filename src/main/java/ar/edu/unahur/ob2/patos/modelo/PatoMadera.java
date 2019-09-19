package ar.edu.unahur.ob2.patos.modelo;

public class PatoMadera extends Pato {
    public PatoMadera () { super(new NoVuelo(), new NadoConPatas(), new NoParpo()); }

    @Override
    public void dibujar() { System.out.println("Soy un pato de madera"); }
}
