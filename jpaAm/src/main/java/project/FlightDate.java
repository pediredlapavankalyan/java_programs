package project;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FlightDate implements Serializable {

	@Column(name = "FlightNo")
	private int flightNo;

	@Column(name = "DeptDate")
	private LocalDate deptDate;

	@Override
	public int hashCode() {
		return Objects.hash(deptDate, flightNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightDate other = (FlightDate) obj;
		return Objects.equals(deptDate, other.deptDate) && flightNo == other.flightNo;
	}

}
