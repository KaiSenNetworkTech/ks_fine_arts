package com.kaisen.finearts.dao;

import com.kaisen.finearts.domain.AnswerInfoDO;
import com.kaisen.finearts.query.AnswerInfoQuery;
import com.sun.tools.javac.util.List;

public interface AnswerInfoDAO {
	Integer insert(AnswerInfoDO answerInfoDO);

	Integer update(AnswerInfoDO answerInfoDO);

	List<AnswerInfoDO> query(AnswerInfoQuery answerInfoQuery);

	Integer delete(AnswerInfoDO answerInfoDO);
}
