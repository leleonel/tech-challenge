package br.com.fiap.techchallenge.config;

import br.com.fiap.techchallenge.domain.port.ClientePort;
import br.com.fiap.techchallenge.domain.port.PagamentoPort;
import br.com.fiap.techchallenge.domain.port.PedidoPort;
import br.com.fiap.techchallenge.domain.port.ProdutoPort;
import br.com.fiap.techchallenge.domain.service.ClienteService;
import br.com.fiap.techchallenge.domain.service.PagamentoService;
import br.com.fiap.techchallenge.domain.service.PedidoService;
import br.com.fiap.techchallenge.domain.service.ProdutoService;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Beans {


    @Bean
    ClienteService service(ClientePort port){
        return new ClienteService(port);
    }

    @Bean
    ProdutoService produtoService(ProdutoPort port){
        return new ProdutoService(port);
    }

    @Bean
    PedidoService pedidoService(PedidoPort port){return new PedidoService(port);}

    @Bean
    PagamentoService pagamentoService(PagamentoPort port){return new PagamentoService(port);}

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Desafio Tech Challenge Fiap Lanchonete")
                        .version("1.0.0")
                        .description("API para pedido de autoatendimento para lanchonete, " +
                                "utilizando Spring Boot, Jpa e arquitetura Hexagonal."));
    }



}
