package cn.net.payc.module.system.api.logger;

import cn.net.payc.framework.common.biz.system.logger.OperateLogCommonApi;
import cn.net.payc.framework.common.pojo.PageResult;
import cn.net.payc.module.system.api.logger.dto.OperateLogPageReqDTO;
import cn.net.payc.module.system.api.logger.dto.OperateLogRespDTO;

/**
 * 操作日志 API 接口
 *
 * @author 平安云厨科技集团
 */
public interface OperateLogApi extends OperateLogCommonApi {

    /**
     * 获取指定模块的指定数据的操作日志分页
     *
     * @param pageReqDTO 请求
     * @return 操作日志分页
     */
    PageResult<OperateLogRespDTO> getOperateLogPage(OperateLogPageReqDTO pageReqDTO);

}
