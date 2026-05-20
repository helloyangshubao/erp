package cn.net.payc.module.infra.dal.mysql.job;

import cn.net.payc.framework.common.pojo.PageResult;
import cn.net.payc.framework.mybatis.core.mapper.BaseMapperX;
import cn.net.payc.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.net.payc.module.infra.controller.admin.job.vo.job.JobPageReqVO;
import cn.net.payc.module.infra.dal.dataobject.job.JobDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务 Mapper
 *
 * @author 平安云厨科技集团
 */
@Mapper
public interface JobMapper extends BaseMapperX<JobDO> {

    default JobDO selectByHandlerName(String handlerName) {
        return selectOne(JobDO::getHandlerName, handlerName);
    }

    default PageResult<JobDO> selectPage(JobPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<JobDO>()
                .likeIfPresent(JobDO::getName, reqVO.getName())
                .eqIfPresent(JobDO::getStatus, reqVO.getStatus())
                .likeIfPresent(JobDO::getHandlerName, reqVO.getHandlerName())
                .orderByDesc(JobDO::getId));
    }

}
