package Lalalalalalala;


import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
//		List<Humen> list = new ArrayList<>();
//		list.add(new Humen("anton", 24));
//		list.add(new Humen("vova", 25));
//		list.add(new Humen("igar", 34));
//		list.add(new Humen("ira", 54));
//		list.add(new Humen("roza", 14));
//		list.add(new Humen("paraska", 54));
//		list.add(new Humen("tvoyaMamka", 88));
//		
//		int maxAge=0;
//		
//		for (Humen humen : list) {
//			if( humen.getAge()>maxAge){
//				maxAge = humen.getAge();
//			}
//		}
//		for (Humen humen : list) {
//			if(humen.getAge()== maxAge){
//				System.out.println(humen.getName());
//			}
//		}
//		
		
		List<Order> list = new ArrayList<Order>();
		list.add(new Order(1, new Humen("Sanya", 18), new Commody("potato", 12)));
		list.add(new Order(1, new Humen("Arina", 18), new Commody("tomato", 1200)));
		list.add(new Order(1, new Humen("Vitalya", 28), new Commody("sex", 112)));
		list.add(new Order(1, new Humen("Sanya", 58), new Commody("girl", 912)));
		
		System.out.println("Sanya придбав:");
		for (Order order : list) {
			if(order.getHumen().getName().equals("Sanya")){
				System.out.println(order.getCommody());
			}
		}
		
		System.out.print("а хто купив potato???    ");
		for (Order order : list) {
			if(order.getCommody().getName().equals("potato")){
				System.out.println(order.getHumen().getName());
			}
		}
		System.out.println("да да, я такий )))");
		
		
		double max=0;
		for (Order order : list) {
			if(order.getCommody().getPrice()>max){
				max=order.getCommody().getPrice();
			}
		}
		for (Order order : list) {
			if(order.getCommody().getPrice()==max){
				System.out.println(order.getHumen().getName());
			}
		}
		
}
	
}
