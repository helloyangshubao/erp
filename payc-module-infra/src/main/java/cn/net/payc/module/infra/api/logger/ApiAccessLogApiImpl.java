package cn.net.payc.module.infra.api.logger;

import cn.net.payc.framework.common.biz.infra.logger.ApiAccessLogCommonApi;
import cn.net.payc.framework.common.biz.infra.logger.dto.ApiAccessLogCreateReqDTO;
import cn.net.payc.module.infra.service.logger.ApiAccessLogService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * API 访问日志的 API 实现类
 *
 * @author 平安云厨科技集团
 */
@Service
@Validated
public class ApiAccessLogApiImpl implements ApiAccessLogCommonApi {

    @Resource
    private ApiAccessLogService apiAccessLogService;

    @Override
    public void createApiAccessLog(ApiAccessLogCreateReqDTO createDTO) {
        apiAccessLogService.createApiAccessLog(createDTO);
    }

}
