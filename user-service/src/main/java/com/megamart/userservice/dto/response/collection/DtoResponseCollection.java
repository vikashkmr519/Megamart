package com.megamart.userservice.dto.response.collection;

import java.util.Collection;

public class DtoResponseCollection<T> {
	
	private Collection<T> collection;

	public Collection<T> getCollection() {
		return collection;
	}

	public void setCollection(Collection<T> collection) {
		this.collection = collection;
	}

	
}
