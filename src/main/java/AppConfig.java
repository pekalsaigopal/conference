import in.psg.model.Speaker;
import in.psg.repository.HibernateSpeakerRepositoryImpl;
import in.psg.repository.SpeakerRepository;
import in.psg.service.SpeakerService;
import in.psg.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(); // hard coded
        service.setRepository(getSpeakerRepository());//we are injecting manually
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl(); // hard coded
    }
}
