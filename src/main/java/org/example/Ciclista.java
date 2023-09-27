package org.example;

public class Ciclista {

    private String nombreCiclista;
    private String edadCiclista;
    private String paisDeOrigenDelCiclista;
    private Double tiempoEnLaCronoIndividual;

    public Ciclista() {
    }

    public Ciclista(String nombreCiclista, String edadCiclista, String paisDeOrigenDelCiclista, Double tiempoEnLaCronoIndividual) {
        this.nombreCiclista = nombreCiclista;
        this.edadCiclista = edadCiclista;
        this.paisDeOrigenDelCiclista = paisDeOrigenDelCiclista;
        this.tiempoEnLaCronoIndividual = tiempoEnLaCronoIndividual;
    }

    public String getNombreCiclista() {
        return nombreCiclista;
    }

    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    public String getEdadCiclista() {
        return edadCiclista;
    }

    public void setEdadCiclista(String edadCiclista) {
        this.edadCiclista = edadCiclista;
    }

    public String getPaisDeOrigenDelCiclista() {
        return paisDeOrigenDelCiclista;
    }

    public void setPaisDeOrigenDelCiclista(String paisDeOrigenDelCiclista) {
        this.paisDeOrigenDelCiclista = paisDeOrigenDelCiclista;
    }

    public Double getTiempoEnLaCronoIndividual() {
        return tiempoEnLaCronoIndividual;
    }

    public void setTiempoEnLaCronoIndividual(Double tiempoEnLaCronoIndividual) {
        this.tiempoEnLaCronoIndividual = tiempoEnLaCronoIndividual;
    }
}
