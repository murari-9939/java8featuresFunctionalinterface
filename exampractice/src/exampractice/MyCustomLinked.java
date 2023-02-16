package exampractice;

public class MyCustomLinked {
	String name;
	int id;
	MyCustomLinked nextNode;
	
	public MyCustomLinked(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
	public MyCustomLinked getNextNode() {
		return nextNode;
	}



	public void setNextNode(MyCustomLinked nextNode) {
		this.nextNode = nextNode;
	}



	public static void main(String[] args) {
		
		MyCustomLinked parent = null;
		MyCustomLinked current = null;
		
		for(int i = 0; i< 10 ; i++) {
			if(parent == null) {
				parent = new MyCustomLinked (""+i,i); 
				current = parent;
			}else {
				MyCustomLinked xx = new MyCustomLinked(""+i, i);
				current.setNextNode(xx);
				current = xx;
			}
		}
		
		current = parent;
		//iterate link list method 1
//		while(true) {
//			System.out.println(current.id + "name;- "+current.name);
//			if(current.nextNode != null)
//				current = current.nextNode;
//			else
//				break;
//		}
		
		printData(current);
		
	}
	
	static void printDataRev(MyCustomLinked node) {
		if(node.nextNode != null) {
			printData(node.nextNode);
			System.out.println("id: "+node.id+" name: "+node.name);
		}else {
			System.out.println("id: "+node.id+" name: "+node.name);
		}
			
	}
	
	static void printData(MyCustomLinked node) {
		System.out.println("id: "+node.id+" name: "+node.name);
		if(node.nextNode != null) {
			printData(node.nextNode);	
		}
			
	}
}
