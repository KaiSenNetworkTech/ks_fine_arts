package com.kaisen.finearts.query;

import com.kaisen.common.page.Page;
import com.kaisen.finearts.domain.QuestionInfoDO;

public class QuestionInfoQuery extends Page<QuestionInfoDO> {
	private static final long serialVersionUID = -1933673643134265629L;

	private Long id;

	private String queryType;

	private Integer questionType;

	private Integer questionStatus;

	private Long questionerID;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public Integer getQuestionType() {
		return questionType;
	}

	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}

	public Integer getQuestionStatus() {
		return questionStatus;
	}

	public void setQuestionStatus(Integer questionStatus) {
		this.questionStatus = questionStatus;
	}

	public Long getQuestionerID() {
		return questionerID;
	}

	public void setQuestionerID(Long questionerID) {
		this.questionerID = questionerID;
	}
}
