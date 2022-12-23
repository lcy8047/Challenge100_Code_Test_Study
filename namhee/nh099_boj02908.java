// boj2908 ��� (10min)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class nh099_boj02908 {
	public static void main(String[] args) throws IOException {
		// 1. INPUT DATA (A & B - 3 digits int, A != B)
		// �� A�� B���� 0�� ���ٰ� �Ѵ�.

		// 1-A. Scanner input (�޸� 17.5MB, �ð� 204ms)
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
		
		// 1-B. BufferedReader input (�޸� 14MB, �ð� 120ms)
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		// 2. GET REVERSE NUM
		int rvsA = 0;
		int rvsB = 0;
		for (int i = 0; i < 3; i++) {
			rvsA *= 10;
			rvsB *= 10;
			
			rvsA += A % 10;	
			rvsB += B % 10;
			
			A /= 10;
			B /= 10;
		}
		// rvsA = (A % 10 * 100) + (A % 100 - A % 10) + (A / 100);
		// rvsB = (B % 10 * 100) + (B % 100 - B % 10) + (B / 100);
		// �ڸ����� 3���� �����Ǿ� ������ ���� ���� ��Ÿ���� �� �� ������ ����?
		// ���� ū �ӵ� ���̴� ������.
		
		// 3. COMPARE & OUTPUT
		//System.out.print(rvsA > rvsB ? rvsA : rvsB);
		System.out.print(Math.max(rvsA, rvsB));
		// �� ���� ū �ӵ� ���̴� ������.
	}
}

// (digit 10^0 -> 10^1 -> 10^2�� ���ʴ�� ������.)
// -> ��¥�� ����� ������ ���ڷ� �ؾ� �ϴ� ������ �۾����� ������.

// String ���� �Լ� ���� �ڵ尡 �ξ� ��������������,
// String�� ���� �Ŵϱ� �޸𸮶� �ð� �鿡���� �Ҹ��� �� ����. Ȯ���غ���.
// String ������� ���� ���� ���µ� �ϴ�..
// java�� ���ڿ� ������ �� pythonó�� �������� �ʱ�
// reverse�� �����غôµ� ������ java���� ��ȿ������ �� ����.
