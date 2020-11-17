package in.psg.service;

import in.psg.model.Speaker;
import in.psg.repository.HibernateSpeakerRepositoryImpl;
import in.psg.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
