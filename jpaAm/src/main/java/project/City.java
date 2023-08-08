package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cities")
public class City {
	@Id
	private String cityCode;
	private String name;
	private int minutesFromUTC;
	private String country;

	@OneToMany(mappedBy = "fromCity")
	private List<Flight> fromFlights = new ArrayList<>();

	@OneToMany(mappedBy = "toCity")
	private List<Flight> toFlights = new ArrayList<>();

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinutesFromUTC() {
		return minutesFromUTC;
	}

	public void setMinutesFromUTC(int minutesFromUTC) {
		this.minutesFromUTC = minutesFromUTC;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Flight> getFromFlights() {
		return fromFlights;
	}

	public void setFromFlights(List<Flight> fromFlights) {
		this.fromFlights = fromFlights;
	}

	public List<Flight> getToFlights() {
		return toFlights;
	}

	public void setToFlights(List<Flight> toFlights) {
		this.toFlights = toFlights;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityCode, other.cityCode);
	}

	@Override
	public String toString() {
		return name; 
				
	}

}
