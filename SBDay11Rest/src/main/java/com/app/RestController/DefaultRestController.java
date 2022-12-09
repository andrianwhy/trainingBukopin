package com.app.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.PendudukModel;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@RestController
@RequestMapping(value = "api/")
@OpenAPIDefinition(info = @Info(title = "Belajar Rest API", version = "1.0", description = "Buat Belajar Rest"))
public class DefaultRestController {

	@GetMapping(value = "nama1")
	public String nama1() {
		String nama = "andrian";
		return nama;
	}
	
	@GetMapping(value = "nilai1")
	public int nilai1() {
		int nilai = 100;
		return nilai;
	}
	
	@GetMapping(value = "nilai2")
	public Map<String, Integer> nilai2() {
		
		//collection
		Map<String, Integer>data = new LinkedHashMap<>();
		
		//isi collection
		data.put("Hasil", 100);
		
		return data;
	}
	
	
	//set htto status
	@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
//	@ResponseStatus(code = HttpStatus.OK, reason = "tested")
	@GetMapping(value = "nilai3")
	public Map<String, Integer> nilai3denganstatus() {
		
		//collection
		Map<String, Integer>data = new LinkedHashMap<>();
		
		//isi collection
		data.put("Hasil", 100);
		
		return data;
	}
	
	//set http status
	@GetMapping(value = "nilai4")
	public ResponseEntity<Object> nilai4responsEntity() {
			
		//collection
		Map<String, Integer>data = new LinkedHashMap<>();
		
		//isi collection
		data.put("Hasil", 100);
		
//		return new ResponseEntity<>(data, HttpStatus.IM_USED);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);

	}
	
	@PostMapping(value = "senddata1")
	public void getData(@RequestParam(value = "nama")String nm,
			@RequestParam(value = "nilai")int ni) {
		System.out.println(nm);
		System.out.println(ni);
	}
	
	@PostMapping(value = "senddata2/{kelas}")
	public void getData2(@PathVariable(name = "kelas")String kl) {
		System.out.println(kl);		
	}
	
	@PostMapping(value="senddata3")
	public ResponseEntity<Object>getData3(@RequestBody Map<String , Object> data) {
		System.out.println(data.get("nama"));
		System.out.println(data.get("alamat"));
		System.out.println(data.get("umur"));
		String nama=(String) data.get("nama");
			if(nama.equalsIgnoreCase("")) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ada yang kosong");
			}else {
				return ResponseEntity.status(HttpStatus.OK).body("Success");
			}
		
	}
	
	@PostMapping(value = "senddata4")
	public ResponseEntity<Object> getData4(@Valid @RequestBody PendudukModel pm, BindingResult br) {
//		System.out.println(br.get);	
		String errors = "";
		System.out.println(pm.getNama());
		System.out.println(pm.getAlamat());
		System.out.println(pm.getUmur());
		System.out.println(pm.getEmail());		
		
		if (br.hasErrors()) {
			List<FieldError> errors1= br.getFieldErrors();
			List<String> hasilError = new ArrayList<>();
			
			for(FieldError fieldError : errors1) {
				hasilError.add(fieldError.getDefaultMessage());
			}
			
//			errors = br.getFieldError().getDefaultMessage();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("sebab : "+hasilError);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body("Success ");
		}
	}
	
	@PostMapping(value ="ceknilai")
	public ResponseEntity<Object> ceknilai(@RequestBody Map<String, Integer> data){
		int nilai = data.get("nilai");
		
		Map<String, String> hasil = new LinkedHashMap<>();
		
		if (nilai > 60) {
			hasil.put("Hasil", "Anda Lulus");
			return new ResponseEntity<>(hasil, HttpStatus.ACCEPTED);
		} else {
			hasil.put("Hasil", "Silakan Mengulang !!!");
			return new ResponseEntity<>(hasil, HttpStatus.NOT_ACCEPTABLE);
		}					
	}
	
}
