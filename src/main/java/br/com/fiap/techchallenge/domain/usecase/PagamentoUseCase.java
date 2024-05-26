package br.com.fiap.techchallenge.domain.usecase;

import com.google.zxing.WriterException;
import com.mercadopago.exceptions.MPException;

import java.io.IOException;

public interface PagamentoUseCase {

    String gerarQrCode(Long id) throws MPException, IOException, WriterException;
}
