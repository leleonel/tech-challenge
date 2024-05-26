package br.com.fiap.techchallenge.domain.service;

import br.com.fiap.techchallenge.domain.port.PagamentoPort;
import br.com.fiap.techchallenge.domain.usecase.PagamentoUseCase;
import com.google.zxing.WriterException;
import com.mercadopago.exceptions.MPException;
import lombok.AllArgsConstructor;

import java.io.IOException;

@AllArgsConstructor
public class PagamentoService implements PagamentoUseCase {

    PagamentoPort port;

    @Override
    public String gerarQrCode(Long id) throws MPException, IOException, WriterException {
        return port.criarQRCode(id);
    }
}
