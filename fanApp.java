package constructor;

public class fanApp {
	public static void main(String[] args) {
		fan fan=new fan();
		System.out.println(fan.no_of_wings+" "+fan.brand+" "+fan.color);
		fan fan1=new fan(3);
		System.out.println(fan1.no_of_wings+" "+fan1.brand+" "+fan1.color);
		fan fan2=new fan("crompton",4);
		System.out.println(fan2.no_of_wings+" "+fan2.brand+" "+fan2.color);
		fan fan3=new fan("green",5,"usha");
		System.out.println(fan3.no_of_wings+" "+fan3.brand+" "+fan3.color);

	}

}
