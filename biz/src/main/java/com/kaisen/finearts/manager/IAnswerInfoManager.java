package com.kaisen.finearts.manager;

import java.util.List;

import com.kaisen.finearts.domain.AnswerInfoDO;
import com.kaisen.finearts.query.AnswerInfoQuery;

public interface IAnswerInfoManager {
	void insert(AnswerInfoDO answerInfoDO);

	void update(AnswerInfoDO answerInfoDO);

	List<AnswerInfoDO> query(AnswerInfoQuery answerInfoQuery);

	void delete(AnswerInfoDO answerInfoDO);
}
