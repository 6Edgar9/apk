package Negocio;

public class EnergiaMecanica {
    private float energiaPotencial;
    private float energiaCinetica;
    private float energiaMecanica;

    public EnergiaMecanica() {
    }

    public EnergiaMecanica(float energiaPotencial, float energiaCinetica) {
        this.energiaPotencial = energiaPotencial;
        this.energiaCinetica = energiaCinetica;
        this.energiaMecanica = energiaPotencial + energiaCinetica;
    }

    public float getEnergiaPotencial() {
        return energiaPotencial;
    }

    public void setEnergiaPotencial(float energiaPotencial) {
        this.energiaPotencial = energiaPotencial;
    }

    public float getEnergiaCinetica() {
        return energiaCinetica;
    }

    public void setEnergiaCinetica(float energiaCinetica) {
        this.energiaCinetica = energiaCinetica;
    }

    public float getEnergiaMecanica() {
        return energiaMecanica;
    }

    public void calcularEnergiaMecanica() {
        this.energiaMecanica = energiaPotencial + energiaCinetica;
    }

    @Override
    public String toString() {
        return "EnergiaMecanica{" + "energiaPotencial=" + energiaPotencial + ", energiaCinetica=" + energiaCinetica + ", energiaMecanica=" + energiaMecanica + '}';
    }
}
