package Kodlama.io.Devs.demo.webUi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.demo.business.abstracts.ProgramLanguageService;
import Kodlama.io.Devs.demo.entities.ProgramsLanguages;

@RestController
@RequestMapping("api/programs")
public class ProgramsLanguageController {
	ProgramLanguageService programLanguageService;
	@Autowired 

	public ProgramsLanguageController(ProgramLanguageService programLanguageService) {
		
		this.programLanguageService = programLanguageService;
	}
	@GetMapping("/getall")
	public List<ProgramsLanguages> getAll()
	{
		return programLanguageService.getAll();
	}
	@GetMapping("/getbyid/{id}")
	public ProgramsLanguages getById(int id)
	{
		return programLanguageService.getAllById(id);
	}
	 @GetMapping("/add")
	 public void add(ProgramsLanguages language) throws Exception
	 {
		programLanguageService.add(language);
		 
	 }
	 @GetMapping("/update")
	 public void update(ProgramsLanguages language,ProgramsLanguages newLanguage) throws Exception
	 {
		 programLanguageService.update(language,newLanguage);
		 
	 }
	 @DeleteMapping("/delete")
	 public void delete(ProgramsLanguages language)
	 {
	  programLanguageService.deleteById(language);
		 
	 }
	
}
