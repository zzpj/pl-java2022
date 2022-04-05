package pl.lodz.p.stock;

import io.reactivex.rxjava3.core.Observable;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.lodz.p.util.ClockUtil;

import java.time.Duration;

public class StockExchangeService {

	private static final Logger log = LoggerFactory.getLogger(StockExchangeService.class);

	public Stock fetch(String stockAcronym) {
		log.info("Loading trend for:{}", stockAcronym);
		//Here we are pretending to perform network communication
		ClockUtil.sleep(Duration.ofMillis(RandomUtils.nextInt(900, 950)));
		log.info("Fetched trend for stock: {}", stockAcronym);
		return new Stock();
	}


}
