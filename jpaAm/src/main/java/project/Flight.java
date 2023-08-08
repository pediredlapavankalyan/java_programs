package project;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Flights")
public class Flight {

	@Id
	private int flightNo;
	private String durationInMinutes;
	private LocalTime departureTime;
	private LocalTime ArrivalTime;
	private String Aircraft;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FromCity")
	private City fromCity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ToCity")
	private City toCity;

	@OneToMany(mappedBy = "scheduledFlight")
	private List<ScheduledFlight> scheduledFlights = new ArrayList<>();

	@OneToMany(mappedBy = "operatedFlight")
	private List<FlightHistory> operatedFLights = new ArrayList<>();

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(String durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return ArrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		ArrivalTime = arrivalTime;
	}

	public String getAircraft() {
		return Aircraft;
	}

	public void setAircraft(String aircraft) {
		Aircraft = aircraft;
	}

	public City getFromCity() {
		return fromCity;
	}

	public void setFromCity(City fCity) {
		this.fromCity = fCity;
	}

	public City geTotCity() {
		return toCity;
	}

	public void setToCity(City tCity) {
		this.toCity = tCity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return flightNo == other.flightNo;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", durationInMinutes=" + durationInMinutes + ", departureTime="
				+ departureTime + ", ArrivalTime=" + ArrivalTime + ", Aircraft=" + Aircraft + ", fromCity=" + fromCity
				+ ", toCity=" + toCity + "]";
	}

}
