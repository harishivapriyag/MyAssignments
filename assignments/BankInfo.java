package week3.day1.assignments;

//method overriding - polymorphism

public class BankInfo {

	public String saving() {
		return "This is the most basic type of account you can open at any bank, it allows you to deposit your money!!";
	}

	public int fixed(int interest, String def) {
		return interest;
		//return "In a Fixed Deposit, you put a lump sum in your bank for a fixed tenure at an agreed rate of interest. ";
	}
	public String deposit() {
		return "100000";
	}
}
