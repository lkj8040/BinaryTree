package account;

public class CheckingAccount extends myAccount {
	private double overdraftProtection;
	protected CheckingAccount(double balance)
	{
		super(balance);
	}
	protected CheckingAccount(double balance,double protect)
	{
		this(balance);
		overdraftProtection = protect;
	}
	protected void withdraw(double amt)throws OverdraftException{
		this.balance -= amt;
		if (getBalance() < 0){
			overdraftProtection += getBalance();//͸֧
		}
		if(overdraftProtection < 0)
			throw new OverdraftException("��Ȼ��͸֧��ȣ���Ȼ͸֧��",overdraftProtection);
		else 
		{
			if(getBalance() < 0)
				System.out.println("ʣ��͸֧��ȣ�"+overdraftProtection);
			else
				System.out.println("δ͸֧,���Ϊ��"+getBalance());
		}
	}
	public static void main(String[] args) {
		CheckingAccount H = new CheckingAccount(1000,500);//ʣ����1000��͸֧���500
		System.out.println("��ʼ���1000��͸֧���500");
		H.deposit(1);
		try{
			H.withdraw(1600);
		}
		catch(OverdraftException e){
		System.out.println(e.getMessage()+ e.getDeficit());
		e.printStackTrace();
		}
		
	}
}
