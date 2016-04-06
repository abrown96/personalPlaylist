package edu.ycp.cs320.personalPlaylist.model;

public class Playlist 
{
	private int numberSongs;
	private String namePlaylist;
	private int playlistId;

	public Playlist()	
	{

	}
	

	/*
	//Don't think we need a setPlaylistId() (SQL handles that, still might need a method though)
	
	public void setPlaylistId(String id)
	{
		this.playlistId = id;
	}
	*/
	
	public int getPlaylistId()	// Get playlist id for determining which playlist to use
	{
		return this.playlistId;
	}

	public void setTitle(String title)	//Might never use this method, who knows how this'll work
	{
		this.namePlaylist = title;
	}

	public String getTitle()	//Definitely going to use this one; see FakeDatabase and look at findAllSongInPlaylist
	{
		return namePlaylist;
	}	

	
	
	//PROBABLY DON'T NEED THIS EITHER BUT HEY WHO CARES		
	public int getNumberSongs() 
	{
		return numberSongs;
	}
	public void setNumberSongs(int numberSongs) 
	{
		if(numberSongs >= 0)
		{
			this.numberSongs = numberSongs;
		}else{
			this.numberSongs = 0;
		}
	}


	/*
	 //PROBABLY NOT GOING TO USE THESE
	  
	  	public boolean addSong(String name)//should these be file names?
	{
		throw new UnsupportedOperationException("TODO - implement");
	}
	public boolean removeSong(String name)
	{
		throw new UnsupportedOperationException("TODO - implement");
	}
	public boolean skipSong()
	{
		throw new UnsupportedOperationException("TODO - implement");
	}
	public boolean reverseSong()
	{
		throw new UnsupportedOperationException("TODO - implement");
	}
	public boolean shuffle()
	{
		throw new UnsupportedOperationException("TODO - implement");
	}
	 */
	
	
}
