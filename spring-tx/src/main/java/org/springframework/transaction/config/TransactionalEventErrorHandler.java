package org.springframework.transaction.config;

import org.jspecify.annotations.Nullable;
import org.springframework.context.ApplicationEvent;
import org.springframework.transaction.event.TransactionalApplicationListener;

public abstract class TransactionalEventErrorHandler implements TransactionalApplicationListener.SynchronizationCallback {

	public abstract void handle(ApplicationEvent event, @Nullable Throwable ex);

	@Override
	public void postProcessEvent(ApplicationEvent event, @Nullable Throwable ex) {
		handle(event, ex);
	}

}