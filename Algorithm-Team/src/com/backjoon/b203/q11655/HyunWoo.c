#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	char content[2001];
	
//	printf("%d",'a');
//	printf("%d",'z');
	fgets(content,2001,stdin);
	
	int i;
	
	for(i=0; content[i]; i++){
		if(content[i]>64 && content[i]<91){
			if(content[i]+13 > 90){
				printf("%c",content[i]-13);//13��° ���Ĵϱ� +13 ���� Z �� �Ѿ�� ������ -24 ���������� -13 
			}else{
				printf("%c",content[i]+13);
			}
		}else if(content[i]>96 && content[i]<123){
			if(content[i]+13 > 122){
				printf("%c",content[i]-13);//13��° ���Ĵϱ� +13 ���� Z �� �Ѿ�� ������ -24 ���������� -13 
			}else{
				printf("%c",content[i]+13);
			}
		}else{
			printf("%c",content[i]);
			continue;
		}
	}
	
	return 0;
}
