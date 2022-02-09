package bababab;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class JoonYoung {

	public static void main(String[] args) throws IOException {
		
		//��ĳ�ʷ� �о��
		Scanner scan = new Scanner(System.in);
		
		//n�ϱ� k �Է¹޾ƾ���
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		//�Է°��� �߶� ���ϱ� ���� StringBuilder ���
		StringBuilder sb = new StringBuilder();
		
		//�� �տ� ��ȣ
		sb.append("<");
		
		//���ο� queue�� ���� ���Լ���� �����ϴϱ�
		Queue<Integer> list = new LinkedList<>();
		
		//list�� ���ڸ� ��ƺ���
		for (int i=1; i<=n; i++) {
			list.offer(i); 
		}
		
		//��ĩ���� �޾��ִ� index
		int index = 0;
		
		//�ε��� ���� �ϳ��� �ø��鼭 ������ �Է°� k�� �������� poll�Ͽ� sb�� ���
		while(!list.isEmpty()) {
			
			index++;
			if(index % k == 0) {
				sb.append(list.poll()+", "); 
			}
			else list.offer(list.poll()); 
		}
		
		//������ �� append , ����
		sb.delete(sb.length()-2, sb.length());
		
		//�ݾ��ֱ�
		sb.append(">");
		
		//��� ���
		System.out.println(sb.toString());
	}


	
}
