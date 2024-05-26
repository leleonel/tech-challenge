package br.com.fiap.techchallenge.domain.service;

import br.com.fiap.techchallenge.domain.port.PagamentoPort;
import com.google.zxing.WriterException;
import com.mercadopago.exceptions.MPException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PagamentoServiceTest {

    @Mock
    private PagamentoPort port;

    @InjectMocks
    private PagamentoService pagamentoService;

    private final Long pedidoId = 1L;
    private final String qrCode = "fakeQRCode";

    @Test
    void testGerarQrCode() throws MPException, IOException, WriterException {
        when(port.criarQRCode(pedidoId)).thenReturn(qrCode);

        String result = pagamentoService.gerarQrCode(pedidoId);

        assertEquals(qrCode, result);
        verify(port, times(1)).criarQRCode(pedidoId);
    }
}
