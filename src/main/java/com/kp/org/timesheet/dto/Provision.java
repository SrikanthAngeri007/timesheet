package com.kp.org.timesheet.dto;

public interface Provision<T> {
	T createEntity();
	T updateEntity(T entity);
}
