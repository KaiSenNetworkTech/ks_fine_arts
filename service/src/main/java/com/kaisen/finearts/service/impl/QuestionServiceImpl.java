package com.kaisen.finearts.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.kaisen.common.result.CallServiceResult;
import com.kaisen.common.result.ResultEnum;
import com.kaisen.finearts.domain.QuestionInfoDO;
import com.kaisen.finearts.manager.IQuestionInfoManager;
import com.kaisen.finearts.query.QuestionInfoQuery;
import com.kaisen.finearts.service.IQuestionService;

@Service(version = "1.0.0")
public class QuestionServiceImpl implements IQuestionService {
	private static Logger logger = LoggerFactory
			.getLogger(QuestionServiceImpl.class);

	@Resource
	private IQuestionInfoManager questionInfoManager;

	@Override
	public CallServiceResult<Void> insert(QuestionInfoDO questionInfoDO) {
		CallServiceResult<Void> result = new CallServiceResult<Void>();
		if (questionInfoDO == null) {
			result.setResultEnum(ResultEnum.PARAMS_ERROR);
			return result;
		}

		try {
			questionInfoManager.insert(questionInfoDO);
		} catch (Exception e) {
			logger.error("插入问题失败：" + questionInfoDO, e);
			result.setResultEnum(ResultEnum.DB_ERROR);
			return result;
		}

		return result;
	}

	@Override
	public CallServiceResult<Void> update(QuestionInfoDO questionInfoDO) {
		CallServiceResult<Void> result = new CallServiceResult<Void>();
		if (questionInfoDO == null) {
			result.setResultEnum(ResultEnum.PARAMS_ERROR);
			return result;
		}

		try {
			questionInfoManager.update(questionInfoDO);
		} catch (Exception e) {
			logger.error("更新问题失败：" + questionInfoDO, e);
			result.setResultEnum(ResultEnum.DB_ERROR);
			return result;
		}

		return result;
	}

	@Override
	public CallServiceResult<List<QuestionInfoDO>> query(
			QuestionInfoQuery questionInfoQuery) {
		CallServiceResult<List<QuestionInfoDO>> result = new CallServiceResult<List<QuestionInfoDO>>();
		if (questionInfoQuery == null) {
			result.setResultEnum(ResultEnum.PARAMS_ERROR);
			return result;
		}

		result.setReturnObject(questionInfoManager.query(questionInfoQuery));
		return result;
	}

	@Override
	public CallServiceResult<Void> delete(QuestionInfoDO questionInfoDO) {
		CallServiceResult<Void> result = new CallServiceResult<Void>();
		if (questionInfoDO == null || questionInfoDO.getId() == null) {
			result.setResultEnum(ResultEnum.PARAMS_ERROR);
			return result;
		}

		try {
			questionInfoManager.delete(questionInfoDO);
		} catch (Exception e) {
			logger.error("删除问题失败：" + questionInfoDO, e);
			result.setResultEnum(ResultEnum.DB_ERROR);
			return result;
		}

		return result;
	}

}
