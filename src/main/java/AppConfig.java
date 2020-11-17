import in.psg.model.Speaker;
import in.psg.repository.HibernateSpeakerRepositoryImpl;
import in.psg.repository.SpeakerRepository;
import in.psg.service.SpeakerService;
import in.psg.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"in.psg"})
public class AppConfig {


}
