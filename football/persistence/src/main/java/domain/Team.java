package domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Season> seasons;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private City homeCity;
	
	@Column
	private Float strength;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public City getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(City homeCity) {
		this.homeCity = homeCity;
	}

	public Float getStrength() {
		return strength;
	}

	public void setStrength(Float strength) {
		this.strength = strength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((homeCity == null) ? 0 : homeCity.hashCode());
		result = prime * result + ((seasons == null) ? 0 : seasons.hashCode());
		result = prime * result
				+ ((strength == null) ? 0 : strength.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (homeCity == null) {
			if (other.homeCity != null)
				return false;
		} else if (!homeCity.equals(other.homeCity))
			return false;
		if (seasons == null) {
			if (other.seasons != null)
				return false;
		} else if (!seasons.equals(other.seasons))
			return false;
		if (strength == null) {
			if (other.strength != null)
				return false;
		} else if (!strength.equals(other.strength))
			return false;
		return true;
	}
	
	

}
