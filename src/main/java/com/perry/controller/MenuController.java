package com.perry.controller;

import com.perry.entity.Menu;
import com.perry.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zenghuapei on 2016/8/29.
 */
@Controller("MenuController")
@RequestMapping("menu")
public class MenuController {
    @Resource(name = "menuService")
    private MenuService menuService;
    /**
     *
     * 查询菜单树
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/querymenuList", method= RequestMethod.GET)
    @ResponseBody
    public Object querymenuList(HttpServletRequest request) throws Exception{
        List<Menu> menuList = menuService.getAllMenuList();
        return menuList;




    }
}
