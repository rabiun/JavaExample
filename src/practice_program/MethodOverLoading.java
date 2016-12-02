package practice_program;

public class MethodOverLoading {

	public int add(int a,int b){
		return a+b;
		
	}
	
	public long add(int a,String b){
		
		return a+Integer.parseInt(b);
	}
}
