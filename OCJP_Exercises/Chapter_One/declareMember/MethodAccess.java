package declareMember;

class cool {
	public void useMyCoolMethod() {
		Zoo zoo = new Zoo();
		zoo.coolMethod();
	}
}

class Boo extends Zoo {
	public void useMyCoolMethod() {
		System.out.println("boo says:" + this.coolMethod());
	}
}

public class MethodAccess {
	public static void main(String[] args) {
		Boo boo = new Boo();
		boo.useMyCoolMethod();
	}
}