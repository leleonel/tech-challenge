package br.com.fiap.techchallenge.domain.port;

import com.google.zxing.WriterException;
import com.mercadopago.exceptions.MPException;

import java.io.IOException;

public interface PagamentoPort {
    String criarQRCode(Long id)throws MPException, WriterException, IOException;
}
