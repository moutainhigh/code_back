package com.huatu.tiku.teacher.dao.question;

import com.huatu.tiku.entity.knowledge.QuestionKnowledge;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by huangqp on 2018\5\9 0009.
 */
@Repository
public interface QuestionKnowledgeMapper extends Mapper<QuestionKnowledge> {
}