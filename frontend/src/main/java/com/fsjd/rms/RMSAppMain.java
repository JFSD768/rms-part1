package com.fsjd.rms;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fsjd.rms.roommate.RoommateModule;

public class RMSAppMain {

	private static final Logger LOG = LogManager.getLogger(RMSAppMain.class);

	public static void main(String[] args) throws Exception {
		LOG.info("Welcome to ROOM MANAGEMENT SYSTEM");
		boolean flag = true;
		System.out.println();
		System.out.println("****************************************************");
		System.out.println(":: Welcome to ROOM MANAGEMENT SYSTEM ::");
		System.out.println("****************************************************");
		System.out.println();
		Scanner input = new Scanner(System.in);
		while (flag) {
			System.out.println(":: MENU ::");
			System.out.println("-----------------------------------------------------");
			System.out.println("1) Roommate Module \n2) Expenses Module \n3) Reports Module \n4) Exit RMS");
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.print("Enter ur choice: ");
			System.out.println();
			char moduleNo = input.nextLine().charAt(0);

			switch (moduleNo) {

			case '1':
				RoommateModule rm = new RoommateModule();
				rm.roommateMenu();
				break;

			case '2':
				System.out.println("!!! Expenses Module is COMING SOON !!!");
				System.out.println();
				break;

			case '3':
				System.out.println("!!! Reports Module is COMING SOON !!!");
				System.out.println();
				break;

			case '4':
				System.out.println("THANK U. VISIT AGAIN");
				flag = false;
				input.close();
				break;

			default:
				System.out.println("Invalid option.Try again");
				System.out.println();
			}
		}
	}
}
