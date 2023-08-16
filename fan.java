package constructor;

public class fan {
 int no_of_wings;
 String brand;
 String color;
 public fan()
 {
	 this("green","usha",4);
 }
 public fan(int a)
 {
	 no_of_wings=a;
 }
 public fan(int a,String b)
 {
	 no_of_wings=a;
	 color=b;
 }
 public fan(String a,int b)
 {
	 brand=a;
	 no_of_wings=b;
 }
 public fan(int a,String b,String c)
 {
	 no_of_wings=a;
     brand=b;
     color=c;
 }
 public fan(String x,String y,int c)
 {
	 no_of_wings=c;
     brand=x;
     color=y;
 }
 public fan(String a,int b,String c)
 {
 }

}
