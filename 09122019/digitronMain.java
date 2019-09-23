package Domaci_09122019;

public class digitronMain {

	public static void main(String[] args) {
		digitron calc = new digitron();
		double result = calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();
		System.out.println(result);

	}

}
