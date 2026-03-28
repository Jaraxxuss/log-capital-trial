package com.log.capital.trial_server;

public record Message(
    String recipient,
    String content
) {}