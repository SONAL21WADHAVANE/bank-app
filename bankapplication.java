package bankapplication;

import java.util.Scanner;

public class bankingapplication {
	public static void main(String[]args) {
		bankAccount obj=new bankAccount("SL DecCode","SL00001");
		obj.showmenu();
	}
}

class bankAccount{
	int balance;
	int privioustracsaction;
	String custername;
	String customerId;
	
	bankAccount(String cname,String cid){
		custername=cname;
		customerId=cid;
		
	}
	
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
			privioustracsaction=amount;
			
		}
	}
	void withdraw(int amount) {
		if(amount!=0) {
			balance=balance-amount;
			privioustracsaction=-amount;
			
		}
	}
	void privioustracsaction() {
		if(privioustracsaction>0) {
			System.out.println("Deposited:"+privioustracsaction);
		}else if(privioustracsaction<0) {
			System.out.println("withdraw:"+Math.abs(privioustracsaction));
		}else {
			System.out.println("no trasaction occured");
		}
	}
	
	void showmenu() {
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		System.out.println("welcome"+custername);
		System.out.println("Your Id"+customerId);
		System.out.println("\n");
		
		System.out.println("A:check your balance");
		System.out.println("B:Deposit");
		System.out.println("C:withdraw");
		System.out.println("D:Privious tracsaction");
		System.out.println("E:Exist the system");
		
		do {
			System.out.println("=======================================================================");
			System.out.println("Enetr your option");
			System.out.println("=======================================================================");
			option =scanner.next().charAt(0);
			System.out.println("\n");
			switch(option) {
			case 'A':
				System.out.println(".....................................");
				System.out.println("Balance="+balance);
				System.out.println(".....................................");
				System.out.println("\n");
				break;
			
			case 'B':
				System.out.println(".....................................");
				System.out.println("Enetr amount to deposit");
				System.out.println(".....................................");
				
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			
			case 'C':
				System.out.println(".....................................");
				System.out.println("Enetr amount to withdraw");
				System.out.println(".....................................");
				
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			
			case 'D':
				System.out.println(".....................................");
				privioustracsaction();
				System.out.println(".....................................");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("===============================================================");
				break;
				
			default:
				System.out.println("Invalid option !! plz enter correct option...");
				break;
			}
			
		}
		while(option!='E');
			System.out.println("Thank you for using our services....!!");
	}
}
