package com.kaisen.finearts.service;

import java.util.List;

import com.kaisen.common.result.CallServiceResult;
import com.kaisen.finearts.domain.AnswerInfoDO;
import com.kaisen.finearts.domain.QuestionInfoDO;
import com.kaisen.finearts.query.AnswerInfoQuery;
import com.kaisen.finearts.query.QuestionInfoQuery;

public interface IQuestionService {
	CallServiceResult<Void> askQuestion(QuestionInfoDO questionInfoDO);

	CallServiceResult<Void> updateQuestion(QuestionInfoDO questionInfoDO);

	CallServiceResult<List<QuestionInfoDO>> queryQuestion(
			QuestionInfoQuery questionInfoQuery);

	CallServiceResult<Void> deleteQuestion(QuestionInfoDO questionInfoDO);

	CallServiceResult<Void> answerQuestion(AnswerInfoDO answerInfoDO);

	CallServiceResult<Void> updateAnswer(AnswerInfoDO answerInfoDO);

	CallServiceResult<List<AnswerInfoDO>> queryAnswer(
			AnswerInfoQuery answerInfoQuery);

	CallServiceResult<Void> deleteAnswer(AnswerInfoDO answerInfoDO);
}
