package com.charl.blog.service;

import com.charl.blog.common.vo.BasePageRespVo;
import com.charl.blog.vo.request.QueryPostsVo;
import com.charl.blog.vo.response.PostVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-26 16:06
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {

    @Autowired
    private IPostService postService;

    @Test
    public void queryListTest() {
        QueryPostsVo vo = new QueryPostsVo();
        vo.setPageNo(1);
        vo.setPageSize(10);
        BasePageRespVo<PostVo> respVo = postService.queryList(vo);
        Assert.assertNotNull(respVo);
    }

}
