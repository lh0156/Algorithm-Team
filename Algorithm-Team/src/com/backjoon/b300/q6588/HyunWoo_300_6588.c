#include<stdio.h>
#include<stdlib.h>



int isPrimeNum(int num){
	int i;
	
	for(i=2;i<num;i++) {
		if(num%i==0){
			return 0;
		}
	}
	return 1;		
}

int main(void) {
	
//	0�̸� ����
//	Ȧ�� ������ ����
//	���� ���� ���� Ȧ���� ���� +�Ҽ� 
//	�Է°��� ���Ͻ� �극��ũ �ϸ� ������ �� �Է� 
//	���� �Էµ� ���·� ���� ������ ���������� �ܺ� ������ �극��ũ

	int num,i,j,k,result,count;
	count=0;
	result=0;
	num=1;
	while(1){
		
		scanf("%d",&num);
		if(num>0){
			for(i=3;i<num;i+=2){
				if(isPrimeNum(i)){
					for(j=3;j<num;j+=2){
						
						if(isPrimeNum(j)){
							if(i+j==num){
								result=1;
								printf("%d = %d + %d\n",num,i,j);
								break;
							}	
						}
						
					}
					if(result==1){
						break;
					}else if(i==num-1){
						printf("Goldbach's conjecture is wrong.");
					}else{
						continue;
					}
				}else{
					continue;
				}
			}	
		}else{
			break;
		}
		
		result=0;
	} 
	 
	return 0;
}
