package com.chainsys.SongList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.OtherClass.Connection1;
import com.chainsys.OtherClass.Logger;

public class SongBetweenDatesTab2DAOImpl implements SongBetweenDatesTab2DAO{
	
public List<String> selectSongs(int releaseYearLd,int upto)  throws ClassNotFoundException, SQLException{
	String sql="select song_name from song_list where song_number in (select song_number from year where release_year between ? and ?)";	
	try(Connection con=Connection1.connection();
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();){
	Logger.info(sql);
		pst.setInt(1, releaseYearLd);
		pst.setInt(2, upto);
		ArrayList<String> li=new ArrayList<String>();
		while(rs.next()) {
			li.add(rs.getString("song_name"));
		}
		for (String string : li) {
			Logger.info(string);
		}if(releaseYearLd>upto) {
			Logger.info("Invalid year");
		}
		return li;
	}
	}


}
