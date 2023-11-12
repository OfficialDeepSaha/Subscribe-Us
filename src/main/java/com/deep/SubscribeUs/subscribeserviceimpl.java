package com.deep.SubscribeUs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class subscribeserviceimpl implements subscribeservice {

	@Autowired
	private subscriberepository subrepo;
	
	
	@Override
	public subscribe savesubscriber(subscribe sub) {
		
		return subrepo.save(sub);
	}


	@Override
	public List<subscribe> getallsubscribers() {
		
		return subrepo.findAll();
	}


	@Override
	public subscribe getsubscribersById(Long id) {
		
		return subrepo.findById(id).get();
	}
	
	

}
