package com.kaisen.finearts.domain;

public class AnswerInfoDO extends BaseDO {
	private static final long serialVersionUID = 828165993038954688L;

	private Long questionID;
	private String content;
	private String imgUrl;
	private String voiceUrl;
	private Long voiceTime;
	private Long answerID;

	public Long getQuestionID() {
		return questionID;
	}

	public void setQuestionID(Long questionID) {
		this.questionID = questionID;
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

	public Long getAnswerID() {
		return answerID;
	}

	public void setAnswerID(Long answerID) {
		this.answerID = answerID;
	}
}
