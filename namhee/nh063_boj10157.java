// boj 10157 �ڸ����� (22:00~23:24, 84��)
package com.algo.practice;

import java.util.Scanner;

public class nh063_boj10157 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int R = sc.nextInt();
		int[][] seat = new int[R][C];
		int K = sc.nextInt();
		
		int i = 0, j = 0;
		int newI = R-1, newJ = 0;
		
		if (C*R >= K) {
			int di[] = {-1, 0, 1, 0};
			int dj[] = {0, 1, 0, -1};
			int dir = 0;
			for (int N = 1; N <= C*R; N++) {					
				i = newI;
				j = newJ;
				seat[i][j] = N; 
				
				if (N == K) break;
							
				newI = i + di[dir];
				newJ = j + dj[dir];
				
				if (isWall(newI, newJ, R, C) || seat[newI][newJ] != 0) {
					dir = (dir + 1) % 4;
					newI = i + di[dir];
					newJ = j + dj[dir];
				}
			}
			System.out.printf("%d %d%n", j+1, R-i);
		}
		else {
			System.out.println(0);
		}

//		for (int r = 0; r < R; r++) {
//			for (int c = 0; c < C; c++) {
//				System.out.print(seat[r][c] + "\t");
//			}
//			System.out.println();
//		}
	}

	private static boolean isWall(int i, int j, int R, int C) {
		return (i < 0 || i >= R || j < 0 || j >= C);
	}
}

/* ���� Ǯ��
   1. �־��� �迭 ä�� ������
    �迭�� ũ�� : 1000x1000(10^3 * 10^3) = 10^6
    (�ű⿡ ����ȣ�� K�ε� K�� �迭 ���̺��� ũ�ٸ� Ž������ ���� 0 ���)
 	������ �ٲٴ� ���� : �̹� ���� ����(�¼����� 0�� �ƴ�) / �迭 ������ ���
 	������ �ٲٴ� ��� : ��(0)->��(1)->��(2)->��(3)->��(0)->... 
   
 */