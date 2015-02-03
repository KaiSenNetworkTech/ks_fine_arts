package com.kaisen.finearts.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaisen.finearts.dao.AnswerInfoDAO;
import com.kaisen.finearts.domain.AnswerInfoDO;
import com.kaisen.finearts.manager.IAnswerInfoManager;
import com.kaisen.finearts.query.AnswerInfoQuery;

@Service
public class AnswerInfoManagerImpl implements IAnswerInfoManager {
	private static final Logger logger = LoggerFactory
			.getLogger(AnswerInfoManagerImpl.class);

	@Resource
	private AnswerInfoDAO answerInfoDAO;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void insert(AnswerInfoDO answerInfoDO) {
		logger.debug("插入回答{}", answerInfoDO);
		Integer num = answerInfoDAO.insert(answerInfoDO);
		logger.debug("插入回答成功,id={}", num);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void update(AnswerInfoDO answerInfoDO) {
		logger.debug("更新回答{}", answerInfoDO);
		Integer num = answerInfoDAO.update(answerInfoDO);
		logger.debug("更新回答成功,共{}条", num);
	}

	@Override
	public List<AnswerInfoDO> query(AnswerInfoQuery answerInfoQuery) {
		return answerInfoDAO.query(answerInfoQuery);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete(AnswerInfoDO answerInfoDO) {
		logger.debug("删除回答{}", answerInfoDO);
		Integer num = answerInfoDAO.delete(answerInfoDO);
		logger.debug("删除回答成功,共{}条", num);
	}
}
