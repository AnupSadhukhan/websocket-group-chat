package com.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessage
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

}
