package cn.net.payc.module.system.api.dict;

import cn.net.payc.framework.common.util.object.BeanUtils;
import cn.net.payc.framework.common.biz.system.dict.dto.DictDataRespDTO;
import cn.net.payc.module.system.dal.dataobject.dict.DictDataDO;
import cn.net.payc.module.system.service.dict.DictDataService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * 字典数据 API 实现类
 *
 * @author 平安云厨科技集团
 */
@Service
public class DictDataApiImpl implements DictDataApi {

    @Resource
    private DictDataService dictDataService;

    @Override
    public void validateDictDataList(String dictType, Collection<String> values) {
        dictDataService.validateDictDataList(dictType, values);
    }

    @Override
    public List<DictDataRespDTO> getDictDataList(String dictType) {
        List<DictDataDO> list = dictDataService.getDictDataListByDictType(dictType);
        return BeanUtils.toBean(list, DictDataRespDTO.class);
    }

}
