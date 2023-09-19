package open.website;

import java.util.*;
import java.awt.Desktop;
import java.net.URI;

@SuppressWarnings("unused")
public class Open_Website_Url {

	public static void setUrlAddress(String urlAddress) {
		try {

			/*
			 * To Declare the Desktop class variable to hold the object of Desktop
			 */

			Desktop desktop = null;

			/*
			 * To check the Desktop class is supported on this platform or not by using this
			 * method isDesktopSupported()
			 */

			if (Desktop.isDesktopSupported()) {

				/*
				 * To get The Object of Desktop by using this method getDesktop()
				 */

				desktop = Desktop.getDesktop();

				/*
				 * To check the BROWSE is supported or not
				 */

				if (desktop.isSupported(Desktop.Action.BROWSE)) {

					/*
					 * To Set the Url address using URI class into browse method
					 */

					desktop.browse(new URI(urlAddress));

				} else {
					System.out.println("Browser is not supported in Your Desktop.");
				}
			}

			else {
				System.out.println("Desktop is not supported");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		 

		/*
		 * To Give the Url hard code using like this
		 */

		String urlAddress = "https://www.ifinish.in/";

		/*
		 * To call the static method using class name and pass the url argument
		 */

		Open_Website_Url.setUrlAddress(urlAddress);

	}

}
