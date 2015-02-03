package com.kaisen.finearts.query;

import com.kaisen.common.page.Page;
import com.kaisen.finearts.domain.AnswerInfoDO;

public class AnswerInfoQuery extends Page<AnswerInfoDO> {
	private static final long serialVersionUID = -8783679966319587763L;

	private Long id;

	private Long answerID;

	private Long questionID;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAnswerID() {
		return answerID;
	}

	public void setAnswerID(Long answerID) {
		this.answerID = answerID;
	}

	public Long getQuestionID() {
		return questionID;
	}

	public void setQuestionID(Long questionID) {
		this.questionID = questionID;
	}
}
