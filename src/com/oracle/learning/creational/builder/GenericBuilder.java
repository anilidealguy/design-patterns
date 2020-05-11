package com.oracle.learning.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenericBuilder<T> {
	
	private final Supplier<T> instantiatior;
	private List<Consumer<T>> instanceModifiers = new ArrayList<>();
	
	public GenericBuilder(Supplier<T> instantiator) {
		this.instantiatior = instantiator;
	}
	
	public static <T> GenericBuilder<T> of(Supplier<T> instantiatior) {
		return new GenericBuilder<T>(instantiatior);
	}
	
	public <U> GenericBuilder<T> with(BiConsumer<T, U> consumer, U value) {
		Consumer<T> c = i -> consumer.accept(i, value);
		instanceModifiers.add(c);
		return this;
	}
	
	public T build() {
		T value = instantiatior.get();
		instanceModifiers.forEach(modifier -> modifier.accept(value));
		instanceModifiers.clear();
		return value;
	}

}
