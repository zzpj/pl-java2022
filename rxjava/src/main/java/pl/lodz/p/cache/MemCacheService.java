package pl.lodz.p.cache;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.lodz.p.util.ClockUtil;

import java.time.Duration;

public class MemCacheService {

	private static final Logger log = LoggerFactory.getLogger(MemCacheService.class);

	public String findByHash(long hash) {
		log.info("Loading cached object for hash : {}", hash);
		ClockUtil.sleep(Duration.ofMillis(RandomUtils.nextInt(100, 200)));
		log.info("Found object with hash: {}", hash);
		return "{ hashOfAnObject : " + hash + "}";
	}

}
