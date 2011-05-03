/*
 * Copyright 2011 SpringSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package grails.test.mixin;

import org.codehaus.groovy.transform.GroovyASTTransformationClass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to indicate the class under test. Triggers the @TestMixin AST transform for the given artefact type
 *
 * @author Graeme Rocher
 * @since 1.4
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@GroovyASTTransformationClass("org.codehaus.groovy.grails.compiler.injection.test.TestForTransformation")
public @interface TestFor {
    Class value();
}