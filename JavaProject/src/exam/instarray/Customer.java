package exam.instarray;

public class Customer {
	String cName,callNum, job, sex;
	int cNo, age;
	
	public Customer(int cNo, String cName, String callNum, String job, String sex, int age) {
		this.cName = cName;
		this.job = job;
		this.sex = sex;
		this.cNo = cNo;
		this.callNum = callNum;
		this.age = age;
	}
	
	public void showCustomerInfo() {
		System.out.print(cNo + " ");
		System.out.print(cName + " ");
		System.out.print(callNum + " ");
		System.out.print(job + " ");
		System.out.print(sex + " ");
		System.out.print(age + " ");
		System.out.println();
	}
}
