public class Carro extends Veiculo{
    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append("\nNúmero de portas: " + numeroPortas);
        return model.toString();
    }
}
