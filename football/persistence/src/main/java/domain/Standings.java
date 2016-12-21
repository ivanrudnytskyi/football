package domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Standings {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer position;

	@Column
	private Integer tourNumber;
	
	@Column
	private Integer teamId;
	
	@Column
	private Integer gamesPlayed;
	
	@Column
	private Integer gamesWon;
	
	@Column
	private Integer gamesDraw;
	
	@Column
	private Integer gamesLost;
	
	@Column
	private Integer goalsScored;
	
	@Column
	private Integer goalsMissed;
	
	@Column
	private Integer points;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getTourNumber() {
		return tourNumber;
	}

	public void setTourNumber(Integer tourNumber) {
		this.tourNumber = tourNumber;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public Integer getGamesWon() {
		return gamesWon;
	}

	public void setGamesWon(Integer gamesWon) {
		this.gamesWon = gamesWon;
	}

	public Integer getGamesDraw() {
		return gamesDraw;
	}

	public void setGamesDraw(Integer gamesDraw) {
		this.gamesDraw = gamesDraw;
	}

	public Integer getGamesLost() {
		return gamesLost;
	}

	public void setGamesLost(Integer gamesLost) {
		this.gamesLost = gamesLost;
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

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((gamesDraw == null) ? 0 : gamesDraw.hashCode());
		result = prime * result
				+ ((gamesLost == null) ? 0 : gamesLost.hashCode());
		result = prime * result
				+ ((gamesPlayed == null) ? 0 : gamesPlayed.hashCode());
		result = prime * result
				+ ((gamesWon == null) ? 0 : gamesWon.hashCode());
		result = prime * result
				+ ((goalsMissed == null) ? 0 : goalsMissed.hashCode());
		result = prime * result
				+ ((goalsScored == null) ? 0 : goalsScored.hashCode());
		result = prime * result + ((points == null) ? 0 : points.hashCode());
		result = prime * result
				+ ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result
				+ ((tourNumber == null) ? 0 : tourNumber.hashCode());
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
		Standings other = (Standings) obj;
		if (gamesDraw == null) {
			if (other.gamesDraw != null)
				return false;
		} else if (!gamesDraw.equals(other.gamesDraw))
			return false;
		if (gamesLost == null) {
			if (other.gamesLost != null)
				return false;
		} else if (!gamesLost.equals(other.gamesLost))
			return false;
		if (gamesPlayed == null) {
			if (other.gamesPlayed != null)
				return false;
		} else if (!gamesPlayed.equals(other.gamesPlayed))
			return false;
		if (gamesWon == null) {
			if (other.gamesWon != null)
				return false;
		} else if (!gamesWon.equals(other.gamesWon))
			return false;
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
		if (points == null) {
			if (other.points != null)
				return false;
		} else if (!points.equals(other.points))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		if (tourNumber == null) {
			if (other.tourNumber != null)
				return false;
		} else if (!tourNumber.equals(other.tourNumber))
			return false;
		return true;
	}
	
	
	
}
