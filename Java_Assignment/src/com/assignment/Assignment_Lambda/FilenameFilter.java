package com.assignment.Assignment_Lambda;

import java.io.File;
import java.util.Scanner;

public class FilenameFilter {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File files = new File(path);
		File []subFiles = files.listFiles(file -> {
			return file.isFile();
		});
		
		for(File file: subFiles) {
			System.out.println(file.getName());
		}
	sc.close();
	}
}