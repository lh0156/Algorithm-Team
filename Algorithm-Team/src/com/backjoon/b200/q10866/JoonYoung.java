package com.backjoon.b200.q10866;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class JoonYoung {

	public static void main(String[] args) {
		
		//��ɼ� �о��
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //���� ������
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        //������ ����
        for (int i = 0; i < n; i++) {
        	
        	//��ɾ� �Է¹ޱ�
            String input = scan.next();
            
            //push_front�� ��� �տ� �߰�
            if(input.equals("push_front")){
            	
                deque.addFirst(scan.nextInt());
            
            //push_back�� ��� �ڿ� �߰�
            } else if (input.equals("push_back")){
            	
                deque.addLast(scan.nextInt());
            
            //������ -1 �ƴϸ� �տ��� ������
            } else if (input.equals("pop_front")){
            	
                if (deque.size()<1) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollFirst());
                }
            
            //������ -1 �ƴϸ� �ڿ��� ������
            } else if (input.equals("pop_back")){
            	
                if(deque.size()<1){
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
            
            //�� ������
            } else if (input.equals("size")){
            	
                System.out.println(deque.size());
            
            //�����?
            } else if (input.equals("empty")){
            	
                if(deque.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            
            //�� ���� �� ���
            } else if (input.equals("front")){
            	
                if (deque.size()<1) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }
             
            //�� ���� �� ��� 
            } else if (input.equals("back")){
                if (deque.size()<1) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }

            }
        }

    }

	
}
