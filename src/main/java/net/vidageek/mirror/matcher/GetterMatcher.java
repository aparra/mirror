package net.vidageek.mirror.matcher;

import java.lang.reflect.Method;

import net.vidageek.mirror.list.dsl.Matcher;

final public class GetterMatcher implements Matcher<Method> {

	public boolean accepts(final Method element) {
		return element.getName().startsWith("get") && (element.getParameterTypes().length == 0)
				&& (!element.getReturnType().equals(void.class));
	}
}
