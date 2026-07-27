package extendsex.emp;

// 매니저는 사원이면서 관리자, 모든 관리자는 사원이며 
public class Manager extends Employee{
	private String position;
	
	public void setManager() {
		setEmployee(); // 일반 사원 정보 저장
		System.out.print("직위 입력 : ");
		position = sc.next();
	}
	
	public void showManagerInfo() {
		showEmpInfo();
		
		System.out.println("직위 : " + position);
	}
}
