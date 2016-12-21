package com.softserve.delivery.a8_2.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Play {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Season season;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp playDateTime;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Stadium playStadium;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Team homeTeam;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Team guestTeam;
	
	@Column
	private Integer goalsScored;
	
	@Column
	private Integer goalsMissed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public Timestamp getPlayDateTime() {
		return playDateTime;
	}

	public void setPlayDateTime(Timestamp playDateTime) {
		this.playDateTime = playDateTime;
	}

	public Stadium getPlayStadium() {
		return playStadium;
	}

	public void setPlayStadium(Stadium playStadium) {
		this.playStadium = playStadium;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getGuestTeam() {
		return guestTeam;
	}

	public void setGuestTeam(Team guestTeam) {
		this.guestTeam = guestTeam;
	}

	public Integer getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(Integer goalsScored) {
		this.goalsScored = goalsScored;
	}

	public Integer getGoalsMissed() {
		return goalsMissed;
	}

	public void setGoalsMissed(Integer goalsMissed) {
		this.goalsMissed = goalsMissed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((goalsMissed == null) ? 0 : goalsMissed.hashCode());
		result = prime * result
				+ ((goalsScored == null) ? 0 : goalsScored.hashCode());
		result = prime * result
				+ ((guestTeam == null) ? 0 : guestTeam.hashCode());
		result = prime * result
				+ ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result
				+ ((playDateTime == null) ? 0 : playDateTime.hashCode());
		result = prime * result
				+ ((playStadium == null) ? 0 : playStadium.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
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
		Play other = (Play) obj;
		if (goalsMissed == null) {
			if (other.goalsMissed != null)
				return false;
		} else if (!goalsMissed.equals(other.goalsMissed))
			return false;
		if (goalsScored == null) {
			if (other.goalsScored != null)
				return false;
		} else if (!goalsScored.equals(other.goalsScored))
			return false;
		if (guestTeam == null) {
			if (other.guestTeam != null)
				return false;
		} else if (!guestTeam.equals(other.guestTeam))
			return false;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		if (playDateTime == null) {
			if (other.playDateTime != null)
				return false;
		} else if (!playDateTime.equals(other.playDateTime))
			return false;
		if (playStadium == null) {
			if (other.playStadium != null)
				return false;
		} else if (!playStadium.equals(other.playStadium))
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		return true;
	}
	
	
	
}
