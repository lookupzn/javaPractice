public class MultiTable
{
	public static void main(String[] args)
	{
		//�ڶ�����Ϊÿһ�����ֵ����һ�����ﵽ���ֵ���л��в���
		int i1 = 1;//��һ����
		int i2 = 1;//�ڶ�����
		int imax = 9;//99�˷�����
		for(i2 = 1; i2 <= imax; i2++)
		{
			for(i1 = 1;i1 <= i2; i1++)
			{
				System.out.print(i1 + "*" + i2 + "=" + (i1 * i2));
				System.out.print(" ");
			}
			System.out.println();
		}

}
}