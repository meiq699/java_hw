package myjava.homework.part1;
import myjava.homework.part1.Apple;

public class ARGSomething {

	public static void main(String[] args) {
		// You cannot modify anything in the main function!!!!
		ARGSomething t = new ARGSomething();
		System.out.println(t.avg(10, 20));
		System.out.println(t.avg(20, 60, 120));
		System.out.println(t.avg(10, 20, 30, 40));

		System.out.println(t.avg(0.1, 0.2));
		System.out.println(t.avg(20, 60.0, 120));
		System.out.println(t.avg(10, 20, new Integer(30), 40.0));

		System.out.println(avg("Apple"));
		System.out.println(avg("Apple", "Cat"));
		System.out.println(avg("Apple", "Cat", new String("Bee")));


		System.out.println(avg(new Apple(10, 59.5)));
		System.out.println(avg(new Apple(10,59.5),new Apple("Washington",30,80.3)));
		Apple green=new Apple("Granny Smith",30,88);
		System.out.println(avg(new Apple(10,59.5),new Apple("Washington",30,80.3),green));

	}


	int avg(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		return sum/numbers.length;
	}

	double avg(double... numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

	static int avg(String letter) {

		return letter.length();
	}


	static double avg(String... args) {
		double sum = 0;
		int i = 0;
		for (String temp : args) {
			sum += temp.length();
			i++;
		}
		System.out.print("The avg number of these words is ");
		return sum / i;

	}

	static double avg(Apple... a) {
		double sumprice =0;
		double sumweight =0;
		for (Apple temp : a) {
			sumprice=sumprice+temp.getPrice();
			sumweight=sumweight+temp.getWeight();
		}
		System.out.print("The price per gram is ");
		return sumweight/sumprice;
	}
}





