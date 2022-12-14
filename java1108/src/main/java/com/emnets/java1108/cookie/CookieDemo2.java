package com.emnets.java1108.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie快速入门
 */


@WebServlet("/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //  3.获取cookie
        Cookie[] cookies = request.getCookies();

        //  获取数据，就是遍历
        if(cookies!=null){
            for(Cookie c:cookies){
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name+" : "+value);

            }
        }


    }
}
