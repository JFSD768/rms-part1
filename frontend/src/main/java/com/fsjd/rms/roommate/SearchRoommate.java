/**
 * 
 */
package com.fsjd.rms.roommate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.fsjd.rms.controller.RoommateController;
import com.fsjd.rms.model.RMSResponseModel;

/**
 * @author madan
 *
 */
public class SearchRoommate {

	public void search(BufferedReader in) {
		try {
			System.out.println("Searching Roommate Details");
			System.out.println();
			System.out.print("Enter Roommate ID number: ");
			int no = Integer.parseInt(in.readLine());
			RoommateController rmtController = new RoommateController();
			RMSResponseModel response = rmtController.searchRoommate(no);
			if (response.isStatus()) {
				System.out.println(response.getResponseObject());
				System.out.println();
			} else {
				System.out.println(response.getResult());
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage() + ", please try again with proper inputs.");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SearchRoommate sr = new SearchRoommate();
		sr.search(new BufferedReader(new InputStreamReader(System.in)));
	}

}
