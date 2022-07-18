package lock;

public class SingleInheritance extends Single {
	public void IDCard() {
		System.out.println("ID Number is 1234758384");
	}public void AadharCard() {
	System.out.println("Aadhar Card Number is 660385736");
	
	}public void PhnNo() {
	System.out.println("Phone number is 8688463494");
	}
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.IDCard();
		s.AadharCard();
		s.PhnNo();
		s.name();
		s.age();
		s.Section();
        
		
	}


}