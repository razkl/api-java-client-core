package com.taboola.rest.api.internal.config;


import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.taboola.rest.api.exceptions.factories.ExceptionFactory;
import com.taboola.rest.api.internal.StringResponseFactories;
import com.taboola.rest.api.model.RequestHeader;

/**
 * Created by vladi
 * Date: 1/16/2018
 * Time: 9:40 PM
 * By Taboola
 */
public class CommunicationConfig {

    private final String baseUrl;
    private final long connectionTimeoutMillis;
    private final long readTimeoutMillis;
    private final long writeTimeoutMillis;
    private final int maxIdleConnections;
    private final long keepAliveDurationMillis;
    private final boolean debug;
    private final Collection<RequestHeader> headers;
    private final ExceptionFactory exceptionFactory;
    private final ObjectMapper objectMapper;
    private final StringResponseFactories stringResponseFactories;

    public CommunicationConfig(String baseUrl, Long connectionTimeoutMillis, Long readTimeoutMillis,
                               Long writeTimeoutMillis, Integer maxIdleConnections, Long keepAliveDurationMillis,
                               Collection<RequestHeader> headers, boolean debug, ExceptionFactory exceptionFactory,
                               ObjectMapper objectMapper, StringResponseFactories stringResponseFactories) {
        this.baseUrl = baseUrl;
        this.connectionTimeoutMillis = connectionTimeoutMillis;
        this.readTimeoutMillis = readTimeoutMillis;
        this.writeTimeoutMillis = writeTimeoutMillis;
        this.maxIdleConnections = maxIdleConnections;
        this.keepAliveDurationMillis = keepAliveDurationMillis;
        this.headers = headers;
        this.debug = debug;
        this.exceptionFactory = exceptionFactory;
        this.objectMapper = objectMapper;
        this.stringResponseFactories = stringResponseFactories;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public long getConnectionTimeoutMillis() {
        return connectionTimeoutMillis;
    }

    public long getReadTimeoutMillis() {
        return readTimeoutMillis;
    }

    public long getWriteTimeoutMillis() {
        return writeTimeoutMillis;
    }

    public int getMaxIdleConnections() {
        return maxIdleConnections;
    }

    public long getKeepAliveDurationMillis() {
        return keepAliveDurationMillis;
    }

    public Collection<RequestHeader> getHeaders() {
        return headers;
    }

    public boolean isDebug() {
        return debug;
    }

    public ExceptionFactory getExceptionFactory() {
        return exceptionFactory;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public StringResponseFactories getStringResponseFactories() {
        return stringResponseFactories;
    }

    @Override
    public String toString() {
        return "CommunicationConfig{" +
                "baseUrl='" + baseUrl + '\'' +
                ", connectionTimeoutMillis=" + connectionTimeoutMillis +
                ", readTimeoutMillis=" + readTimeoutMillis +
                ", writeTimeoutMillis=" + writeTimeoutMillis +
                ", maxIdleConnections=" + maxIdleConnections +
                ", keepAliveDurationMillis=" + keepAliveDurationMillis +
                ", debug=" + debug +
                ", headers=" + headers +
                ", exceptionFactory=" + exceptionFactory +
                ", objectMapper=" + objectMapper +
                ", stringResponseFactories=" + stringResponseFactories +
                '}';
    }
}
