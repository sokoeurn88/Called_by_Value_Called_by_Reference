package callbyvaluecallbyreference;

public class CallByValueCallByReference {

	int eyes;

	protected String animal = "Mouse";

	public static void main(String[] args) {

		CallByValueCallByReference objc = new CallByValueCallByReference();
		objc.eyes = 2;

		int a = 3;
		
		changePrimiteData(a);
		System.out.println("Print the value of a: "+a);
		
//		System.out.println(objc.eyes);

	}

	public static void changePrimiteData(int aCopy) {
		aCopy = 13;
		
	}

}
