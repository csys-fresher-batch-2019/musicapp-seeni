package com.chainsys.SongList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.OtherClass.Connection1;
import com.chainsys.OtherClass.Logger;
import com.chainsys.OtherClass.SongList;

public class SelectByLikeTab2DAOImpl implements SelectByLikeTab2DAO {

	/**
	 * Search all the song name and song link
	 */

	public List<SongList> selectByLikeKey(String str) throws ClassNotFoundException, SQLException {
		String sql = "select song_name,song_link from song_list where song_name like ?";
		List<SongList> li = null;
		try (Connection con = Connection1.connection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			char[] ch = str.toCharArray();
			System.out.println(ch[1]);

			Logger.info(sql);

			pst.setString(1, str);

			li = new ArrayList<SongList>();
			while (rs.next()) {
				SongList sl = new SongList();
				sl.setSongName(rs.getString("song_name"));
				sl.setSongLink(rs.getString("song_link"));
				li.add(sl);
			}
			System.out.println(li);
		}
		return li;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SelectByLikeTab2DAOImpl s = new SelectByLikeTab2DAOImpl();
		s.selectByLikeKey("%alapporan%");
	}
}
