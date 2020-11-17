package in.psg.service;

import in.psg.model.Speaker;
import in.psg.repository.HibernateSpeakerRepositoryImpl;
import in.psg.repository.SpeakerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }


}
