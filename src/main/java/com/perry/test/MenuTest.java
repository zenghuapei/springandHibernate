package com.perry.test;

import com.perry.annotation.Log;
import com.perry.dao.MenuDao;
import com.perry.entity.Menu;
import com.perry.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Title:XXXX
 * @Description:
 * @author: zenghuapei
 * @date 2016/8/31
 * @update [修改人] [修改时间] [变更描述]
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:applicationContext-mvc.xml"})
public class MenuTest extends AbstractJUnit4SpringContextTests {
    @Resource(name = "menuService")
    private MenuService menuService;
    @Test
    public void  addMenu(){
        Menu menu = new Menu();
        menu.setParentId(1);
        menu.setMenuName("abcefg");
        menu.setMenuDesc(1);
        menu.setMenuUrl("sdfsdfsdf");
        menuService.addMenu(menu);
    }
}
