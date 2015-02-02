package com.kaisen.finearts.dao;

import com.kaisen.finearts.domain.QuestionInfoDO;
import com.kaisen.finearts.query.QuestionInfoQuery;
import com.sun.tools.javac.util.List;

public interface QuestionInfoDAO {
	Integer insert(QuestionInfoDO questionInfoDO);

	Integer update(QuestionInfoDO questionInfoDO);

	List<QuestionInfoDO> query(QuestionInfoQuery questionInfoQuery);

	Integer delete(QuestionInfoDO questionInfoDO);
}
