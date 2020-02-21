package com.chainsys.OtherClass;

public class UserChoice {
	
	@Override
	public String toString() {
		return "UserChoice [userId=" + userId + ", songSequence=" + songSequence + ", songRating=" + songRating
				+ ", button=" + button + ", songWantsToPlay=" + songWantsToPlay + ", addToFavourites=" + addToFavourites
				+ ", premiumAmount=" + premiumAmount + "]";
	}

	private int userId;
	private String songSequence;
	private int songRating;
	private String button;
	private int songWantsToPlay;
	private String addToFavourites;
	private int premiumAmount;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSongSequence() {
		return songSequence;
	}
	public void setSongSequence(String songSequence) {
		this.songSequence = songSequence;
	}
	public int getSongRating() {
		return songRating;
	}
	public void setSongRating(int songRating) {
		this.songRating = songRating;
	}
	public String getButton() {
		return button;
	}
	public void setButton(String button) {
		this.button = button;
	}
	public int getSongWantsToPlay() {
		return songWantsToPlay;
	}
	public void setSongWantsToPlay(int songWantsToPlay) {
		this.songWantsToPlay = songWantsToPlay;
	}
	public String getAddToFavourites() {
		return addToFavourites;
	}
	public void setAddToFavourites(String addToFavourites) {
		this.addToFavourites = addToFavourites;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	
}
