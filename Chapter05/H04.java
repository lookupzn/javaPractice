import java.util.Scanner;

public class H04
{
	public static void main(String[] args)
	{
		//ˮ�ɻ�����1.��λ�� 2.ÿ��λ���ϵ����ֵ����η�֮�͵��������λ��
		//˼·��1.�ж����������λ����Χ�� 2.������λ����ÿһλ������� 3.��ˮ�ɻ����Ĺ��ɽ��м���
		//��ʼ
		Scanner myScanner = new Scanner(System.in);//¼������
		System.out.print("�������֣� ");
		int num = myScanner.nextInt();
		int hNum = num / 100;
		int tNum = (num - (100 * hNum)) / 10;
		int gNum = (num - (100 * hNum)) % 10;//���ÿһλ����
		if (num >= 100 && num <= 999)// ȷ����3λ��
		{
			if(num == (hNum * hNum * hNum) + (tNum * tNum * tNum) + (gNum * gNum * gNum))
			{
				System.out.println(num +"��ˮ����");
			}
			else
			{
				System.out.println(num +"����ˮ����");
			}
		}
		else
		{
			System.out.println("���ָ�ʽ����");
		}
	}
}