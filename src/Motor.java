public class Motor {
    private double potencia;
    private String tipo;

    public double getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("Potencia: " + potencia);
        model.append("\nTipo: " + tipo);
        return model.toString();
    }
}
