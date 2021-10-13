package javaBuoi6MangTimKiem;
import java.util.Random;
import java.util.Scanner;
public class Bai2 {
	
	public static int[] NhapMang(int n) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[n];
		Random rand = new Random();
        int ranNum;
		System.out.println("Sinh so cho mang:");
		for(int i = 0; i < n; i++) {
			ranNum = rand.nextInt(100)+1;
			System.out.print(ranNum + " ");
			arr[i] = ranNum;
		}
		System.out.println();
		
		return arr;
	}

	public static int[] TimKiem(int[] arr, int n, int soCanTim) {
		boolean daTimDc = false;
		int[] arrResult = new int[n];
		for(int i = 0; i < n; i++) {
			if(arr[i] == soCanTim) {
				arrResult[i] = i;
				daTimDc = true;
			}
		}
		
		return arrResult;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		int soCanTim;
		System.out.println("Nhap so phan tu cua mang");
		n = input.nextInt();
		int[] arr;
		
		arr = NhapMang(n);
		
		System.out.println("Nhap so can tim`: ");
		soCanTim = input.nextInt();
		
		int[] arrRes = TimKiem(arr, n, soCanTim);
		
		System.out.println();
		for(int i = 0; i < n ; i++) {
			System.out.print(arrRes[i] + " ");
		}
	}

}
