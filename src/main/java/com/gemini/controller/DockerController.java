package com.gemini.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * docker部署测试
 *
 * @author xiaocuizi
 * @link vist <a href=" https://blog.csdn.net/wangqiang9x/article/details/84974805?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task"/>
 *
 * @link 修改容器时间 <a href="http://www.louisvv.com/archives/1716.html"/>
 * @since 0.0.1 2020/3/28 12:59
 */
@RestController
public class DockerController {
    Logger log = LoggerFactory.getLogger(DockerController.class);

    @RequestMapping("/")
    public String index() {
        log.info("-------------------------------------------------");
        log.info("----Hello Docker!-------{}-----------",System.currentTimeMillis());
        log.info("-------------------------------------------------");
        return "Hello Docker! " + System.currentTimeMillis();
    }
}