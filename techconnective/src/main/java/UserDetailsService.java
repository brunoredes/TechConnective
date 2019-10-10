import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bandtec.techconnective.repository.UsuarioRepository;

@Service
public class UserDetailsService implements ReactiveUserDetailsService{
	  @Autowired
	    private UsuarioRepository userRepository;

	    @Override
	    public Mono findByUsername(String username) {
	        return userRepository.findByUsername(username).switchIfEmpty(Mono.defer(() -> Mono.error(new UsernameNotFoundException("User Not Found")))).map(User::toAuthUser);
	    }
}
