package ar.edu.unahur.ob2.patos.modelo;

public class PatoHule extends Pato {

    public PatoHule() {
        super(new NoVuelo(), new NadoConPatas(), new ParparCuec());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato de hule");
    }

    @Override
    public void parpar() {
        System.out.println("Cuek");
    }
}
