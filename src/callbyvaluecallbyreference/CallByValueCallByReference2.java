package callbyvaluecallbyreference;

public class CallByValueCallByReference2 {

	int eyes;

	protected String animal = "Mouse";

	public static void main(String[] args) {

		CallByValueCallByReference2 objc = new CallByValueCallByReference2();
		objc.eyes = 2;
		
		changeObjectReference(objc);

		System.out.println(objc.eyes);

	}

	public static void changeObjectReference(CallByValueCallByReference2 objcCopy) {
		objcCopy.eyes = 12;
		
	}

}
