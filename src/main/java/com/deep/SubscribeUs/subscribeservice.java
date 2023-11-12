package com.deep.SubscribeUs;

import java.util.List;

public interface subscribeservice {
	
	List<subscribe> getallsubscribers();
	
	subscribe savesubscriber(subscribe sub);
	
	
	subscribe getsubscribersById(Long id);

}
