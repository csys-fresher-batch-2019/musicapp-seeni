package com.chainsys.OtherClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SongLink {
	public List<String> songLink() throws SQLException, ClassNotFoundException{
		String sql="select song_link from song_list";
		try(Connection con=Connection1.connection();
				PreparedStatement pst=con.prepareStatement(sql);){
			ResultSet rs=pst.executeQuery();
			List<String> li=new ArrayList<>();
			while(rs.next()) {
				li.add(rs.getString("song_link"));
			}System.out.println(li);
			return li;
		}
	}public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SongLink s=new SongLink();
		s.songLink();
	}
}
