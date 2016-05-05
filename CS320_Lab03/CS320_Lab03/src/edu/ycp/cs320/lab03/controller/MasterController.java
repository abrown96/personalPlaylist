package edu.ycp.cs320.lab03.controller;

import java.sql.SQLException;
import java.util.List;

import edu.ycp.cs320.personalPlaylist.model.Account;
import edu.ycp.cs320.personalPlaylist.model.Playlist;
import edu.ycp.cs320.personalPlaylist.persist.DatabaseProvider;
import edu.ycp.cs320.personalPlaylist.persist.IDatabase;
import edu.ycp.cs320.personalPlaylistdb.InitDatabase;

public class MasterController {
	
	public List<Playlist> getAllPlayListsbyAccount(String user, String pass){
		InitDatabase.init();
		IDatabase db = DatabaseProvider.getInstance();
		
		List<Playlist> playlists = db.findPlaylistsByAccount(user, pass);
		return playlists;
	}

	public List<Playlist> getAllPlayLists() {
		InitDatabase.init();
		IDatabase db = DatabaseProvider.getInstance();
		
		List<Playlist> playlists = db.findAllPlaylists();
		return playlists;
		
	}
	public Boolean Usercheck(String Username, String Password) {
		InitDatabase.init();
		IDatabase db = DatabaseProvider.getInstance();
		
		List<Account> accountList = db.findAllAccounts();
		
		for(Account ac : accountList){
			if(ac.getUsername().equals(Username)){
				if(ac.getPassword().equals(Password)){
					return true;
				}
			}
		}
		return false;
	}

	public void CreateAccount(String username, String password) {
		InitDatabase.init();
		IDatabase db = DatabaseProvider.getInstance();
		
		db.insertAccountIntoAccountsTable(username, password);
	}
	
	public void CreatePlaylist(String PlaylistName, String User) throws SQLException {
		InitDatabase.init();
		IDatabase db = DatabaseProvider.getInstance();
		
		db.insertPlaylistIntoPlaylistsTable(PlaylistName, getAccount_id(User));
}
	
	public int getAccount_id(String User) throws SQLException {
		InitDatabase.init();
		IDatabase db = DatabaseProvider.getInstance();
		
		int User_id = 0;
		List<Account> accountList = db.findAllAccounts();
		
		for(Account ac : accountList){
			if(ac.getUsername().equals(User)){
				User_id = ac.getAccountId();
			}
		}
		return User_id;
}
}
