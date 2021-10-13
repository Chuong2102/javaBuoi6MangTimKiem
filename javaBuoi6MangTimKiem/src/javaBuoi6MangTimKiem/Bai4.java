package javaBuoi6MangTimKiem;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {

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
	
	public static void Print(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] TangDan(int[] arr) {
		System.out.println("Tang dan: ");
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length; j ++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] GiamDan(int[] arr) {
		System.out.println("Giam dan: ");
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length; j ++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void TimKiemLanDau(int[] arr, int n, int soCanTim) {
		boolean daTimDc = false;
		for(int i = 0; i < n; i++) {
			if(arr[i] == soCanTim) {
				System.out.println("Vi tri xuat hien la`: " + i);
				daTimDc = true;
				break;
			}
		}
		if(!daTimDc)
			System.out.println(-1);
		
	}
	
	public static void TimKiemHet(int[] arr, int n, int soCanTim) {
		boolean daTimDc = false;
		int[] arrRes = new int[n];
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == soCanTim) {
				System.out.println(i + " ");
				daTimDc = true;
				break;
			}
		}
		if(!daTimDc)
			System.out.println(-1);
		
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
		
		System.out.println();
		
		arr = TangDan(arr);
		Print(arr);
		arr = GiamDan(arr);
		Print(arr);
		
		System.out.println("Nhap so can tim`: ");
		soCanTim = input.nextInt();
		
		TimKiemLanDau(arr, n, soCanTim);
		TimKiemHet(arr, n, soCanTim);
	}

}
