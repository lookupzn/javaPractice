import java.util.Scanner;

public class TicketSys
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·ݣ� ");
		int month = myScanner.nextInt();
		if(month >= 1 && month <= 12)
		{
			if(month >= 4 && month <= 10)
			{
				System.out.println("���������䣺 ");
				int age = myScanner.nextInt();
				if (age >= 18 && age <= 60)
				{
					System.out.println("����Ҫ����60Ԫ");
				}
				else if (age < 18 && age >= 0)
				{
					System.out.println("����Ҫ����30Ԫ");
				}
				else if (age > 60)
				{
					System.out.println("����Ҫ����20Ԫ");
				}
				else
				{
					System.out.println("Data Error.");
				}
			}
			else if((month < 4 && month >= 1) || (month > 10 && month <= 12))
			{
				System.out.println("���������䣺 ");
				int age01 = myScanner.nextInt();
				if (age01 >= 18 && age01 <= 60)
				{
					System.out.println("����Ҫ����40Ԫ");
				}
				else if (age01 < 0)
				{
					System.out.println("Data Error.");
				}
				else
				{
					System.out.println("����Ҫ����20Ԫ");
				}
			}
		}
		else
		{
			System.out.println("��������ȷ�·�");
		}
	}
}