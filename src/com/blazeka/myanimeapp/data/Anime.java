package com.blazeka.myanimeapp.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Animes")
public class Anime extends Model
{
	@Column(name = "AnimeDatabaseId")
	private long seriesAnimeDatabaseId;
	@Column(name = "SeriesTitle")
	private String seriesTitle;
	@Column(name = "Synonyms")
	private String[] seriesSynonyms;
	@Column(name = "Type")
	private int seriesType;
	@Column(name = "NumberOfEpisodes")
	private int seriesEpisodes;
	@Column(name = "SeriesStatus")
	private int seriesStatus;
	@Column(name = "SeriesStart")
	private String seriesStart;
	@Column(name = "SeriesEnd")
	private String seriesEnd;
	@Column(name = "ImageURI")
	private String seriesImage;
	@Column(name = "MyId")
	private long myId;
	@Column(name = "WatchedEpisodes")
	private int myWatchedEpisodes;
	@Column(name = "StartedWatching")
	private String myStartDate;
	@Column(name = "FinishedWatching")
	private String myEndDate;
	@Column(name = "UserScore")
	private int myScore;
	@Column(name = "UserStatus")
	private int myStatus;
	@Column(name = "RewatchingValue")
	private int myRewatchingValue;
	@Column(name = "RewatchingEpisode")
	private int myRewatchingEpisode;
	@Column(name = "LastUpdated")
	private long myLastUpdated;
	@Column(name = "UserTags")
	private String[] myTags;
	
	public Anime(long seriesAnimeDatabaseId, String seriesTitle,
			String[] seriesSynonyms, int seriesType, int seriesEpisodes,
			int seriesStatus, String seriesStart, String seriesEnd,
			String seriesImage, long myId, int myWatchedEpisodes,
			String myStartDate, String myEndDate, int myScore, int myStatus,
			int myRewatchingValue, int myRewatchingEpisode, long myLastUpdated,
			String[] myTags) {
		super();
		this.seriesAnimeDatabaseId = seriesAnimeDatabaseId;
		this.seriesTitle = seriesTitle;
		this.seriesSynonyms = seriesSynonyms;
		this.seriesType = seriesType;
		this.seriesEpisodes = seriesEpisodes;
		this.seriesStatus = seriesStatus;
		this.seriesStart = seriesStart;
		this.seriesEnd = seriesEnd;
		this.seriesImage = seriesImage;
		this.myId = myId;
		this.myWatchedEpisodes = myWatchedEpisodes;
		this.myStartDate = myStartDate;
		this.myEndDate = myEndDate;
		this.myScore = myScore;
		this.myStatus = myStatus;
		this.myRewatchingValue = myRewatchingValue;
		this.myRewatchingEpisode = myRewatchingEpisode;
		this.myLastUpdated = myLastUpdated;
		this.myTags = myTags;
	}

	public Anime() {
		super();
	}

	public long getSeriesAnimeDatabaseId() {
		return seriesAnimeDatabaseId;
	}

	public void setSeriesAnimeDatabaseId(long seriesAnimeDatabaseId) {
		this.seriesAnimeDatabaseId = seriesAnimeDatabaseId;
	}

	public String getSeriesTitle() {
		return seriesTitle;
	}

	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}

	public String[] getSeriesSynonyms() {
		return seriesSynonyms;
	}

	public void setSeriesSynonyms(String[] seriesSynonyms) {
		this.seriesSynonyms = seriesSynonyms;
	}

	public int getSeriesType() {
		return seriesType;
	}

	public void setSeriesType(int seriesType) {
		this.seriesType = seriesType;
	}

	public int getSeriesEpisodes() {
		return seriesEpisodes;
	}

	public void setSeriesEpisodes(int seriesEpisodes) {
		this.seriesEpisodes = seriesEpisodes;
	}

	public int getSeriesStatus() {
		return seriesStatus;
	}

	public void setSeriesStatus(int seriesStatus) {
		this.seriesStatus = seriesStatus;
	}

	public String getSeriesStart() {
		return seriesStart;
	}

	public void setSeriesStart(String seriesStart) {
		this.seriesStart = seriesStart;
	}

	public String getSeriesEnd() {
		return seriesEnd;
	}

	public void setSeriesEnd(String seriesEnd) {
		this.seriesEnd = seriesEnd;
	}

	public String getSeriesImage() {
		return seriesImage;
	}

	public void setSeriesImage(String seriesImage) {
		this.seriesImage = seriesImage;
	}

	public long getMyId() {
		return myId;
	}

	public void setMyId(long myId) {
		this.myId = myId;
	}

	public int getMyWatchedEpisodes() {
		return myWatchedEpisodes;
	}

	public void setMyWatchedEpisodes(int myWatchedEpisodes) {
		this.myWatchedEpisodes = myWatchedEpisodes;
	}

	public String getMyStartDate() {
		return myStartDate;
	}

	public void setMyStartDate(String myStartDate) {
		this.myStartDate = myStartDate;
	}

	public String getMyEndDate() {
		return myEndDate;
	}

	public void setMyEndDate(String myEndDate) {
		this.myEndDate = myEndDate;
	}

	public int getMyScore() {
		return myScore;
	}

	public void setMyScore(int myScore) {
		this.myScore = myScore;
	}

	public int getMyStatus() {
		return myStatus;
	}

	public void setMyStatus(int myStatus) {
		this.myStatus = myStatus;
	}

	public int getMyRewatchingValue() {
		return myRewatchingValue;
	}

	public void setMyRewatchingValue(int myRewatchingValue) {
		this.myRewatchingValue = myRewatchingValue;
	}

	public int getMyRewatchingEpisode() {
		return myRewatchingEpisode;
	}

	public void setMyRewatchingEpisode(int myRewatchingEpisode) {
		this.myRewatchingEpisode = myRewatchingEpisode;
	}

	public long getMyLastUpdated() {
		return myLastUpdated;
	}

	public void setMyLastUpdated(long myLastUpdated) {
		this.myLastUpdated = myLastUpdated;
	}

	public String[] getMyTags() {
		return myTags;
	}

	public void setMyTags(String[] myTags) {
		this.myTags = myTags;
	}
}
