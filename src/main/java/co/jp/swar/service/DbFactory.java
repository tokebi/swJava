package co.jp.swar.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbFactory {
	private static Connection con = null;
	private static String dbpath = "D:\\app\\sqlite-tools-win32-x86-3150200\\swar.db";

	public static Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("org.sqlite.JDBC");
				con = DriverManager.getConnection("jdbc:sqlite:" + dbpath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
