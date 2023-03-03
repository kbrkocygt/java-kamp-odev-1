package Kodlama.io.Devs.demo.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.demo.dataAccess.abstracts.ProgramLanguageRepository;
import Kodlama.io.Devs.demo.entities.ProgramsLanguages;
@Repository
public class InmemoryProgramsLanguageRepository implements ProgramLanguageRepository{
	List<ProgramsLanguages> programLanguages;

	public InmemoryProgramsLanguageRepository() {
		programLanguages=new ArrayList<ProgramsLanguages>();
		programLanguages.add(new ProgramsLanguages(1, "C#"));
		programLanguages.add(new ProgramsLanguages(2, "Java"));
		programLanguages.add(new ProgramsLanguages(3, "Python"));
		programLanguages.add(new ProgramsLanguages(4, "JavaScript"));
	}

	@Override
	public List<ProgramsLanguages> getAll() {
	return programLanguages;
	}
	@Override
	public void add(ProgramsLanguages language) {
		programLanguages.add(language);
		
	}

	@Override
	public void deleteById(ProgramsLanguages language) {
		programLanguages.remove(language);
		
	}

	@Override
	public ProgramsLanguages getAllById(int id) {
		return programLanguages.get(id);
	}

	@Override
	public void update(ProgramsLanguages language, ProgramsLanguages newProgramLang) {
		programLanguages.set(programLanguages.indexOf(language),newProgramLang);
	}


}
