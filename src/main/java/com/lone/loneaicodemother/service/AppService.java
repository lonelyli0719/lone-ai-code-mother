package com.lone.loneaicodemother.service;

import com.lone.loneaicodemother.model.dto.app.AppQueryRequest;
import com.lone.loneaicodemother.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.lone.loneaicodemother.model.entity.App;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author Lone
 */
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    List<AppVO> getAppVOList(List<App> appList);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);
}
