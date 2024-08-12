public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("marca: " + marca);
        model.append("\nModelo: " + modelo);
        model.append("\nAno: " + ano);
        return model.toString();
    }
}
