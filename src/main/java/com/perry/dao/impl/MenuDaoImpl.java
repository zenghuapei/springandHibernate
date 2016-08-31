package com.perry.dao.impl;

import com.perry.basedao.impl.BaseDao;
import com.perry.dao.MenuDao;
import com.perry.entity.Menu;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zenghuapei on 2016/8/29.
 */
@Repository("menuDao")
@Transactional
public class MenuDaoImpl extends BaseDao<Menu,Long> implements MenuDao {


    /**
     * 查询所有菜单
     *
     * @return
     */
    public List<Menu> getAllMenuList() {
        List<Menu> menuList = getListByHQL("from Menu");
        return menuList;
    }

    /**
     * @param menu
     * @return 返回值
     * @throws Exception
     * @nanme 添加
     */
    @Override
    public void addMenu(Menu menu) {
         save(menu);
    }
}
