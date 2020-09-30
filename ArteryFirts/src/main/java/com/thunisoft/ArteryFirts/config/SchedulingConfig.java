/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.config
 * @className com.thunisoft.ArteryFirts.config.SwaggerConfiguration
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 *
 * SchedulingConfig
 *
 * @description SchedulingConfig
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@EnableScheduling
@Configuration
public class SchedulingConfig implements SchedulingConfigurer {

	/** 线程池大小 **/
	private static final int THREAD_POOL_SIZE = 4;

	/** 线程池关闭 等待任务完成的最大等待时间 秒为单位**/
    private static final int AWAIT_TERMINATE_TIME  = 600;

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(taskScheduler());
	}

	/**
     * SchedulingConfig
     *
     * @description 创建线程池
     * @return Executor
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version v1.0.0
     **/
    @Bean(destroyMethod="shutdown", name = "taskScheduler")
    public ThreadPoolTaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(THREAD_POOL_SIZE);
        scheduler.setThreadNamePrefix("task-");
        scheduler.setAwaitTerminationSeconds(AWAIT_TERMINATE_TIME);
        scheduler.setWaitForTasksToCompleteOnShutdown(true);
        return scheduler;
    }

}
