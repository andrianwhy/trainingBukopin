package com.app.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.Idcard;
import com.app.services.IdcardService;

@RestController
@RequestMapping(value="api/v1/")
public class IdcardRestCont {
	
	@Autowired
	private IdcardService is;
	
	@GetMapping(value="listidcard")
	public List<Idcard>listIdcards(){
		return is.listIdcards();
	}

}
