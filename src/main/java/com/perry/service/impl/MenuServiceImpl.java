package com.perry.service.impl;

import com.perry.annotation.Log;
import com.perry.dao.MenuDao;
import com.perry.entity.Menu;
import com.perry.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zenghuapei on 2016/8/29.
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource(name = "menuDao")
    private MenuDao menuDao;
    /**
     * 查询所有菜单
     *
     * @return
     */
    public List<Menu> getAllMenuList() {
        return menuDao.getAllMenuList();
    }
    /**
     * @nanme 添加
     * @param menu
     * @return 返回值
     * @throws Exception
     */
    @Log
    public void addMenu(Menu menu){
        menuDao.addMenu(menu);
    }
}
