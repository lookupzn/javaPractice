public class H02
{
	public static void main(String[] args)
	{
		//1.���10��������1-100��
		//2.�����ӡ
		//3.ƽ��ֵ�����ֵ�����ֵ�±�
		//4.����û��8
		//��ʼ
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++)
		{
			int ran = (int)(Math.random()* 100 + 1);
			arr[i] = ran;
		}//1.����һ����10��1-100�����������
		int arrOri[] = new int[arr.length];
		for (int i = 0;i < arr.length ;i++ ) {
			arrOri[i] = arr[i];
		}
		System.out.println("===========ԭ��������==========");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}

		//2.��������
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++)//���ѭ��9��
		{
			for(int j = 0;j < arr.length - 1 - i;j++)
			{
				if(arr[j] < arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}//����ð��
		System.out.println("");
		System.out.println("===========�������������==========");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");
		//ƽ��ֵ�����ֵ�����ֵ�±�
		double sum = 0;
		for (int i = 0;i < arr.length;i++ )
		{
			sum += arr[i];	
		}
		double avgNum = sum / arr.length;
		for (int i= 0; i < arr.length;i++)
		{
			if(arrOri[i] == arr[0])
			{
				System.out.println( "�����Ϊ " + arrOri[i] + "\n" + "��������±�Ϊ " + i);
			}
		}
		System.out.println( "�ܺ�Ϊ " + sum + "\n" + "ƽ����Ϊ " + avgNum);

		//����û��8
		int index = -1;
		for (int i= 0; i < arr.length;i++)
		{
			if(arrOri[i] == 8)
			{
				index = i;
			}	
		}
		if(index == -1)
		{
			System.out.println( "û��8");
		}
		else
		{
			System.out.println( "��8");
		}
	}
}