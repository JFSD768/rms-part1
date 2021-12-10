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
public class DeleteRoommate {

	public void delete(BufferedReader in) {
		try {
			System.out.println("Deleteing Roommate Details");
			System.out.println();
			System.out.print("Enter Roommate ID: ");
			int no = Integer.parseInt(in.readLine());
			RoommateController rmtController = new RoommateController();
			RMSResponseModel response = rmtController.deleteRoommate(no);
			System.out.println(response.getResult());
			System.out.println();
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage() + ", please try again with proper inputs.");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DeleteRoommate dr = new DeleteRoommate();
		dr.delete(new BufferedReader(new InputStreamReader(System.in)));
	}

}
