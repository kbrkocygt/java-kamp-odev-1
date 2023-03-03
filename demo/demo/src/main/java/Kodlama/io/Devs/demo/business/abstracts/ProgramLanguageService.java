package Kodlama.io.Devs.demo.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.demo.entities.ProgramsLanguages;

public interface ProgramLanguageService {
	 List<ProgramsLanguages> getAll();
	 void add(ProgramsLanguages language) throws Exception ;
     void update(ProgramsLanguages language,ProgramsLanguages newProgramLang) throws Exception; 
     void deleteById(ProgramsLanguages language);
     ProgramsLanguages getAllById(int id);
     
}
