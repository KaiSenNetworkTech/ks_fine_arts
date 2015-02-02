package com.kaisen.finearts.service;

import com.kaisen.common.result.CallServiceResult;
import com.kaisen.finearts.domain.QuestionInfoDO;
import com.kaisen.finearts.query.QuestionInfoQuery;
import com.sun.tools.javac.util.List;

public interface IQuestionService {
	CallServiceResult<Void> insert(QuestionInfoDO questionInfoDO);

	CallServiceResult<Void> update(QuestionInfoDO questionInfoDO);

	CallServiceResult<List<QuestionInfoDO>> query(
			QuestionInfoQuery questionInfoQuery);

	CallServiceResult<Void> delete(QuestionInfoDO questionInfoDO);
}
