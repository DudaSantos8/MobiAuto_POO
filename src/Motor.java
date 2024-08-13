public class Motor {
    private double potencia;
    private String tipo;

    public Motor(double potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("\nPotencia do motor (cv): " + potencia);
        model.append("\nTipo do motor: " + tipo);
        return model.toString();
    }
}
