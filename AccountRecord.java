

import java.io.Serializable;

 public class AccountRecord implements Serializable { // if it is interface it
														// should be implements
														// (tagging interface or marker interface);

	private static final long serialVersionUID = 3417040053089159204L;
	private int account;
	private String firstName;
    private String lastName;		
   	private String address;
	private String socsec;   //STEP 1
	private double balance;
	private double gpa;
	private String title;
	
	
	// Now add private char sex;   
	private char sex;

	// no-argument constructor calls other constructor with
	// default values
	public AccountRecord() {
		this(0, "", "","","",'m',"",0,0); // default way of private variables. //STEP 2
	}

	// initialize a record
	public AccountRecord(int account, String firstName, String lastName,String address,String socsec, char sex,String title,double gpa,double balance) {  //STEP 3
		setAccount(account);
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setSocSec(socsec);  //STEP 4
		setBalance(balance);
		setTitle(title);  
		setSex(sex);
		setGpa(gpa); 
	;
		
	}

	

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
    }

	// set account number
	public void setAccount(int account) {
		this.account = account;
	}

	// get account number
	public int getAccount() {
		return account;
	}

	// set first name
	public void setFirstName(String first) {
		firstName = first;
		
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	// set last name
	public void setLastName(String last) {
		lastName = last;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}
	
	
	private void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}

	public void setAddress(String address) {     //STEP 5
		this.address = address;
	}                                                    

	public String getAddress() {
		return address;
	}
	

	public void setSocSec(String socsec) {
		this.socsec = socsec;
	}

	public String getSocSec() {
		return socsec;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	
	
} // end class AccountRecord









