package ar.edu.unahur.ob2.patos.modelo;

public abstract class Pato {

    private Volable comportamientoDeVuelo;

    private Nadable comportamientoDeNado;

    private  Parpable comportamientoDeParpeo;

    public Pato(Volable comportamientoDeVuelo, Nadable comportamientoDeNado, Parpable comportamientoDeParpeo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
        this.comportamientoDeNado = comportamientoDeNado;
        this.comportamientoDeParpeo = comportamientoDeParpeo;
    }


    public void volar() {
        comportamientoDeVuelo.volar();
    }

    public void parpar() {
        comportamientoDeParpeo.parpar();
    }

    public void nadar() {
        comportamientoDeNado.nadar();
    }

    public void setComportamientoDeVuelo(Volable comportamientoDeVuelo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public void setComportamientoDeNado(Nadable comportamientoDeNado) {
        this.comportamientoDeNado = comportamientoDeNado;
    }

    public void setComportamientoDeParpeo(Parpable comportamientoDeParpeo) {
        this.comportamientoDeParpeo = comportamientoDeParpeo;
    }

    public abstract void dibujar();
}
