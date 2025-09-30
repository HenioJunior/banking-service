package jr.henio.http;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jr.henio.domain.http.AgenciaHttp;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/situacao-cadastral")
@RegisterRestClient(configKey = "situacao-cadastral-api")
public interface SituacaoCadastralHttpService {

    @GET
    @Path("{cnpj}")
    AgenciaHttp buscarPorCnpj(String cnpj);

}
