/**
 * 
 */
package com.fsjd.rms.roommate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;

import com.fsjd.rms.controller.RoommateController;
import com.fsjd.rms.model.RMSResponseModel;
import com.fsjd.rms.model.Roommate;
import com.fsjd.rms.util.RMSUtil;

/**
 * @author madan
 *
 */
public class CreateRoommate {

	public void create(BufferedReader in) {
		try {
			System.out.println("Please Enter Details to Create New Roommate");
			System.out.println();
			System.out.print("Name: ");
			String name = in.readLine();
			System.out.print("Address: ");
			String address = in.readLine();
			System.out.print("Mobile: ");
			String mobile = in.readLine();
			System.out.print("Date Of Joining (in day-month-year): ");
			LocalDate date = null;
			String tdate = in.readLine();
			if (StringUtils.isNotBlank(tdate)) {
				date = RMSUtil.validateAndParseDate(tdate);
			} else {
				date = LocalDate.now();
			}
			Roommate rmt = new Roommate(name, address, mobile, date);
			RoommateController rmtController = new RoommateController();
			RMSResponseModel response = rmtController.addRoommate(rmt);
			System.out.println(response.getResult());
			System.out.println();
		} catch (Exception e) {
			if (e.getSuppressed() != null && e.getSuppressed().length > 0) {
				Throwable[] validations = e.getSuppressed();
				System.out.println();
				System.out.println("Validation Errors -");
				for (int i = 0; i < e.getSuppressed().length; i++) {
					System.err.println(validations[i].getMessage());
				}
				System.out.println();
			} else {
				System.err.println("Exception: " + e.getMessage() + ", please try again with proper inputs.");
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		CreateRoommate cr = new CreateRoommate();
		cr.create(new BufferedReader(new InputStreamReader(System.in)));
	}

}
