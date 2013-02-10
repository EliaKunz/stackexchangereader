package com.ccc.sendxalyzeit.textanalytics.stackexchange.reader;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Row {
	@XmlAttribute( name="id" )																																																																																																																																																																																																
	private int id;
	@XmlAttribute( name = "CreationDate" )
	private String creationDate;
	@XmlAttribute( name = "Score" )
	private int score;
	@XmlAttribute( name = "ViewCount" )
	private int viewCount;
	@XmlAttribute(name = "Body" )
	private String body;
	@XmlAttribute( name = "OwnerUserId" )
	private int ownerUserId;
	@XmlAttribute( name = "Title" )
	private String title;
	@XmlAttribute( name = "AnswerCount" )
	private int answerCount;
	@XmlAttribute( name = "FavoriteCount" )
	private int favoriteCount;
	@XmlAttribute( name = "LastEditorUserId" )
	private int lastEditorUserId;
	@XmlAttribute( name = "LastEditorDisplayName" )
	private String lastEditorDisplayName;
	@XmlAttribute( name = "LastEditDate" )
	private String lastEditeDate;
	@XmlAttribute( name = "LastActivityDate" )
	private String lastActivityDate;
	@XmlAttribute( name = "Tags" )
	private String tags;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(int ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAnswerCount() {
		return answerCount;
	}
	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}
	public int getFavoriteCount() {
		return favoriteCount;
	}
	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	public int getLastEditorUserId() {
		return lastEditorUserId;
	}
	public void setLastEditorUserId(int lastEditorUserId) {
		this.lastEditorUserId = lastEditorUserId;
	}
	public String getLastEditorDisplayName() {
		return lastEditorDisplayName;
	}
	public void setLastEditorDisplayName(String lastEditorDisplayName) {
		this.lastEditorDisplayName = lastEditorDisplayName;
	}
	public String getLastEditeDate() {
		return lastEditeDate;
	}
	public void setLastEditeDate(String lastEditeDate) {
		this.lastEditeDate = lastEditeDate;
	}
	public String getLastActivityDate() {
		return lastActivityDate;
	}
	public void setLastActivityDate(String lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + answerCount;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result
				+ ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + favoriteCount;
		result = prime * result + id;
		result = prime
				* result
				+ ((lastActivityDate == null) ? 0 : lastActivityDate.hashCode());
		result = prime * result
				+ ((lastEditeDate == null) ? 0 : lastEditeDate.hashCode());
		result = prime
				* result
				+ ((lastEditorDisplayName == null) ? 0 : lastEditorDisplayName
						.hashCode());
		result = prime * result + lastEditorUserId;
		result = prime * result + ownerUserId;
		result = prime * result + score;
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + viewCount;
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
		Row other = (Row) obj;
		if (answerCount != other.answerCount)
			return false;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (favoriteCount != other.favoriteCount)
			return false;
		if (id != other.id)
			return false;
		if (lastActivityDate == null) {
			if (other.lastActivityDate != null)
				return false;
		} else if (!lastActivityDate.equals(other.lastActivityDate))
			return false;
		if (lastEditeDate == null) {
			if (other.lastEditeDate != null)
				return false;
		} else if (!lastEditeDate.equals(other.lastEditeDate))
			return false;
		if (lastEditorDisplayName == null) {
			if (other.lastEditorDisplayName != null)
				return false;
		} else if (!lastEditorDisplayName.equals(other.lastEditorDisplayName))
			return false;
		if (lastEditorUserId != other.lastEditorUserId)
			return false;
		if (ownerUserId != other.ownerUserId)
			return false;
		if (score != other.score)
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (viewCount != other.viewCount)
			return false;
		return true;
	}
	
	
}
