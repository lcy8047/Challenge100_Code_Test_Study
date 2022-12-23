import java.util.Scanner;

public class nh090_boj11721 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// �� �����ϰ� (204ms)
		for (int i = 0; i < str.length(); i+=10) {
			System.out.println(str.substring(i, Math.min(i + 10, str.length())));
		}
	}
}

/* charAt() ����ϴ� ��� (208~212ms)
int idx = 0;
while (idx < str.length()) {
	System.out.print(str.charAt(idx));
	
	if (idx % 10 == 9) {
		System.out.println();
	}
	idx++;
}
*/

/* substring() ����ϴ� ��� (196~204ms) - �ڵ�� �䵥 �ð��� �� �ɸ�
int lineNum;
if (str.length() % 10 == 0) {
	lineNum = str.length() / 10;
}
else {
	lineNum = str.length() / 10 + 1;			
}

String[] strArr = new String[lineNum];
for (int i = 0; i < lineNum; i++) {
	if (i == lineNum - 1) {
		strArr[i] = str.substring(i * 10, str.length());
	}
	else {
		strArr[i] = str.substring(i * 10, (i + 1) * 10);				
	}
	System.out.println(strArr[i]);
}
*/

/* ������ �� ����ϰ� (�ӵ��� ���)
int n = str.length() / 10;

for (int i = 0; i < n; i++) {
	System.out.println(str.substring(i * 10, (i + 1) * 10));
}
System.out.println(str.substring(n * 10));
*/
