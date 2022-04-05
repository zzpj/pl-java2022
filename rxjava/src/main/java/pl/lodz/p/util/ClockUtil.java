package pl.lodz.p.util;

import java.time.Duration;

public class ClockUtil {

	public static void sleep(Duration duration) {
		try {
			Thread.sleep(duration.toMillis());
		} catch (InterruptedException e) {
			//don't do this at home
			e.printStackTrace();
		}

	}

}
