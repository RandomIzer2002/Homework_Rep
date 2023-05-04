public class Fraction {
	int numerator;  //использовать инкапсуляцию - добавить модификатор доступа private
	int denominator; //использовать инкапсуляцию - добавить модификатор доступа private

	public Fraction() { //конструктор должен принимать значения числителя и знаменателя
		numerator = 10;
		denominator = 5;
	}

	public void fractionOuter() {
		System.out.println(numerator + " / " + denominator);
	}

	public int sumMethod(int numerator, int denominator) { // в задании сказано что в качестве параметра должна быть передана дробь(т.е объект класса Fraction)
		return ((this.numerator / this.denominator) + (numerator / denominator)); //изучи как складывать простые дроби. Возврашаться так же должен объект класса Fraction
	}

	public int multiMethod(int numerator, int denominator) { //метод должен принимать значение int числа, на которое нужно умножить. и возвращать должен объект класса Fraction
		return ((this.numerator / this.denominator) * (numerator / denominator));
	}

	public int divMethod(int numerator, int denominator) {//метод должен принимать значение int числа, на которое нужно разделить. и возвращать должен объект класса Fraction
		return ((this.numerator / this.denominator) / (numerator / denominator));
	}
}
