package Negocio;

public class EnergiaCinetica {
    private float masa;
    private float velocidad;
    private float total;

    public EnergiaCinetica() {
    }

    public EnergiaCinetica(float masa, float velocidad) {
        this.masa = masa;
        this.velocidad = velocidad;
        this.total = 0;
    }

    public float getMasa() {
        return masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void calcularEnergiaCinetica() {
        if (masa < 0 || velocidad < 0) {
            throw new IllegalArgumentException("Los valores de masa y velocidad deben ser positivos.");
        }
        this.total = 0.5f * masa * velocidad * velocidad;
    }

    @Override
    public String toString() {
        return "EnergiaCinetica{" + "masa=" + masa + ", velocidad=" + velocidad + ", total=" + total + '}';
    }
}
