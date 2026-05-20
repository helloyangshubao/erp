package cn.net.payc.module.infra.websocket.message;

import lombok.Data;

/**
 * 示例：client -> server 发送消息
 *
 * @author 平安云厨科技集团
 */
@Data
public class DemoSendMessage {

    /**
     * 发送给谁
     *
     * 如果为空，说明发送给所有人
     */
    private Long toUserId;
    /**
     * 内容
     */
    private String text;

}
