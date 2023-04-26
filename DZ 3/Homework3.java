import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Homework3 {
	public static void main(String[] args) {
		// Задача №1
		RanClass ranClass0 = new RanClass();
		Task1 taskComplete = new Task1();
		taskComplete.main1();
	}
}

class RanClass {
	private int ranNumber = 10;
	private char ranCharacter = 1;

	public void setNumber(int ranNumber) {
		this.ranNumber = ranNumber;
	}

	public int getNumber() {
		return ranNumber;
	}

	public void setCharacter(char ranCharacter) {
		this.ranCharacter = ranCharacter;
	}

	public char getCharacter() {
		return ranCharacter;
	}
}

class Task1 {
	public static void main1() {
		RanClass RanClass1 = new RanClass();
		System.out.println("Стандартное число: " + RanClass1.getNumber());
		System.out.println("Стандартный символ: " + RanClass1.getCharacter());
	}
}