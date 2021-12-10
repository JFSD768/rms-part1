/**
 * 
 */
package com.fsjd.rms.roommate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.fsjd.rms.utils.MenuOptions;

/**
 * @author madan
 *
 */
public class RoommateModule {

	private static final String DISPLAY_LINE = "------------------------------------------------------------------------------------------------------------";
	private static final String MENU = "1) Add Roommate 2) Edit Roommate 3) Delete Roommate 4) Search Roommate 5) Display Roommate Details 6) Exit Module";

	public void roommateMenu() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			boolean flag = true;
			while (flag) {
				System.out.println(":: ROOMMATE MENU ::");
				System.out.println(DISPLAY_LINE);
				System.out.println(MENU);
				System.out.println(DISPLAY_LINE);
				System.out.println();
				System.out.print("Enter Menu Option: ");
				int menuNo = Integer.parseInt(in.readLine());
				MenuOptions choice = MenuOptions.valueOfMenuNumber(menuNo);
				switch (choice) {
				case CREATE:
					String s = null;
					do {
						CreateRoommate cr = new CreateRoommate();
						cr.create(in);
						System.out.println("Do u want to continue(y to proceed): ");
						s = in.readLine();
					} while (s.equalsIgnoreCase("y"));
					break;

				case UPDATE:
					do {
						UpdateRoommate ur = new UpdateRoommate();
						ur.update(in);
						System.out.println("Do u want to continue(y to proceed): ");
						s = in.readLine();
					} while (s.equalsIgnoreCase("y"));
					break;

				case DELETE:
					do {
						DeleteRoommate dr = new DeleteRoommate();
						dr.delete(in);
						System.out.println("Do u want to continue(y to proceed): ");
						s = in.readLine();
					} while (s.equalsIgnoreCase("y"));
					break;

				case SEARCH:
					do {
						SearchRoommate sr = new SearchRoommate();
						sr.search(in);
						System.out.println("Do u want to continue (y to proceed): ");
						s = in.readLine();
					} while (s.equalsIgnoreCase("y"));
					break;

				case RETRIVE_ALL:
					RetriveAllRoommate rar = new RetriveAllRoommate();
					rar.retrive();
					break;
				case EXIT:
					System.out.println("#### THANK YOU. VISIT AGAIN ####");
					flag = false;
					break;
				default:
					System.out.println("Invalid Option.Try Again");
				}
			}
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage() + ", please try again with proper inputs.");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		RoommateModule rm = new RoommateModule();
		rm.roommateMenu();
	}

}
