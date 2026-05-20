package cn.net.payc.module.infra.service.job;

import cn.net.payc.framework.common.pojo.PageResult;
import cn.net.payc.framework.quartz.core.service.JobLogFrameworkService;
import cn.net.payc.module.infra.controller.admin.job.vo.log.JobLogPageReqVO;
import cn.net.payc.module.infra.dal.dataobject.job.JobLogDO;

/**
 * Job 日志 Service 接口
 *
 * @author 平安云厨科技集团
 */
public interface JobLogService extends JobLogFrameworkService {

    /**
     * 获得定时任务
     *
     * @param id 编号
     * @return 定时任务
     */
    JobLogDO getJobLog(Long id);

    /**
     * 获得定时任务分页
     *
     * @param pageReqVO 分页查询
     * @return 定时任务分页
     */
    PageResult<JobLogDO> getJobLogPage(JobLogPageReqVO pageReqVO);

    /**
     * 清理 exceedDay 天前的任务日志
     *
     * @param exceedDay   超过多少天就进行清理
     * @param deleteLimit 清理的间隔条数
     */
    Integer cleanJobLog(Integer exceedDay, Integer deleteLimit);

}
