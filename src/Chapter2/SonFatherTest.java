package Chapter2;

public class SonFatherTest {

	public static void main(String[] args) {
		new Son().getFatherName();
		System.out.println();
	}

}

class Father{
	protected String fatherName = "Father";
	public Father() {
		System.out.println("Father构造器");
	}
}

class Son extends Father{
	public Son() {
		System.out.println("Son构造器");
	}
	public String getFatherName() {
		System.out.println("the super class:"+super.getClass());
		return super.fatherName;
	}
}


interface FatherI{
	String name = "maiyun";
}

class SonI implements FatherI{
	public void getFatherName() {
		System.out.println("the super class:"+super.getClass());
	}
}