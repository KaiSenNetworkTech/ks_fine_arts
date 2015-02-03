package com.kaisen.finearts.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaisen.finearts.dao.QuestionInfoDAO;
import com.kaisen.finearts.domain.QuestionInfoDO;
import com.kaisen.finearts.manager.IQuestionInfoManager;
import com.kaisen.finearts.query.QuestionInfoQuery;

@Service
public class QuestionInfoManagerImpl implements IQuestionInfoManager {
	private static final Logger logger = LoggerFactory
			.getLogger(QuestionInfoManagerImpl.class);

	@Resource
	private QuestionInfoDAO questionInfoDAO;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void insert(QuestionInfoDO questionInfoDO) {
		logger.debug("插入问题{}", questionInfoDO);
		Integer num = questionInfoDAO.insert(questionInfoDO);
		logger.debug("插入问题成功,id={}", num);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void update(QuestionInfoDO questionInfoDO) {
		logger.debug("更新问题{}", questionInfoDO);
		Integer num = questionInfoDAO.update(questionInfoDO);
		logger.debug("更新问题成功,共{}条", num);
	}

	@Override
	public List<QuestionInfoDO> query(QuestionInfoQuery questionInfoQuery) {
		return questionInfoDAO.query(questionInfoQuery);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete(QuestionInfoDO questionInfoDO) {
		logger.debug("删除问题{}", questionInfoDO);
		Integer num = questionInfoDAO.delete(questionInfoDO);
		logger.debug("删除问题成功,共{}条", num);
	}
}
