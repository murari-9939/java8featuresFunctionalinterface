package exampractice;

class bk{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private  String name;
	private int age;
}
public class e8 {
	
	public static void main(String[] args) {
		bk knn =new bk();
		knn.setName("murari");
		knn.setAge(12);
		System.out.println(knn.getName());  
	}
	

}
