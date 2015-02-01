package com.kaisen.finearts.domain;

import java.util.Date;

public class QuestionInfoDO extends BaseDO {
	private static final long serialVersionUID = -6430521212698313660L;

	private Long questionerID;
	private String content;
	private String imgUrl;
	private String voiceUrl;
	private Long voiceTime;
	private Integer questionType;
	private Integer questionStatus;
	private Long lastAnswerID;
	private Date lastAnswerTtime;

	public Long getQuestionerID() {
		return questionerID;
	}

	public void setQuestionerID(Long questionerID) {
		this.questionerID = questionerID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getVoiceUrl() {
		return voiceUrl;
	}

	public void setVoiceUrl(String voiceUrl) {
		this.voiceUrl = voiceUrl;
	}

	public Long getVoiceTime() {
		return voiceTime;
	}

	public void setVoiceTime(Long voiceTime) {
		this.voiceTime = voiceTime;
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

	public Long getLastAnswerID() {
		return lastAnswerID;
	}

	public void setLastAnswerID(Long lastAnswerID) {
		this.lastAnswerID = lastAnswerID;
	}

	public Date getLastAnswerTtime() {
		return lastAnswerTtime;
	}

	public void setLastAnswerTtime(Date lastAnswerTtime) {
		this.lastAnswerTtime = lastAnswerTtime;
	}
}