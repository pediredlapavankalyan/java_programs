package jpa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "car_1")
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int car_number;

	@Column(name = "make", length = 30)
	private String brand;

	@Column(name = "type", length = 20)
	private String model;

	@ElementCollection
	@CollectionTable(name = "accessories1", joinColumns = @JoinColumn(name = "car_num"))
	private Set<String> accessories = new HashSet<String>();

	public int getNumber() {
		return car_number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Set<String> getAccessories() {
		return accessories;
	}

	public void setAccessories(Set<String> accessories) {
		this.accessories = accessories;
	}

	@Override
	public String toString() {
		return "Car [car_number=" + car_number + ", brand=" + brand + ", model=" + model + ", accessories="
				+ accessories + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessories, brand, car_number, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(accessories, other.accessories) && Objects.equals(brand, other.brand)
				&& car_number == other.car_number && Objects.equals(model, other.model);
	}

}
