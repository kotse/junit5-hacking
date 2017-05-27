package extensions;

/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Parameter;

import static org.mockito.Mockito.mock;

/**
 * {@code MockitoExtension} showcases the {@link TestInstancePostProcessor}
 * and {@link ParameterResolver} extension APIs of JUnit 5 by providing
 * dependency injection support at the field level and at the method parameter
 * level via Mockito 2.x's {@link Mock @Mock} annotation.
 *
 * @since 5.0
 */
public class MockitoExtension implements TestInstancePostProcessor {

	@Override
	public void postProcessTestInstance(
			Object testInstance,
			ExtensionContext context) {

		MockitoAnnotations.initMocks(testInstance);
	}
}
