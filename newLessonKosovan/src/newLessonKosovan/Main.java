package newLessonKosovan;

public class Main {
	public static void main(String[] args) {
		
		Engine e = new Engine(3000);
		System.out.println(e);
		
		Auto auto = new Auto("lal", new Engine(800));
		Auto auto2 = new Auto("lam", e);
		System.out.println(auto);
		System.out.println(auto2);
		Lotka  lotka = new Lotka("yamaha");
		lotka.setEngine(new Engine(200));
		
	}
}
