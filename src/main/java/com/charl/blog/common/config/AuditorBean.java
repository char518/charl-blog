package com.charl.blog.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-26 15:31
 **/
@Configuration
public class AuditorBean implements AuditorAware<Integer> {
    @Override
    public Optional<Integer> getCurrentAuditor() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        if (ctx == null) {
            return Optional.empty();
        }
        if (ctx.getAuthentication() == null) {
            return Optional.empty();
        }
        if (ctx.getAuthentication().getPrincipal() == null) {
            return Optional.empty();
        }
        Object principal = ctx.getAuthentication().getPrincipal();
        if (principal.getClass().isAssignableFrom(Integer.class)) {
            return (Optional<Integer>) principal;
        } else {
            return Optional.empty();
        }
    }
}
