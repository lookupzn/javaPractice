public class H01
{
	public static void main(String[] args)
	{
		//1.��������Ϊ23
		//2.ԭ����{10��12��45��90}
		//3.��������˳��Ϊ����
		//��ʼ
		int[] arr = {10,12,45,90};
		int num = 23;
		//1. ��������������
		int[] arrNew = new int[arr.length + 1];
		arrNew[arr.length] = num;
		for(int i = 0; i < arr.length; i++)
		{
			arrNew[i] = arr[i];
		}
		//2.����
		//˼·�������һ��Ԫ�أ��������֣��Ӻ���ǰ�Ƚϣ�
		//ֱ�������ֱ�ǰһ�����ִ����
		//ԭ��ԭ������һ���Ѿ����������е�����
		int temp = 0;//����һ�������洢��ʱԪ�صı���
		for(int i = (arrNew.length - 1); i > 0; i--)
		{
			if(arrNew[i] < arrNew[(i - 1)])
			{
				temp = arrNew[i - 1];
				arrNew[i - 1] = arrNew[i];
				arrNew[i] = temp;
			}	
		}
		arr = arrNew;
		System.out.println("=====Final Result=====");

		for(int i = 0;i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}