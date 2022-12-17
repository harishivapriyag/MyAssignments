package week3.day1.assignments;
// method overriding - polymorphism

public class AxisBank extends BankInfo {

	public String deposit() {
		return "The minimum investment amount of Axis Bank is Rs 10,000.";
	}

	public static void main(String[] args) {
		AxisBank bi=new AxisBank();
		System.out.println(bi.saving());
		System.out.println(bi.deposit());
		System.out.println(bi.fixed(7, "In a Fixed Deposit, you put a lump sum in your bank for a fixed tenure at an agreed rate of interest."));
		//BankInfo b=new BankInfo();
		//System.out.println(b.deposit());
	}

}
