package yashvi_java_23;

public class InheritanceDemo {

	public static void main(String[] args) {
		
	}
}


//class A d e f 
//class B x y z 

//B can not access  d e and f 
//but if you want to access d e and f then you can access using inheritance 

//inheritance is the process by which object of one class [b obj] can access 
//property of another class[class A] 

// to achieve inheritance in java we have to use extends keyword

class Aparent {
  //default 
	void add() {
		
	}
	private void sub() {
		
	}
	public void div() {
		
	}
	protected void mul() {
		
	}
}

class Bchild extends Aparent {
	//
	
}


