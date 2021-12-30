/*******************************************************************************
 * Copyright 2020 CBRE.
 * All rights reserved.
 *******************************************************************************/
package com.vishal.aws;

import static org.apache.commons.io.FileUtils.ONE_MB;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "app.aws.upload")
public class AWSProperties {
	private long fileThreshold = 5 * ONE_MB;
	private long partSize = 5 * ONE_MB;
	private int theadLimit = 5;
}
