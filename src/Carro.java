public class Carro extends Veiculo{
    private int numeroPortas;
    private Motor motor;

    public Carro( String marca, String modelo, int ano, int numeroPortas, Motor motor) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.motor = motor;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append("\nNúmero de portas: " + numeroPortas);
        model.append(motor);
        return model.toString();
    }
}
