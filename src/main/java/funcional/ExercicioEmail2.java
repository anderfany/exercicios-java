package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioEmail2 {
    public static void main(String[] args) {

        List<String> listaEmails = Arrays.asList("imeedendorpe1@usa.gov", "dbattram2@google.ru", "bvarden3@jigsy.com", "bmatthias4@sciencedaily.com", "cdarnell5@hugedomains.com", "lflattman6@livejournal.com", "mlippard7@cornell.edu", "lbrome8@google.es", "dmatresse4@google.it", "smayall9@soup.io", "cpenberthya@ask.com", "msandeson0@google.com", "apinnijar1@github.io", "rziehms2@aboutads.info", "jjakubowsky3@privacy.gov.au", "dmatresse4@google.it", "cdaniells5@tiny.cc", "carnaudi6@smh.com.au", "mhumes7@tamu.edu", "cdullard8@ycombinator.com", "ibriztman9@craigslist.org", "dmuntj@nytimes.com", "hdunkerlyb@meetup.com", "cstanelandc@e-recht24.de", "vhartnupd@xrea.com", "pinnote@soup.io", "dgippsf@google.com", "sharvettg@amazon.de", "aroxburghh@google.fr", "rsidnalli@biglobe.ne.jp", "znewsteada@constantcontact.com");


        //listaEmails.forEach( email -> System.out.println(email.split("@")[0]));


        listaEmails.stream()
                .map( email -> { return email.split("@")[0];} )

                .collect(Collectors.joining(", "));


    }


}
