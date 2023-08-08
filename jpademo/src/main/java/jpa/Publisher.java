package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "publishers") // Specifies the primary table for the annotated entity.
@Entity(name = "publishers") // Specifies that the class is an entity. This annotation is applied to the
								// entity class.
public class Publisher {
	@Id // Specifies primary key of the entity
	@Column(name = "pub_id") // Specifies the mapped column
	private int pubId;
	@Column(name = "pub_name")
	private String pubName;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;

	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return this.pubId;
	}

	@Override
	public boolean equals(Object obj) {
		Publisher other = (Publisher) obj;
		return this.pubId == other.pubId;
	}

	@Override
	public String toString() {
		return "Publisher [pubId=" + pubId + ", pubName=" + pubName + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}

}
