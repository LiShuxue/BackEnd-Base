//��Ŀ���ж�101-200֮���ж��ٸ���������������������� 
//�������ֳ�����������1���������ⲻ����������������
//����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� ���������������������֮��������

package ����;
public class Digit {
public static void main(String[] args) {
    int count = 0;
    for(int i=101; i<200; i+=2) {   //ż��������������������i+2
    	boolean b = false;
    	for(int j=2; j<=Math.sqrt(i); j++) {
    		if(i % j == 0) { 
    			b = false;
    			break;
    		} 
    		else { 
    			b = true; 
    		}
    	}
        if(b == true) {           //ע��һ���Ⱥź������Ⱥ�
        	count ++;
        	System.out.println(i);
        }                                  
    }
    System.out.println( "����������: " + count);	
}
}