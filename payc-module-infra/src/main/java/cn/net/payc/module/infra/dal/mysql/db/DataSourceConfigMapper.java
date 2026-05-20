package cn.net.payc.module.infra.dal.mysql.db;

import cn.net.payc.framework.mybatis.core.mapper.BaseMapperX;
import cn.net.payc.module.infra.dal.dataobject.db.DataSourceConfigDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源配置 Mapper
 *
 * @author 平安云厨科技集团
 */
@Mapper
public interface DataSourceConfigMapper extends BaseMapperX<DataSourceConfigDO> {
}
