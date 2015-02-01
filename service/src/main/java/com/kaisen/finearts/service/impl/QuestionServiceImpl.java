package com.kaisen.finearts.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.kaisen.finearts.service.IQuestionService;

@Service(version = "1.0.0")
public class QuestionServiceImpl implements IQuestionService {
	private static Logger logger = LoggerFactory
			.getLogger(QuestionServiceImpl.class);
}
