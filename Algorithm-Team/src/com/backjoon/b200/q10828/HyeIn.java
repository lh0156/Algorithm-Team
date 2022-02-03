package com.backjoon.b200.q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyeIn {

	static int[] stack;
	static int size = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1. stack�� ������ ������ �迭, size�� ������ ����� ���� �迭�� ����
		//2. ����� �� N �Է� ����
		//3. ���̰� N �迭 ����
		//4. N��ŭ for��
		//		- push: stack[size]�� �Է¹��� ���� ����, size++
		//		- pop: size�� 0�̸� -1 ��ȯ, �ƴϸ� stack[size-1] ��ȯ, size--
		//		- size: size ��ȯ
		//		- empty: size�� 0�̸� 1��ȯ, �ƴϸ� 0��ȯ
		//		- top: size�� 0�̸� -1 ��ȯ, �ƴϸ� stack[size-1] ��ȯ
		//5. ��ɾ push�� �ƴҶ��� print
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		stack = new int[N];
		
		for(int i=0; i < N; i++) {
			
			int result = 0;
			String[] input = reader.readLine().split(" ");
			
			switch (input[0]) {
			
			case "push":
				push(Integer.parseInt(input[1]));
				break;
				
			case "pop":
				result = pop();
				break;
				
			case "size":
				result = size;
				break;
			
			case "empty":
				result = empty();
				break;
			
			case "top":
				result = top();
				break;

			default:
				break;
			}
			
			if(!input[0].equals("push")) {
				System.out.println(result);
			}
			
		}
		
	}


	private static int top() {
		
		if(size != 0) {
			return stack[size - 1];
		} else {
			return -1;
		}
	}


	private static int empty() {

		if(size == 0) {
			return 1;
		} else {
			return 0;
		}
		
	}

	private static int pop() {
				
		if(size != 0) {
			size--;
			return stack[size];
		} else {
			return -1;
		}

	}

	private static void push(int num) {
		
		stack[size] = num;
		size++;
		
	}
	
	
}
