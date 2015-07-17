package com.anhao.commons.security.shrio;

import com.anhao.service.AdminService;
import javax.annotation.Resource;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 权限认证
 */
public class AuthenticationRealm extends AuthorizingRealm {

    @Resource(name = "adminServiceImpl")
    private AdminService adminService;

    private static final transient Logger logger = LoggerFactory.getLogger(AuthenticationRealm.class);

    /**
     * 验证当前登录的Subject
     *
     * @param authcToken
     * @return
     * @see 经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) {
        logger.info("doGetAuthenticationInfo");

        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        logger.info("token {}", token.getUsername());
         logger.info("token {}", token.getPassword());
        if ("admin".equals(token.getUsername())) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("admin", "admin", this.getName());
            return authcInfo;
        } else if ("xuanyu".equals(token.getUsername())) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("xuanyu", "xuanyu", this.getName());
            return authcInfo;
        }
        return null;
    }

    /**
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String currentUsername = (String) super.getAvailablePrincipal(principals);
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        if (null != currentUsername && "admin".equals(currentUsername)) {
            simpleAuthorInfo.addRole("admin");
            simpleAuthorInfo.addStringPermission("admin:manage");
            logger.info("已为用户{}赋予了[admin]角色和[manage]权限", currentUsername);
            return simpleAuthorInfo;
        } else if (null != currentUsername && "xuanyu".equals(currentUsername)) {
            logger.info("当前用户[{}]无授权", currentUsername);
            return simpleAuthorInfo;
        }
        return null;
    }
}
