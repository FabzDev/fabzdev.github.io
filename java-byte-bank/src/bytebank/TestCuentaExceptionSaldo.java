package bytebank;

public class TestCuentaExceptionSaldo {
	
	public static void main(String[] args) {
		Cuenta cuentaException = new CuentaAhorros(88, 1140829); 
		cuentaException.deposita(100);
		cuentaException.saca(100);
	}
}
