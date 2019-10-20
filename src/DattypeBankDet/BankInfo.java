package DattypeBankDet;
//QUESTION 9:
//Project   :BankDetails
//Package   :org.bank
//Class     :BankInfo
//Methods   :saving(),fixed()

//Class     :AxisBank
//Methods   :deposit()

//Description:
//create above 2 class and call all your class methods into the BankInfo using single inheritance.

import org.datatype.*;
public class BankInfo extends StudDetails {
	public void saving() {
		String name="prabhu";
        System.out.println("NAme is "+name);
 
        char initi='A';
        System.out.println("Initial is "+initi);
        
        short regno=8987;
        System.out.println("Reg no is "+ regno);
        
        double sal=989.8535;
        System.out.println("Salary is "+sal);
        long ph=9899985554l;
        System.out.println("Phone is "+ph);
	}
	public static void main(String[] args) {
	BankInfo w=new BankInfo();
	w.saving();
	w.stu();
	
	
	}

}
