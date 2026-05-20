package cn.net.payc.module.infra.api.logger;

import cn.net.payc.framework.common.biz.infra.logger.ApiErrorLogCommonApi;
import cn.net.payc.framework.common.biz.infra.logger.dto.ApiErrorLogCreateReqDTO;
import cn.net.payc.module.infra.service.logger.ApiErrorLogService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import jakarta.annotation.Resource;

/**
 * API 访问日志的 API 接口
 *
 * @author 平安云厨科技集团
 */
@Service
@Validated
public class ApiErrorLogApiImpl implements ApiErrorLogCommonApi {

    @Resource
    private ApiErrorLogService apiErrorLogService;

    @Override
    public void createApiErrorLog(ApiErrorLogCreateReqDTO createDTO) {
        apiErrorLogService.createApiErrorLog(createDTO);
    }

}
