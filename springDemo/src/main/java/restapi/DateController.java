package restapi;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@GetMapping("/dateTime")
	public String date() {	
		return "<h1> Date : " + LocalDate.now() + " Time : " + LocalTime.now() + "</h1>";
	}

	@GetMapping("/fact/{num}")
	public BigInteger fact(@PathVariable("num") long num) {
		BigInteger factorial = BigInteger.ONE;
		if (num > 1)
			for (int i = 2; i <= num; i++) {
				factorial = factorial.multiply(BigInteger.valueOf(i));
			}
		return factorial;
	}
}
