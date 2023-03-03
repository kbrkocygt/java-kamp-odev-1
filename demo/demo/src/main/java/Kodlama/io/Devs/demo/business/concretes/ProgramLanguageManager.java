package Kodlama.io.Devs.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.demo.business.abstracts.ProgramLanguageService;
import Kodlama.io.Devs.demo.dataAccess.abstracts.ProgramLanguageRepository;
import Kodlama.io.Devs.demo.entities.ProgramsLanguages;
@Service
public class ProgramLanguageManager implements ProgramLanguageService {
    ProgramLanguageRepository  programLanguageRepo;
	@Autowired 
	public ProgramLanguageManager(ProgramLanguageRepository programLanguageRepo) {
		
		this.programLanguageRepo = programLanguageRepo;
	}
	@Override
	public List<ProgramsLanguages> getAll() {
		return programLanguageRepo.getAll();
	}
	@Override
	public void add(ProgramsLanguages language) throws Exception {
		if(programLanguageRepo.getAll().contains(language))
			throw new Exception("Programlama isimleri tekrar edemez.");
		else 
		programLanguageRepo.add(language);
	}
	@Override
	public void update(ProgramsLanguages language, ProgramsLanguages newProgramLang) throws Exception {
		if(programLanguageRepo.getAll().contains(newProgramLang))
			throw new Exception("Programlama isimleri tekrar edemez.");
		else 
		programLanguageRepo.add(language);
	}
	@Override
	public void deleteById(ProgramsLanguages language) {
	programLanguageRepo.deleteById(language);
		
	}
	@Override
	public ProgramsLanguages getAllById(int id) {
		return programLanguageRepo.getAllById(id);
	}

	

}
