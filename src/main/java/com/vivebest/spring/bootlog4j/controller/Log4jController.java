/*@(#)Log4jController.java   2017年12月14日 
 * Copy Right 2017 Vivebest Co.Ltd.
 * All Copyright Reserved
 */

package com.vivebest.spring.bootlog4j.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO Document Log4jController
 * <p>
 * 
 * @version 1.0.0,2017年12月14日
 * @author zwenzheng
 * @since 1.0.0
 */
@RestController
@RequestMapping("log4j")
public class Log4jController {
	
	//slf4j接口  由log4j实现日志功能
    private static final Logger logger = LoggerFactory.getLogger(Log4jController.class);
    
    @RequestMapping("/printLog")
    public String log() {
        logger.info("spring-boot-log4j!");
        
        return "Hello Log4j!";
    }
}
