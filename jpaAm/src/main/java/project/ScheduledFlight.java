package project;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScheduledFlight")
@IdClass(FlightDate.class)
public class ScheduledFlight {

	@Id
	private int flightNo;
	@Id
	private LocalDate deptDate;

	private LocalTime deptTime;
	private LocalDate arrivalDate;
	private LocalTime arrivalTime;
	private int durationInMinutes;

	// mapping with city
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FromCity")
	private City fromCity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ToCity")
	private City toCity;

	// mapping with flight
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FlightNo", insertable = false, updatable = false)
	private Flight scheduledFlight;

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public LocalDate getDeptDate() {
		return deptDate;
	}

	public void setDeptDate(LocalDate deptDate) {
		this.deptDate = deptDate;
	}

	public LocalTime getDeptTime() {
		return deptTime;
	}

	public void setDeptTime(LocalTime deptTime) {
		this.deptTime = deptTime;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public City getFromCity() {
		return fromCity;
	}

	public void setFromCity(City fromCity) {
		this.fromCity = fromCity;
	}

	public City getToCity() {
		return toCity;
	}

	public void setToCity(City toCity) {
		this.toCity = toCity;
	}

	public Flight getScheduledFlight() {
		return scheduledFlight;
	}

	public void setScheduledFlight(Flight flight) {
		this.scheduledFlight = flight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightNo, deptDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduledFlight other = (ScheduledFlight) obj;
		return flightNo == other.flightNo && Objects.equals(deptDate, other.deptDate);
	}

	@Override
	public String toString() {
		return "ScheduledFlight [FLightNo=" + flightNo + ", deptDate=" + deptDate + ", deptTime=" + deptTime
				+ ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime + ", FromCity=" + fromCity.getName()
				+ ", ToCity=" + toCity.getName() + ", durationInMinutes=" + durationInMinutes + "]";
	}

}
