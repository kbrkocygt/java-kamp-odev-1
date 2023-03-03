package Kodlama.io.Devs.demo.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.demo.entities.ProgramsLanguages;

public interface ProgramLanguageRepository {
     List<ProgramsLanguages> getAll();
     void add(ProgramsLanguages language);
     void update(ProgramsLanguages language,ProgramsLanguages newProgramLang);
     void deleteById(ProgramsLanguages language);
     ProgramsLanguages getAllById(int id);
        
     
}
