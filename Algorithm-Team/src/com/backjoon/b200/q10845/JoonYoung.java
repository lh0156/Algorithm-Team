package bababab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class JoonYoung {

	public static void main(String[] args) throws Exception, IOException {

		//�Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� �Է¹ޱ�
		int max = Integer.parseInt(br.readLine());
		
		//����Ʈ �����
		Queue<Integer> list = new LinkedList<>();
		
		//�������� ���� �� �ޱ�
		int addlist = 0;
        
        //������
		for (int i=0; i<max; i++) {
			
			//��ɾ� �Է¹ޱ�
			String input = br.readLine();
			
			//queue���� ������
			if (input.equals("pop")) {
				
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					
					System.out.println(list.poll());
				}
				
			//list ������
			} else if (input.equals("size")) {
				
				System.out.println(list.size());
			
			//�����?
			} else if (input.equals("empty")) {
				
				if (list.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				
			//list �� ���� ��	
			} else if (input.equals("front")) {
				
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(list.peek());
				}
			
			//�������� ���� ��
			} else if (input.equals("back")) {
				
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(addlist);
				}
			
			//���� ���� split���� �߶� queue�� �ֱ�
			} else if (input.startsWith("push")) {
							
				String[] array = input.split("\\s");
				
				String addl = array[1];
				addlist = Integer.parseInt(addl);
				
				list.offer(addlist);
				
				
			}
			
		}
		br.close();
		
	}


	
}
