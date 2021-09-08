package com.src;

import java.sql.Connection;
import java.util.List;

public interface Bookinterface {
	public static final String jdbcurl = "jdbc:mysql://localhost:3306/curd";
	public static final String driverclass = "com.mysql.cj.jdbc.Driver";
	public static final String username = "root";
	public static final String password = "arasakumaran@4899";

	Connection getConnection();

	void insertBooks(Book b);

	public Book selectBook(int id);

	List< Book> SelectAllBook();

	boolean deleteBook(int id);

	boolean updateBook(Book b);
}
