public class H08
{
	public static void main(String[] args)
	{
		//����Ϊ��1.�г�1/1��1/100��Щ����
		double d = 1.0;
		int base = 1;
		double sum = 0;
		for(base = 1; base <= 100; base++)
		{
			//2.�ֳ���������������������base % 2 ==0
			//3.���
			if(base % 2 == 0)
				{
					sum -= d / base;
				}
			else
				{
					sum += d / base;
				}			
		}
		System.out.println("�ܺ�Ϊ" + sum);
	}
}