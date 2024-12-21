package Negocio;

public class EnergiaPotencial {
    private float masa;
    private float altura;
    private float gravedad;
    private float total;

    public float getMasa() {
        return masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getGravedad() {
        return gravedad;
    }

    public void setGravedad(float gravedad) {
        this.gravedad = gravedad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public EnergiaPotencial() {
    }

    public EnergiaPotencial(float masa, float altura, float gravedad, float total) {
        this.masa = masa;
        this.altura = altura;
        this.gravedad = gravedad;
        this.total = total;
    }

    @Override
    public String toString() {
        return "EnergiaPotencial{" + "masa=" + masa + ", altura=" + altura + ", gravedad=" + gravedad + ", total=" + total + '}';
    }
}
