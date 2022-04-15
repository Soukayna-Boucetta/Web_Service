import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args){
        BanqueService stubws=new BanqueWS().getBanqueServicePort();
        System.out.println(stubws.conversionEruoToDH(800));
        Compte cp=stubws.getCompte(2L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> cptes=stubws.listCompte();
        cptes.forEach(c->{
            System.out.println("______________________");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());

        });
    }
}
