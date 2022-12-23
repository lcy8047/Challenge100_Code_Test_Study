// boj2941 : LJESNJAK (1�ð�)
import java.util.Scanner;

public class nh100_boj02941 {

	static String[] croatians = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
	public static void main(String[] args) {
		// 1. INPUT
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		// 2. GET NUM OF LETTERS
		int num = 0;
		// Compare
		for (int index = 0; index < word.length(); index++) {
			if (index < word.length() - 1) {
				// with croatian alphabet array
				for (int i = 0; i < croatians.length; i++) {
					// check impossible length
					if (index + croatians[i].length() > word.length() ) { continue; }
					
					// check same croatian
					if (word.substring(index, index + croatians[i].length()).equals(croatians[i])) {
						//System.out.println("SubString[" + index + "] : " + word.substring(index, index + croatians[i].length()));
						index += (croatians[i].length() - 1);
						break;
					}
				}				
			}
			num++;
		}

		// 3. OUTPUT
		System.out.println(num);
	}
}

// Programmers agreed to use 2 or 3-letter substitutions

// �� �˰���
// input data Ư¡ : ���� ���̰� �ִ� 100�� (���̰� �۴�.)
// ���� lowercase + '-' + '='�� ���� (= ���� �ٸ� �۾� �� �ʿ� X)

// ũ�ξ�Ƽ�� Ư¡, 2���ڴ� ����, 3���ڰ� �ϳ��� �ܾ �� ���� �ִ�.

