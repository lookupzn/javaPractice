public class EightQ{
	public static void main(String[] args)
	{
		//�˻ʺ󣬲�����ͬһ��ͬһ��ͬһб��
		//���Ϊ���з���
		int arrQ = new int[8];//1.����һ��8�����ȵ�һά���飬Ԫ���±�Ϊ������
		
		for(int i = 0; i < 8 ; i++)
		{
			//2. �õ�һ��Ů�ʵ�λ�ô�(0,0) --> (0,7)�����в���
			for(int j = 0; j < 8; j++)
			{

			}
		}

	}
}

class Queen
{
	public int methodForCount (int m,int n)
	{
		int i = 0;
		if(n == 0)
		{
			return 1;
		}
		else if (m != arrQ[n - 1]) && (m != (arrQ[n -1] + m - n + 1)) && (m != (arrQ[n -1] - m + n - 1) )
		{
			
			methodForCount (m,(n-1));			
			//3. ��Ʒ�����ͳ�Ƴɹ�����һ�εĴ���,ʧ�ܲ���ͳ��
		}
		else
		{
			return 0;
		}
			
		}
		
	}


}