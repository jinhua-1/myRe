/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts
 * @className com.thunisoft.ArteryFirts.ArteryFirtsApplication
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


/**
 *
 * ArteryFirtsApplication
 *
 * @description ArteryFirtsApplication
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@EnableCaching
@SpringBootApplication
@MapperScan({"com.thunisoft.ArteryFirts"})
public class ArteryFirtsApplication {

	/**
     * ArteryFirtsApplication
     *
     * @description 主类
     * @param args 启动参数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     **/
    public static void main(String[] args) {
        //这是master的修改，本地看看冲不冲突，local
    	SpringApplication.run(ArteryFirtsApplication.class, args);
    }
}
