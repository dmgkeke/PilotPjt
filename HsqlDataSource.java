package com.sds.anyframe.mobile.amplt.db.hsql;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.sds.anyframe.mobile.amplt.config.ServerConfig;

@Component("hsqlDataSource")
public class HsqlDataSource implements DataSource {
	
	private static final String URL = ServerConfig.DATABASE_URL;
	
	private PrintWriter logWriter;
	private int loginTimeout;

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return logWriter;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		this.logWriter = out;
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		this.loginTimeout = seconds;
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return loginTimeout;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL);
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return DriverManager.getConnection(URL, username, password);
	}
	
}
