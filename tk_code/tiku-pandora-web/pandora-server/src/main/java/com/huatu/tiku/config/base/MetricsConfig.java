package com.huatu.tiku.config.base;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.huatu.common.consts.ApolloConfigConsts;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanchao
 * @date 2017/9/22 15:26
 */
@Configuration
@EnableApolloConfig(ApolloConfigConsts.NAMESPACE_HT_METRICS)
public class MetricsConfig {

}