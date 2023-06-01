package com.imooc.base;//package com.imooc;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    /**
     * 根据模型编写代码：
     * 1. 定义交换机
     * 2. 定义队列
     * 3. 创建交换机
     * 4. 创建队列
     * 5. 队列和交换机的绑定
     */

    public static final String EXCHANGE_MSG = "exchange_msg";

    public static final String QUEUE_SYS_MSG = "queue_sys_msg";

    @Bean(EXCHANGE_MSG)
    public Exchange exchange() {
        return ExchangeBuilder                      // 构建交换机
                .topicExchange(EXCHANGE_MSG)        // 使用topic类型，参考：https://www.rabbitmq.com/getstarted.html
                .durable(true)                      // 设置持久化，重启mq后依然存在
                .build();
    }

    @Bean(QUEUE_SYS_MSG)
    public Queue queue() {
        return new Queue(QUEUE_SYS_MSG);
    }

    @Bean
    public Binding binding(@Qualifier(EXCHANGE_MSG) Exchange exchange,
                           @Qualifier(QUEUE_SYS_MSG) Queue queue) {

        return BindingBuilder
                .bind(queue)
                .to(exchange)
                .with("sys.msg.*")          // 定义路由规则（requestMapping）
                .noargs();

        // FIXME: * 和 # 分别代表什么意思？
    }


}
