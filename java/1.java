public class Account{
	private String accNum;
	private String name;
	private String addr;
	private String yue;
	public aouble cun(double money){
		this.yue=this.yue+money;
		return this.yue;

	}
	public Account(String accN,String n,String addr,String y){
		this.accNum=accN;
		this.name=n;
		this.addr=addr;
		this.yue=y;
	}

	public static void main(String[] args){
		Account a1=new Account("123123","abc","cde",3000);
		a1.cun(200);
		Account a2=new Account("123123","abc","cde",3000);

	}
}