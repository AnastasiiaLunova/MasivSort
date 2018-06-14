package org.itstep;

import org.itstep.Controller;
import org.itstep.Model;
import org.itstep.View;

public class AppRunner {

	public static void main(String[] args) {
		int[] array = {1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 6, 9};
		Model model = new Model(6, array);
		View view = new View();
		Controller controller = new Controller(view, model);

		controller.getElementOfArray();
	}
}
