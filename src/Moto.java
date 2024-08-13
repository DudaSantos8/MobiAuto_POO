public class Moto extends Veiculo{
    private String tipoDeGuidao;
    Motor motor;

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public Moto(String marca, String modelo, int ano, String tipoDeGuidao, Motor motor) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append("\nTipo de guidão: " + tipoDeGuidao);
        model.append(motor);
        return model.toString();
    }
}
