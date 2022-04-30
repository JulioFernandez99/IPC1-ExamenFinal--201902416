package ExamenFinal;

public class ejercicio1 {
	
	private float num1;
	private float num2;
	
	public ejercicio1(float num1, float num) {
		this.num1 = num1;
		this.num2 = num;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	} 
	
	public String  comparar() {
		String txt="";
		if(num1>num2) {
			txt=num1+" es el numero mayor";
		}
		else if(num1==num2) {
			txt="Los numeros son iguales";
		}
		else {
			txt=num2+" es el numero mayor";
		}
		return txt;
		
	}

}
