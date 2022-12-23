// boj11047 ���� 0
import java.util.Scanner;

public class nh101_boj11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		// GET MIN NUM OF COIN
		int num = 0, tmp;
		for (int i = N - 1; i >= 1; i--) {
			if (K == 0) break;
			if (K >= A[i]) {
				tmp = K / A[i];
				K -= tmp * A[i];
				num += tmp;				
			}
		}
		num += K;
		
		System.out.println(num);
	}
	
}
//A_1�� ������ 1�̹Ƿ� ���� ������ ������ ���ϴ� ���� ����.
