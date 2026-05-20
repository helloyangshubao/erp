package cn.net.payc.framework.websocket.core.sender.local;

import cn.net.payc.framework.websocket.core.sender.AbstractWebSocketMessageSender;
import cn.net.payc.framework.websocket.core.sender.WebSocketMessageSender;
import cn.net.payc.framework.websocket.core.session.WebSocketSessionManager;

/**
 * 本地的 {@link WebSocketMessageSender} 实现类
 *
 * 注意：仅仅适合单机场景！！！
 *
 * @author 平安云厨科技集团
 */
public class LocalWebSocketMessageSender extends AbstractWebSocketMessageSender {

    public LocalWebSocketMessageSender(WebSocketSessionManager sessionManager) {
        super(sessionManager);
    }

}
