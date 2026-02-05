package com.example.mqdemo.message;

public record SendMessageRequest(
        String businessKey,
        String payload
) {
}
