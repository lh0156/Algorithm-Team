package bababab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class joonyoung1046new2 {

	public static void main(String[] args) throws Exception {

		//�ϴ� �Է¹޾�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//����Ʈ�� ������ �߰��� ������ �ְ���?
		ArrayList<Character> list = new ArrayList<Character>();
		
		//�Է¹޾ƺ���
		String input = br.readLine();
		
		//index�� Ŀ���� �����غ��� �����ؼ� �����Ҵ�
		int index = input.length();
		
		//index�� �ڲ� �ٲ�ϱ� ���� ������ �ļ� �� ������ ���� ��������ô�
		int right = input.length();
		
		//����Ʈ�� ���ڸ� ��ƺ���
        for (int i = 0; i < index; i++) {
            list.add(input.charAt(i));
        }
        
        //������ ������ ã�ƺ���
        for (int i=0; i<index; i++) {
        	
        	//����� �Է¹޾ƺ���
        	String com = br.readLine();
        	
        	//L�̸� index�� �ϳ� �������� �����Ѵ�. �̰� Ŀ���ε� �̸��� Ŀ���� �Ұ�
        	if (com.equals("L")) {
        		if (index > 0) {
        			index --;
        		}
        	//D�� index�� ����������
        	} else if (com.equals("D")) {
        		if (index < right) {
        			index ++;
        		}
        	//B�� index-1�� ��ġ�� �ִ� ����Ʈ�� ����� Ŀ���� �ٿ��ش�
        	} else if (com.equals("B")) {
        		if (index > 0) {
        			list.remove(index-1);
        			
        			index --;
        		}
        	//P�� �����ϸ� ���ڸ� index��ġ�� ���ڸ� �߰��ؾ� �Ѵ�.
        	} else if (com.startsWith("P")) {

        		list.add(index, com.substring(2, com.length()).charAt(index)); //����ؾ��ڤӤ����Ʒ�������������̤���ó��
        		index ++;
        		
        	}
        	
        }
        
        
		
		
	}


	
}
