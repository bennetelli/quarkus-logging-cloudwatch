/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.quarkiverse.logging.cloudwatch;

import com.amazonaws.auth.AWSCredentials;

/**
 * @author hrupp
 */
public class CWCredentials implements AWSCredentials {

    private CWConfig config;

    public CWCredentials(CWConfig config) {
        this.config = config;
    }

    @Override
    public String getAWSAccessKeyId() {
        return config.accessKeyId;
    }

    @Override
    public String getAWSSecretKey() {
        return config.accessKeySecret;
    }
}
