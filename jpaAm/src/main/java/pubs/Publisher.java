package pubs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "publishers")
@Entity(name = "pubs.Publisher")
public class Publisher {
	@Id
	private int pub_id;
	private String pub_name;
	private String city;
	@OneToMany(mappedBy = "publisher", fetch = FetchType.EAGER)
	private List<Title> title = new ArrayList<Title>();

	public List<Title> getTitle() {
		return title;
	}

	public void setTitle(List<Title> title) {
		this.title = title;
	}

	public int getPub_id() {
		return pub_id;
	}

	public void setPub_id(int pub_id) {
		this.pub_id = pub_id;
	}

	public String getPub_name() {
		return pub_name;
	}

	public void setPub_name(String pub_name) {
		this.pub_name = pub_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
