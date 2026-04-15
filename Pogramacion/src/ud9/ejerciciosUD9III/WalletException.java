package ud9.ejerciciosUD9III;

public class WalletException extends Exception {
	public WalletException() {
        super("No se ha podido activar Wallet porque no se cumplen los requisitos necesarios");
    }

    public WalletException(String mensaje) {
        super(mensaje);
    }
}
