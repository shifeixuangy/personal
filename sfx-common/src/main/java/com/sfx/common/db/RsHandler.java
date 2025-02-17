package com.sfx.common.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 结果集处理类
 * @author sfx
 *
 */
public interface RsHandler<T> {
	public T handle(ResultSet rs) throws SQLException;
}
