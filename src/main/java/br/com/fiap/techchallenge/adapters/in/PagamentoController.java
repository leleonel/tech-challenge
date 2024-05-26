package br.com.fiap.techchallenge.adapters.in;

import br.com.fiap.techchallenge.domain.service.PagamentoService;
import com.google.zxing.WriterException;
import com.mercadopago.exceptions.MPException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/gerar_pagamento")
public class PagamentoController {

    @Autowired
    PagamentoService service;

    @GetMapping("/{id}")
    public ResponseEntity<String> retornarPagamento(@PathVariable("id") Long id) throws MPException, IOException, WriterException {
        return ResponseEntity.ok().body(service.gerarQrCode(id));
    }

}
