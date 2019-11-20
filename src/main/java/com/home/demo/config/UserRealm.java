package com.home.demo.config;


import com.home.demo.entity.user;
import com.home.demo.service.DengluService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {
@Resource
DengluService dengluService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权方法");
        Set<String> permissions = new HashSet<String>();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Subject subject = SecurityUtils.getSubject();
        user user = (user) subject.getPrincipal();
        System.out.println(user);
        try{
            /*permissions.add(user.getB_url());*/
        }catch (Exception e){
            e.printStackTrace();
        }
        info.setStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username=(String)authenticationToken.getPrincipal();
        user userEntity= null;
        try{
            userEntity=dengluService.selectuser(username);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (userEntity==null){
            return  null;
        }
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(userEntity,userEntity.getU_password(),"");
        return info;
    }
}
