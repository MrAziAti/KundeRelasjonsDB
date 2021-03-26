package kunderelasjonsdatabase.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KundeKontroller {

    @Autowired
    KundeRepository rep;


    @GetMapping("/lagre")
    public void lagreKunde(Kunde innKunde){

        rep.lagreKunde(innKunde);
    }
    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle(){

        return rep.hentAllekunder();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){

        rep.slettAlleKunder();
    }

}
