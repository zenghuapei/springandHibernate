package com.perry.dao;

import com.perry.entity.Menu;

import java.util.List;

/**
 * Created by zenghuapei on 2016/8/29.
 */
public interface MenuDao {
    /**
     * 查询所有菜单
     * @return
     */
     List<Menu> getAllMenuList();
     /**
      * @nanme 添加
      * @param 参数名
      * @return 返回值
      * @throws Exception
     */
     void addMenu(Menu menu);
}
