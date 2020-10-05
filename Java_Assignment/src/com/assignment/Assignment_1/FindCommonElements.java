package com.assignment.Assignment_1;

public class FindCommonElements {
	public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
		int temp[] = new int[arr1.length];
		for(int i=0,x=0,y=0,z=0; x < arr1.length && y < arr2.length && z < arr3.length;) {
			if(arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				temp[i++] = arr1[x];
				x++; y++; z++;
			}else if(arr1[x] < arr2[y])
					x++;
			else if(arr2[y] < arr3[z])
					y++;
			else
				z++;
		}
	return temp;
	}
}
