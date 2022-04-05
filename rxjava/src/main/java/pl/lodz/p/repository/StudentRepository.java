package pl.lodz.p.repository;

import io.reactivex.rxjava3.core.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.lodz.p.util.ClockUtil;

import java.time.Duration;

public class StudentRepository {

	private static final Logger log = LoggerFactory.getLogger(StudentRepository.class);

	public Student findById(int id) {
		//Faking that we are querying database
		log.info("Fetching student with id:  {}", id);
		ClockUtil.sleep(Duration.ofMillis(900));
		return new Student();
	}

}
