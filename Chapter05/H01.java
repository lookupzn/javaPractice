public class H01
{
	public static void main(String[] args)
	{
		//100000Ԫ����50000��׼����·��
		double totalMoney = 100000.0;
		double rate = 0.05;
		double k = 50000.0;
		double funderFee = 1000;
		int i = 0;//�������ٴ�·��
		while(true)
		{
			if(totalMoney > k)
			{
				totalMoney = totalMoney * (1 - rate);
				i++;
			}
			else if ((totalMoney >= funderFee) && (totalMoney < k))//ʣ�²���1k���޷�ͨ��·����
			{
				totalMoney = totalMoney - funderFee;
				i++;
			}
			else 
			{
				System.out.println("һ��" + i + "��" );//62������63
				break;
			}
		}
	}
}