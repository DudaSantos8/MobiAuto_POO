public class Moto {
    private String tipoDeGuidao;

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append("\nTipo de guidão: " + tipoDeGuidao);
        return model.toString();
    }
}
