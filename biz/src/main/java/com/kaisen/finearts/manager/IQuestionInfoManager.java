package com.kaisen.finearts.manager;

import java.util.List;

import com.kaisen.finearts.domain.QuestionInfoDO;
import com.kaisen.finearts.query.QuestionInfoQuery;

public interface IQuestionInfoManager {
	void insert(QuestionInfoDO questionInfoDO);

	void update(QuestionInfoDO questionInfoDO);

	List<QuestionInfoDO> query(QuestionInfoQuery questionInfoQuery);

	void delete(QuestionInfoDO questionInfoDO);
}
